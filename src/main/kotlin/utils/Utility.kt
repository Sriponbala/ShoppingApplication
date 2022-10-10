package utils

import backend.CustomerActivities

object Utility {

    fun validateLoginCredentials(
        mobileNumber: Long,
        currentPassword: String,
        customerActivity: CustomerActivities
    ): Boolean { // mobile number and password
        val customer = customerActivity.getCustomerDetails()
        return (mobileNumber == customer?.mobile) && (currentPassword == customer.password) // when logical operators are used safe call only for first one is enough
    }

}