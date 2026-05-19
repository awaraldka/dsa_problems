package linklist

fun traverse(head: ListNode?){
    var current = head


    while(current!=null){
        println(current.`val`)
        current = current.next
    }
}