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