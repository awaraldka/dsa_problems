package questions

fun maxFrequencyElements(nums: IntArray): Int {

    val arr = hashMapOf<Int, Int>()

    for (i in nums) {
        arr[i] = arr.getOrDefault(i, 0) + 1
    }

    var maxFreq = 0

    for (freq in arr.values) {
        maxFreq = maxOf(maxFreq, freq)
    }

    var ans = 0

    for (freq in arr.values) {
        if (freq == maxFreq) {
            ans += freq
        }
    }

    return ans
}