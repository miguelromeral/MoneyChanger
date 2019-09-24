class Money (val quantity: Int, val coins: List<Int>){

    override fun toString(): String {
        return "Money(quantity=$quantity, coins=$coins)"
    }
}