package linklist

fun findMiddle(head: ListNode?): ListNode? {
    var slow = head
    var fast = head

    while(fast != null && fast.next != null) {
        slow = slow?.next
        fast = fast.next!!.next
    }
    return slow

}