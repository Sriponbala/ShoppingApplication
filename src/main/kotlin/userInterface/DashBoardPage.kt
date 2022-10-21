package userInterface

import enums.DashBoard
import utils.Helper

class DashBoardPage {
    fun showDashBoard() {

        while (true) {
            println("----------Dashboard----------")
            for(element in DashBoard.values()) {
                println("${element.ordinal+1}.$element")
            }
            try {
                val option = readLine()!!
                val dashBoardOption = option.toInt()
                if(Helper.checkValidRecord(dashBoardOption, DashBoard.values().size)) {
                    if(dashBoardActivities(DashBoard.values()[dashBoardOption-1])) {
                        break
                    }
                } else {
                    println("Enter valid option!")
                }
            } catch (exception: Exception) {
                println("Class DashboardPage: showDashBoard(): Exception: $exception")
            }
        }

    }

    private fun dashBoardActivities(dashBoardEntry: DashBoard): Boolean {

        when(dashBoardEntry) {
            DashBoard.SHOP_BY_CATEGORY -> {
                ShoppingPage().shoppingActivities()
                return false
            }
            DashBoard.VIEW_CART -> {
                ViewCart().displayCartItems()
                return false
            }
            DashBoard.YOUR_ACCOUNT -> {
                CustomerAccountPage().showCustomerAccountPageProfile()
                return false
            }
            DashBoard.SIGNOUT -> {
                println("Signed out...")
                return true
            }
            else -> {
                println("Invalid dashboard option!")
                return false
            }
        }
    }
}