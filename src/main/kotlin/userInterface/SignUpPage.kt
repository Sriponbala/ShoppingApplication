package userInterface

import backend.CustomerActivities
import utils.Helper
import java.lang.Exception

class SignUpPage {

    private var name: String = ""
    private var mobile: Long = 0
    private var email: String? = null
    private var password: String = ""
    private var rePassword: String = ""
    fun signUp() {
        println("----------SignUp Page----------")
        try {
            getCustomerDetails()
            println("Submit: (y/n)")
            var flag = true
            while(flag) {
                val choice = readLine()!!
                when(choice.lowercase()[0]) {
                    'y' -> {
                        val customerActivity = CustomerActivities()
                        customerActivity.createAccount(name,mobile,email,password)
                        println("Successful SignUp!")
                        flag = false
                    }
                    'n' -> {
                        flag = false
                    }
                    else -> {
                        println("Enter proper input!")
                    }
                }
            }
        } catch (exception: Exception) {
            println("Class SignUpPage: signUp(): Exception: $exception")
        }
    }

    private fun getCustomerDetails() {

        do{
            println("Enter name: ")
            name = readLine()!!
        }while(Helper.fieldValidation(name))

        do{
            println("Enter mobile number: ")
            val temporaryNumber = readLine()!!
            mobile = temporaryNumber.toLong() // NumberFormatException
        }while (Helper.fieldValidation(temporaryNumber))

        println("Enter email: ")
        email = readLine()

        do{
            println("Enter password: ")
            password = readLine()!!
        }while (Helper.fieldValidation(password))

        do{
            println("Enter re password: ")
            rePassword = readLine()!!
        }while (Helper.fieldValidation(rePassword) || Helper.validatePassword(password,rePassword))
    }

  //  private fun verifyAccount(mobile: Int): Boolean { }


}