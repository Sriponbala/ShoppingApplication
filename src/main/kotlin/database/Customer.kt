package database

data class Customer(var name: String, var mobile: Long, var email: String?, var password: String) {
    lateinit var yourOrders: MutableList<String>
    lateinit var shippingAddress: String
}
