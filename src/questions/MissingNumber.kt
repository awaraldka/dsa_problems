package questions

fun missingNumber(nums: IntArray): Int {

    var sum = 0
    for (number in nums) {
        sum += number
    }
    return nums.size * (nums.size + 1) / 2 - sum

}


