package linklist

import java.time.temporal.ValueRange

fun isPalindrome(head: ListNode?): Boolean {

    if (head?.next == null) {
        return true
    }


    var slow = head
    var fast = head
    while (slow !=  null && fast!!.next !=  null) {
        slow = slow.next
        fast = fast.next!!.next
    }


    var prev:ListNode? = null
    var current = slow

    while (current != null) {
        val next = current.next
        current.next = prev
        prev = current
        current = next
    }

    var first=  head
    var second=  prev

    while (second != null) {
        if (first?.`val` != second.`val`) {
            return false
        }
        first = first.next
        second = second.next
    }
    return true
}
