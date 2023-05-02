package LibraryManagementSystem.searcher;

import java.util.List;

import LibraryManagementSystem.book.BookCopy;
import LibraryManagementSystem.dataaccessor.DbAccessor;
import LibraryManagementSystem.dataaccessor.ResultsConvertor;

public class NameBasedBookSearcher implements BookSearcher{

    private final String bookName;
    private final DbAccessor dbAccessor;

    public NameBasedBookSearcher(String bookName){
        this.bookName = bookName;
        this.dbAccessor = new DbAccessor();
    }

    public List<BookCopy> search(){
        List<BookCopy> bookCopies = ResultsConvertor.convertTBookCopies(dbAccessor.getBooksWithName(bookName));
        return bookCopies;
    }
}
