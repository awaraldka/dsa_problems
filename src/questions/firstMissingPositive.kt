package questions

fun firstMissingPositive(nums: IntArray): Int {
    var index = 0

    while (index < nums.size) {
        val correct = nums[index]

        if (correct < 1 || correct > nums.size) {
            index++
            continue
        }
        if (nums[index] == nums[correct - 1]) {
            index++
        } else {
            swapValues(nums, index, correct - 1)
        }

    }
    var count = 1


    for (num in nums) {
        if (num == count) {
            count++
        }
    }

    return count
}

private fun swapValues(array: IntArray, index: Int, correct: Int) {
    var temp = array[correct]
    array[correct] = array[index]
    array[index] = temp
}

