package database

data class Customer(val name: String, val mobile: Int?, val email: String?, val password: String, val yourOrders: MutableList<String>?) {
    lateinit var shippingAddress: String
}
