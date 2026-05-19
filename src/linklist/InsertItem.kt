package linklist

fun insertAtBeginning(head:ListNode?, value:Int){

    val newNode = ListNode(value)
    newNode.next = head
    return traverse(newNode)


}

fun insertAtEnd(head: ListNode?, value: Int):ListNode {
    var newNode = ListNode(value)

    if (head == null) {
        return newNode
    }
    var current = head


    while (current?.next !=null){
        current = current.next
    }

    current?.next = newNode

    return head
}


fun insertAtAPosition(head: ListNode?, value:Int, position: Int): ListNode{
    val newNode = ListNode(value)

    if (position == 0) {
        newNode.next = head
        return newNode
    }

    var current = head
    var index = 1

    while (current?.next != null && index< position -1){
        current = current.next
        index++

    }

    newNode.next = current?.next
    current?.next = newNode

    return head!!
}