package questions


class MountainArray {
    fun get(index: Int): Int {
        TODO("Provide the return value")
    }
    fun length(): Int {
        TODO("Provide the return value")
    }
}


fun findInMountainArray(target: Int, mountainArr: MountainArray): Int {

    val n = mountainArr.length()

    var start = 0
    var end = n - 1

    while (start < end) {
        val mid = (start + end) / 2
        if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
            start = mid + 1
        } else {
            end = mid
        }
    }
    val peak = start

    // STEP 2: Search in ascending part
    val left = binarySearchAsc(mountainArr, target, 0, peak)
    if (left != -1) return left

    // STEP 3: Search in descending part
    return binarySearchDesc(mountainArr, target, peak + 1, n - 1)
}


fun binarySearchAsc(arr: MountainArray, target: Int, l: Int, r: Int): Int {
    var start = l
    var end = r
    while (start <= end) {
        val mid = start + (end - start) /2
        val value = arr.get(mid)
        if (value == target) return mid
        if (value < target) start = mid + 1 else end = mid - 1
    }
    return -1
}


fun binarySearchDesc(arr: MountainArray, target: Int, l: Int, r: Int): Int {
    var start = l
    var end = r
    while (start <= end) {
        val mid = start + (end - start)/2
        val value = arr.get(mid)
        if (value == target) return mid
        if (value > target) start = mid + 1 else end = mid - 1
    }
    return -1
}
