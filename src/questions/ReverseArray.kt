package questions

fun reverseArray(nums: IntArray): IntArray {
    if (nums.isEmpty()) return nums
    var start = 0
    var end = nums.size - 1

    while (start < end) {
        val temp = nums[start]
        nums[start] = nums[end]
        nums[end] = temp

        start++
        end--

    }

    return nums
}