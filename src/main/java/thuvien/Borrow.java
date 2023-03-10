package thuvien;

import java.util.Date;

public class Borrow {
    public boolean status;
    public Date dateBorrow;
    public Date dateReturn;

    public Borrow(boolean status, Date dateBorrow, Date dateReturn){
        this.status = status;
        this.dateBorrow = dateBorrow;
        this.dateReturn = dateReturn;
    }

    public boolean isStatus() {
        return status;
    }

    public Date getDateBorrow() {
        return dateBorrow;
    }

    public Date getDateReturn() {
        return dateReturn;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setDateBorrow(Date dateBorrow) {
        this.dateBorrow = dateBorrow;
    }

    public void setDateReturn(Date dateReturn) {
        this.dateReturn = dateReturn;
    }

    @Override
    public String toString() {
        return "Borrow{" +
                "status=" + status +
                ", dateBorrow=" + dateBorrow +
                ", dateReturn=" + dateReturn +
                '}';
    }
}
