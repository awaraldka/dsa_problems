package linklist

import java.time.temporal.IsoFields

fun detectCycle(head: ListNode?): Boolean{

    var slow=  head
    var fast= head

    while(fast != null && fast.next!=null){
        slow = slow!!.next
        fast = fast.next!!.next

        if (fast ==slow){
            return true
        }
    }
    return false

}