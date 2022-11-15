import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> collection;

    public Borrower(){
        this.collection = new ArrayList<Book>();
    }


    public void takeBook(Library library, Book book) {
        library.removeBook(book);
        this.collection.add(book);
    }

    public int countBooks() {
        return this.collection.size();
    }
}
