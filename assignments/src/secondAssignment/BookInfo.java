//7. Create a class Book which describes its Book_title and Book_price. Use getter and
//setter Methods to get & set the Books description. Implement createBook and
//showBook methods to create and display Book Information. Write a separate class
//BookInfo to access the Book class

package secondAssignment;


class Book{
	private String bookTitle;
	private int bookPrice;
	
	void Setter(int bookPrice, String bookTitle) {
		this.bookTitle = bookTitle;
		this.bookPrice = bookPrice;
	}
	void Getter() {
		System.out.println(bookTitle + " Book is for Rs. " + bookPrice);
	}
}
public class BookInfo {

	public static void main(String[] args) {
		Book book = new Book();
		book.Setter(100, "All of Us");
		book.Getter();
	}

}
