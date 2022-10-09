package userInterface

import interfaces.BuyNow

class A : BuyNow {

    fun a() {}

    override fun buyNow() {
        println("Buy now function with delegation")
    }
}