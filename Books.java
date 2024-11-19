class Books {

public class Books {
    private int booksId;      
    private String title;     
    private String author;    

    public Books(int booksId, String title, String author) {
        this.bookId = booksId;
        this.title = title;
        this.author = author;
    }

    public int getBooksId() {
        return booksId;
    }

    public void setBookId(int booksId) {
        this.booksId = booksId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String displayInfo() {
        return "Book ID: " + booksId + ", Title: " + title + ", Author: " + author;
    }
}

    public void displayInfo() {
        System.out.println("Book ID: " + bookid);
        System.out.println("Book Name: " + bookname);
        System.out.println("Aurthor: " + aurthor);
    }
}

