package LibraryManagementSystem.tester;

import java.util.*;

import LibraryManagementSystem.auth.UserAuthenticator;
import LibraryManagementSystem.book.BookCopy;
import LibraryManagementSystem.book.BookDetails;
import LibraryManagementSystem.id.IDGenerator;
import LibraryManagementSystem.library.Library;
import LibraryManagementSystem.searcher.AuthorBasedBookSearcher;
import LibraryManagementSystem.searcher.BookSearcher;
import LibraryManagementSystem.searcher.IdBasedBookSearcher;
import LibraryManagementSystem.searcher.IdBasedMemberSearcher;
import LibraryManagementSystem.searcher.MemberSearcher;
import LibraryManagementSystem.searcher.NameBasedBookSearcher;
import LibraryManagementSystem.searcher.NameBasedMemberSearcher;

public class Tester {
    public List<BookCopy> searchBooksByBookName(String bookName) {
        if(bookName == null)
            throw new IllegalArgumentException("Book name can not be null");

        // chk
        NameBasedBookSearcher bookSearcher1 = new NameBasedBookSearcher(bookName);
        BookSearcher bookSearcher = bookSearcher1;
        return bookSearcher.search();
    }

    public List<BookCopy> listBooksByAuthorName(List<String> authorNames){
        if(authorNames == null || authorNames.size() == 0)
            throw new IllegalArgumentException("Author name can not be empty");

        BookSearcher bookSearcher = new AuthorBasedBookSearcher(authorNames);
        return bookSearcher.search();
    }

    public List<Member> searchMemberByName(String memberName, String adminToken) throws IllegalAccessException {
        if(!UserAuthenticator.isAdmin(adminToken))
            throw new IllegalAccessException("Operation forbidden");
        if(memberName == null)
            throw new IllegalArgumentException("Author name can not be null");
        
        MemberSearcher memberSearcher = new NameBasedMemberSearcher(memberName);
        return memberSearcher.search();
    }

    public void addBook(String bookName, Date publicationDate, List<String> authors, String adminToken) throws IllegalAccessException{
        if(!UserAuthenticator.isAdmin(adminToken))
            throw new IllegalAccessException("Operation forbidden");

        // Validation based logic here, verify if the book name already exists!!

        BookCopy bookCopy = new BookCopy(new BookDetails(bookName, publicationDate, authors), IDGenerator.generateID());
        
        // why library() why not library here
        new Library().addBookCopy(bookCopy);
    }

    public void deleteBook(int bookCopyId, String adminToken) throws IllegalAccessException{
        if(!UserAuthenticator.isAdmin(adminToken))
            throw new IllegalAccessException("Operation forbidden");

        BookSearcher bookSearcher = new IdBasedBookSearcher(bookCopyId);
        BookCopy bookCopy = bookSearcher.search().get(0);
        // Do the validation here id book copy is not null
        
        new Library().deleteBookCopy(bookCopy);
    }

    public void blockMember(int memberId, String adminToken){
        if(memberId < 0 || adminToken == null || adminToken.length() == 0){
            // throw exception
        }

        if(!UserAuthenticator.isAdmin(adminToken)){}
            // throw exception

        MemberSearcher memberSearcher = new IdBasedMemberSearcher(memberId);
        List<Member> mem = memberSearcher.search();
        if(mem == null || mem.size == 0){}
            // throw exception

        new Library().blockMember(mem.get(0));
    }

    public void issueBook(int bookCopyId, int memberId, String adminToken){}

    public void returnBook(int bookCopyId, int memberId, String adminToken){} 

    public Member getBorrowerOfBook(int bookId, String adminToken){}

    public List<Member> getBooksBorrowedByMember(int memberId, String adminToken){}
}
