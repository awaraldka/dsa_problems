package questions

//Input: nums = [3,2,2,3], val = 3
//Output: 2, nums = [2,2,_,_]


fun removeElement(nums: IntArray, `val`: Int): Int {
    var k = 0
    for (i in nums.indices) {
        if (nums[i] != `val`) {
            nums[k] = nums[i]
            k++
        }

    }

    return k
}
