import algorithms.Algorithm
import java.lang.Exception

class Changer (money: Money){

    var money: Money = money
    var coins: List<Int>? = null
    var algorithm: Algorithm = Algorithm.Greedy
    var successful: Boolean = false
        get() = coins != null

    fun change(): Boolean {
        coins = null
        try{
            when(algorithm){
                Algorithm.Greedy ->{
                    coins = algorithms.greedy(this)
                }
                else -> {
                    println("Undefined or not implemented yet algorithm")
                }
            }
        }catch(e: Exception){
            error("Something happened during the change")
        }
        return successful
    }


    override fun toString(): String {
        return if(successful)
            "Changer(money=$money, coins=$coins)"
        else
            "No operation performed yet"
    }
}