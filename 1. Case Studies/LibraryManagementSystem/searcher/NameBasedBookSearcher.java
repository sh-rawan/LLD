package LibraryManagementSystem.searcher;

import java.util.List;

import LibraryManagementSystem.book.BookCopy;

public class NameBasedBookSearcher implements BookSearcher{

    private final String bookName;

    public NameBasedBookSearcher(String bookName){
        this.bookName = bookName;
    }

    public List<BookCopy> search(){
        return null;
    }
}
