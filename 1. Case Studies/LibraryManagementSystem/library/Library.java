package LibraryManagementSystem.library;

import java.util.List;

import LibraryManagementSystem.book.BookCopy;

public class Library {
    // private Library(){}

    public void addBookCopy(BookCopy bookCopy){}
    public void deleteBookCopy(BookCopy bookCopy){}
    public void blockMember(Member member){}
    public void issueBook(BookCopy bookCopy, Member member){}
    public void submitBook(BookCopy bookCopy, Member member){}
    public Member getBorrower(BookCopy bookCopy){}
    public List<BookCopy> getBorrowedBooks(Member member){}
}
