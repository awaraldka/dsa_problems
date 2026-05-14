package questions

fun productExceptSelf(nums: IntArray): IntArray {
    val n = nums.size
    val result = IntArray(n)
    val left = IntArray(n)
    val right = IntArray(n)
    left[0] = 1
    for (i in 1..<n) {
        left[i] = left[i - 1] * nums[i - 1]
    }

    right[n - 1] = 1
    for (i in n - 2 downTo 0) {
        right[i] = right[i + 1] * nums[i + 1]
    }

    for (i in 0..<n) {
        result[i] = left[i] * right[i]
    }

    return result
}
