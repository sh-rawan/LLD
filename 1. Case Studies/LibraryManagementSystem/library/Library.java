package LibraryManagementSystem.library;

import java.util.List;

import LibraryManagementSystem.book.BookCopy;
import LibraryManagementSystem.dataaccessor.DbAccessor;
import LibraryManagementSystem.dataaccessor.ResultsConvertor;
import LibraryManagementSystem.user.Member;

public class Library {

    private final DbAccessor dbAccessor;
    public Library(){
        this.dbAccessor = new DbAccessor();
    }

    public void addBookCopy(BookCopy bookCopy){
        // validation logics...

        dbAccessor.insertBookCopy(bookCopy);
    }
    public void deleteBookCopy(BookCopy bookCopy){}
    public void blockMember(Member member){}
    public void issueBook(BookCopy bookCopy, Member member){}
    public void submitBook(BookCopy bookCopy, Member member){}
    public Member getBorrower(BookCopy bookCopy){
        return ResultsConvertor.convertToMember(dbAccessor.getBorrower(bookCopy));
    }
    public List<BookCopy> getBorrowedBooks(Member member){

        // same goes here
        return null;
    }
}
