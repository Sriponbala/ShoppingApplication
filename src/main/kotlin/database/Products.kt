package database

//class Products private constructor(){
object Products {
    private var categories: MutableMap<String,MutableList<Product>>
   /* companion object{
        private val databaseInstance: Products by lazy {
            Products()
        }
        fun getInstance() = databaseInstance
    }*/


    private val ponniyinSelvanBook1 = Product("Ponniyin Selvan Book 1",1,400f)
    private val ponniyinSelvanBook2 = Product("Ponniyin Selvan Book 2",2,412f)
    private val ponniyinSelvanBook3 = Product("Ponniyin Selvan Book 3",3,400f)
    private val ponniyinSelvanBook4 = Product("Ponniyin Selvan Book 4",4,450f)
    private val ponniyinSelvanBook5 = Product("Ponniyin Selvan Book 5",5,500f)
    private val books = mutableListOf<Product>(ponniyinSelvanBook1,ponniyinSelvanBook2,ponniyinSelvanBook3,ponniyinSelvanBook4,ponniyinSelvanBook5)

    private val iphone14 = Product("iPhone 14 128GB",1,79900f)
    private val samsungGalaxyM33 = Product("Samsung Galaxy M33 5G",2,15499f)
    private val samsungGalaxyS20 = Product("Samsung Galaxy S20 FE 5G", 3, 29900f)
    private val mobiles = mutableListOf<Product>(iphone14,samsungGalaxyM33,samsungGalaxyS20)

    init {
        categories = mutableMapOf("Books" to books, "Mobiles" to mobiles)
    }

    fun getProductsDatabase() = categories

}
