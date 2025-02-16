class Book (private var title: String){

    //var title: String = ""
    var author: String = ""
    var yearPublished: Int = 0

    fun getBookInfo(){

        println("$title by $author was publish in $yearPublished")

    }

}
fun main() {

    val myBook = Book("Objects First with Java")

    //myBook.title = "Objects First with Java"
    myBook.author = "David J. Barnes"
    myBook.yearPublished = 2016
    myBook.getBookInfo()

}
