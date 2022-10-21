package database

data class Product(val productName: String, val productId: Int, val price: Float) {
    override fun toString(): String {
        return "$productName - $productId - $price"
    }
}
