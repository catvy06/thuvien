package thuvien;

public class BorrowDetails {
    public int bookId;
    public int memberId;
    public String nameBook;
    public String nameMember;

    public BorrowDetails(int bookId, int memberId, String nameBook,String nameMember){
        this.bookId = bookId;
        this.memberId = memberId;
        this.nameBook = nameBook;
        this.nameMember = nameMember;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getNameMember() {
        return nameMember;
    }

    public void setNameMember(String nameMember) {
        this.nameMember = nameMember;
    }
}
