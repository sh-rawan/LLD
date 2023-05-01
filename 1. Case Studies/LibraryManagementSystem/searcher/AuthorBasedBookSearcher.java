package LibraryManagementSystem.searcher;

import java.util.List;

import LibraryManagementSystem.book.BookCopy;

public class AuthorBasedBookSearcher implements BookSearcher{
    
    private final List<String> bookName;

    public AuthorBasedBookSearcher(List<String> bookName){
        this.bookName = bookName;
    }

    public List<BookCopy> search(){
        return null;
    }

}
