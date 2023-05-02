package LibraryManagementSystem.dataaccessor;

import java.lang.reflect.Member;
import java.util.List;

import LibraryManagementSystem.book.BookCopy;

public class DbAccessor {
    public Results getBooksWithName(String bookName){

        return null;
    }

    public Results getBooksWithAuthorName(List<String> authors){

        return null;
    }

    public Results getMembersWithName(String memberName){

        return null;
    }

    public void insertBookCopy(BookCopy bookCopy){

    }

    public void deleteBookCopy(BookCopy bookCopy){

    }

    public void markAsBloked(Member member){

    }

    public void issueBookCopyToMembers(BookCopy bookCopy, Member member){

    }

    public void submitBookcopyFromMember(BookCopy bookCopy, Member member){

    }

    public boolean isBookAvailable(BookCopy bookCopy){
        return true;
    }

    public Results getBorrower(BookCopy bookCopy){
        return null;
    }

    public Results getBorrowedBooksOfMember(Member member){
        return null;
    }

}
