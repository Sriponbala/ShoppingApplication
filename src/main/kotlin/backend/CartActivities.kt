package backend

import database.Cart
import interfaces.BuyNow

class CartActivities(val shop: Shop): BuyNow by shop {

    fun calculateSubTotal() { }

    fun createItemsList() { }

}

/*fun main() {
    CartActivities(Shop()).buyNow()
}*/