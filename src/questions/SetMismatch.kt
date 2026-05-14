package questions

fun findErrorNums(nums: IntArray): IntArray {
    var newArray = intArrayOf()

    var index = 0

    while (index < nums.size) {
        val correct = nums[index]
        if (nums[index] == nums[correct - 1]) {
            index++
        } else {
            swapValues(nums, index, correct - 1)
        }

    }
    for (ind in nums.indices) {
        if (nums[ind] != ind + 1) {
            newArray += nums[ind]
            newArray += (ind + 1)
        }
    }

    return newArray
}

private fun swapValues(nums: IntArray, index: Int, correct: Int) {
    val temp = nums[correct]
    nums[correct] = nums[index]
    nums[index] = temp
}
