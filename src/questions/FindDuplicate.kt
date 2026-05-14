package questions

fun findDuplicate(nums: IntArray): Int {
    var index = 0

    while (index < nums.size) {

        var currentValue = nums[index]

        if (nums[index] != nums[currentValue - 1]) {
            swapValue(nums, index, currentValue - 1)
        } else {
            index++
        }

    }
    return nums[nums.size - 1]
}

fun swapValue(nums: IntArray, index: Int, correct: Int) {
    val temp = nums[correct]
    nums[correct] = nums[index]
    nums[index] = temp

}
