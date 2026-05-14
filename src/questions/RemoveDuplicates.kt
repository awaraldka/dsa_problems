package questions

fun removeDuplicates(nums: IntArray): Int {
    if (nums.isEmpty()) return 0

    var uniqueIndex = 0

    for (i in 1..<nums.size) {
        if (nums[i] != nums[uniqueIndex]) {
            uniqueIndex++
            nums[uniqueIndex] = nums[i]
        }
    }

    return uniqueIndex + 1
}
