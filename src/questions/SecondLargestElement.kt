package questions

fun secondLargestElement(nums: IntArray): Int {
    var first =  Int.MIN_VALUE
    var second = Int.MIN_VALUE

    for (number in nums){
        if (number > first){
            second = first
            first = number
        }else if(number > second && number != first){
            second = number
        }


    }

    return second
}