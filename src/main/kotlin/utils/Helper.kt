package utils

object Helper {

    fun fieldValidation(fieldValue: String): Boolean {
        return fieldValue == ""
    }

    fun checkValidRecord(option: Int, size: Int): Boolean {
        return option != 0 && option <= size
    }

    fun validatePassword(password: String, rePassword: String): Boolean {
        return password != rePassword
    }

    fun generateOTP(): Int { return 0 }
}