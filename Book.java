public class Book{
	int isbn; // instance
	String title; // instance
	String author; // instance
	static String publisher = "TMH";
    
    // default cons
    public Book(){
    	System.out.println("This is default cons!");
    	}    

    // parameterized cons
    public Book(int isbn, String title){
    	this(); // invoking current class default cons
    	this.isbn = isbn;
    	this.title = title;
    }
    // to accommodate new property - author
    public Book(int isbn, String title, String author){
        this(isbn, title);// invoking current class parameterized cons
        this.author = author;
    }

    void getBook(){
    	System.out.println(isbn+" "+title+" "+publisher+" "+author);
    }

    public static void main(String[] args) {
    	
        Book b1 = new Book(22345,"Java","BG Swamy");
        b1.getBook();
    }
}