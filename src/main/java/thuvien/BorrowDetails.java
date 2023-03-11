package thuvien;

public class BorrowDetails {
    public int id;
    public  int BorrowId;
    public int bookId;
    public int memberId;

    public BorrowDetails(int id, int borrowId, int bookId, int memberId) {
        this.id = id;
        BorrowId = borrowId;
        this.bookId = bookId;
        this.memberId = memberId;
    }

    public int getId() {
        return id;
    }

    public int getBorrowId() {
        return BorrowId;
    }

    public int getBookId() {
        return bookId;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBorrowId(int borrowId) {
        BorrowId = borrowId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    @Override
    public String toString() {
        return "BorrowDetails{" +
                "id=" + id +
                ", BorrowId=" + BorrowId +
                ", bookId=" + bookId +
                ", memberId=" + memberId +
                '}';
    }
}
