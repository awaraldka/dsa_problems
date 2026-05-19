package questions


fun twoSum(nums: IntArray, target: Int): IntArray {
    var index = 0
    var pointer = 1

    while (index < nums.size - 1) {
        if (pointer >= nums.size) {
            index++
            pointer = index + 1
            continue
        }

        val sum = nums[index] + nums[pointer]

        if (sum == target) {
            return intArrayOf(index, pointer)
        }

        pointer++
    }
    return intArrayOf()
}

private fun repeatedSum(nums: IntArray, target: Int): IntArray {
    var map = hashMapOf<Int, Int>()

    for (i in nums.indices) {
        val diff =  target - nums[i]
        if (map.containsKey(diff)) {
            return intArrayOf(map[diff]!!, i)
        }
        map[nums[i]] = i
    }

    return intArrayOf()
}