package thuvien;

public class Borrow {
    public boolean status;
    public int dateBorrow;
    public int dateReturn;

    public Borrow(boolean status, int dateBorrow, int dateReturn){
        this.status = status;
        this.dateBorrow = dateBorrow;
        this.dateReturn = dateReturn;
    }

    public void setDateBorrow(int dateBorrow) {
        this.dateBorrow = dateBorrow;
    }

    public int getDateBorrow() {
        return dateBorrow;
    }

    public int getDateReturn() {
        return dateReturn;
    }

    public void setDateReturn(int dateReturn) {
        this.dateReturn = dateReturn;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
