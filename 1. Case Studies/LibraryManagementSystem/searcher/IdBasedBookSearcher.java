package LibraryManagementSystem.searcher;

import java.util.List;

import LibraryManagementSystem.book.BookCopy;

public class IdBasedBookSearcher implements BookSearcher{
    
    private final int id;
    public IdBasedBookSearcher(int id){
        this.id = id;
    }

    public List<BookCopy> search(){
        return null;
    }
}
