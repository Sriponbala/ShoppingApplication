package userInterface

import interfaces.BuyNow

class B(shop: A) : BuyNow by shop{ // this allows accessing the methods of interface BuyNow only and not class A's methods

}

fun main(){
    B(A()).buyNow()
}

