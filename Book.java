public class Book extends Item{

    private int isbn_number;
    private String author;

    public int getIsbn_number() {
        return isbn_number;
    }

    public String getAuthor() {
        return author;
    }

    public void setIsbn_number(int isbn_number) {
        this.isbn_number = isbn_number;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    String getListing() {
        return "Book Name - " + getTitle() + "\nAuthor - " + getAuthor() + "\nISBN# - " + getIsbn_number();
    }

    Book(){}

    Book(int isbn_number, String author, String title) {
        this.isbn_number = isbn_number;
        this.author = author;
        setTitle(title);
    }
}
