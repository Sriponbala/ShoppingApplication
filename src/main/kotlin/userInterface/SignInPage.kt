package userInterface

import backend.CustomerActivities
import utils.Helper
import utils.Utility

class SignInPage {

    private var mobile: Long = 0
    private var password: String = ""
    fun signIn() {
        println("----------SignIn Page----------")
        try {
            getCustomerDetails()
            val customerActivity = CustomerActivities()
            if (verifyAccount(mobile,password,customerActivity)) {
                println("Successful SignIn!")
                val dashBoardPage = DashBoardPage()
                dashBoardPage.showDashBoard()
            } else {
                println("SignIn failed!")
            }

        } catch (exception: Exception) {
            println("Class SignInPage: signIn(): Exception: $exception")
        }
    }

    private fun getCustomerDetails() {
        do {
            println("Enter Mobile Number: ")
            val temporaryNumber = readLine()!!
            mobile = temporaryNumber.toLong()
        } while (Helper.fieldValidation(temporaryNumber))

        do {
            println("Enter password: ")
            password = readLine()!!
        } while (Helper.fieldValidation(password))
    }

    private fun verifyAccount(mobile: Long, password: String, customerActivity: CustomerActivities): Boolean {
        return Utility.validateLoginCredentials(mobile,password,customerActivity)
    }
}