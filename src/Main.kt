import linklist.ListNode
import linklist.deleteNode
import linklist.detectCycle
import linklist.findMiddle
import linklist.insertAtAPosition
import linklist.insertAtBeginning
import linklist.insertAtEnd
import linklist.reverseList
import linklist.traverse
import questions.findPeakElement
import questions.intToRoman
import questions.isValid
import questions.letterCombinations
import questions.maxFrequencyElements
import questions.moveZeroes
import questions.reverseArray
import questions.rotate
import questions.search
import questions.secondLargestElement

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

fun main() {

    val node1 = ListNode(3)
    val node2 = ListNode(2)
    val node3 = ListNode(0)
    val node4 = ListNode(2)

    // Connect nodes
    node1.next = node2
    node2.next = node3
    node3.next = node4

    // Head of linked list
    val head = node1

    println(detectCycle(head))
}

