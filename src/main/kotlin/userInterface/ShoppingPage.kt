package userInterface

import database.Product
import database.Products
import utils.Helper

class ShoppingPage {

    private lateinit var categories: MutableMap<String,MutableList<Product>>
    private var categoryList: MutableList<String> = mutableListOf()
    fun shoppingActivities() {
        try{
            displayCategories()
            val category = getCategory()
            displayProducts(category)
        } catch (exception: Exception) {
            println("Class ShoppingPage: shoppingActivities(): Exception: $exception")
        }

    }

    private fun displayCategories() {
        categories = Products.getProductsDatabase()
        categories.keys.forEachIndexed{ index, category ->
            categoryList.add(category)
            println("${index + 1}.$category")
        }
    }

    private fun getCategory(): String {
        lateinit var categoryChosen: String
        println("Choose category: ")
        val option = readLine()!!
        val categoryOption = option.toInt()
        if(Helper.checkValidRecord(option.toInt(),categories.size)) {
                categoryChosen = categoryList.let {
                    it[categoryOption - 1]
            }
        }
        return categoryChosen
    }
    private fun displayProducts(category: String) {
        println("----------$category----------")
        val products = categories[category]
        products?.run {
            forEachIndexed{
                index, product ->
                println("${index + 1}.$product")
            }
        }
    }
}