package LibraryManagementSystem.searcher;

import java.util.List;

import LibraryManagementSystem.book.BookCopy;

public interface BookSearcher {

    public List<BookCopy> search();
}
