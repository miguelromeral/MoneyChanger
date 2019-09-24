package algorithms

import Changer

fun greedy(machine: Changer): List<Int>? {
    return greedy_step(toReturn = machine.money.quantity, remainderCoins = machine.money.coins, selectedCoins = mutableListOf())
}

fun greedy_step(toReturn: Int, remainderCoins: List<Int>, selectedCoins: MutableList<Int>) : List<Int>? {
    if(remainderCoins.size == 0 || toReturn == 0)
        return selectedCoins
    else{
        val first = remainderCoins.first()
        if(toReturn >= first) {
            val newList = selectedCoins
            newList.add(first)
            return greedy_step(toReturn - first, remainderCoins.drop(1), newList)
        }else{
            if(remainderCoins.size == 1)
                return null
            else {
                return greedy_step(toReturn, remainderCoins.drop(1), selectedCoins)
            }
        }
    }
}