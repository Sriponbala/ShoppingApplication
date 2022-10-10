package backend

import database.Customer

class CustomerActivities {

    companion object {
        private var customer: Customer? = null
    }

    fun createAccount(name: String, mobile: Long, email: String?, password: String) {
        customer = Customer(name,mobile,email,password)
    }

    fun getCustomerDetails(): Customer? {
        return customer
    }

}