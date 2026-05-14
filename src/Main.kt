import questions.findDuplicate
import questions.findErrorNums
import questions.removeDuplicates

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val data = intArrayOf(1,1,2,4,4,5,3,2,1)
    val output = findErrorNums(data)
    println(output.joinToString())
}