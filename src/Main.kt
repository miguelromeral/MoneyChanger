
fun main(args: Array<String>)
{
    val test1: Money = Money(60, listOf(50, 20, 20, 10))
    val machine = Changer(test1)
    println("Money: $test1")
    machine.money = test1
    machine.change()
    println("Machine: $machine")

}