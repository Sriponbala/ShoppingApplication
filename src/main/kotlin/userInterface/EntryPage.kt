package userInterface

import backend.CustomerActivities
import enums.Entry
import utils.Helper
import kotlin.random.Random

class EntryPage {

    fun showEntryPage() {

        while(true) {
            println("------Online Shopping Application------")
            for(entry in Entry.values()) {
                println("${entry.ordinal + 1}.$entry")
            }
            print("Enter your choice: ")
            try {
                val option = readLine()!! // NumberFormatException
                val entryOption = option.toInt()
                if(Helper.checkValidRecord(entryOption,Entry.values().size)) {
                    val entry: Entry = Entry.values()[entryOption-1]  // ArrayIndexOutOfBoundsException
                    if(!entryPageActivities(entry)) {
                        break
                    }
                } else {
                    println("\nEnter valid option!")
                }
            } catch (exception: Exception) {
                println("Class EntryPage: showEntryPage(): Exception: $exception")
            }
        }
    }

    private fun entryPageActivities(entry: Entry): Boolean {

        val customerActivity = CustomerActivities()
        when(entry) {
            Entry.SIGNUP -> {
                SignUpPage().signUp()
                //signUpPage.signUp()
                return true
            }
            Entry.SIGNIN -> {
                SignInPage().signIn()
                //signInPage.signIn()
                return true
            }
            Entry.EXIT -> {
                println("Thank You! Visit again!")
                return false
            }
            else -> {
                println("Invalid option!") // important to add else i.e. if enum changes then will throw error
                return true
            }
        }
    }
}

