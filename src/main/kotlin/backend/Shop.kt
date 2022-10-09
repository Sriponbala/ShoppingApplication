package backend

import interfaces.BuyNow

class Shop : BuyNow {

    fun addProduct() { }

    fun deleteProduct() { }

    fun addToCart() { }

    fun calculateSubTotal() { }

    override fun buyNow() {
    // call addToHistory()
    }

    fun addToHistory() {
        // yourOrders property of Customer class will be used
    }

}