package questions

fun findPeakElement(nums: IntArray): Int {
    var start = 0
    var end = nums.size - 1
    while (start < end) {
        val mid = start + (end - start) / 2

        println("$mid -> ${nums[mid]}")
        if (nums[mid] > nums[mid + 1]) {
            end = mid
        } else {
            start = mid + 1
        }

    }


    return start
}
