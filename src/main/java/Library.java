import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private Integer capacity;
    private ArrayList<Book> books;

    public Library(Integer capacity){
        this.books = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int countBooks() {
        return this.books.size();
    }

    public boolean isLibraryFull(){
        if(books.size() >= this.capacity){
            return true;
        }
        return false;
    }

    public void addBook(Book book) {
        boolean full = isLibraryFull();
        if(full){
            return;
        }
        this.books.add(book);
    }

    public void removeBook(Book book) {
        this.books.remove(book);

    }


}
