package linklist


fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    var firstList = l1
    var secondList = l2
    var carry = 0

    val dummy = ListNode(0)
    var current: ListNode? = dummy

    while (firstList != null || secondList != null || carry != 0) {
        val currentValue1 = firstList?.`val` ?: 0
        val currentValue2 = secondList?.`val` ?: 0

        val sum = currentValue1 + currentValue2 + carry
        carry = sum / 10
        current!!.next = ListNode(sum % 10)
        current = current.next

        firstList = firstList?.next
        secondList = secondList?.next

    }
    return dummy.next

}
