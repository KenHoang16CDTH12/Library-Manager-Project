package kenhoang.model;

import java.sql.Date;

/**
 * Created by sample on 7/7/17.
 */
public class BorrowedModel {
    private int ID;
    private String idBook;//Book ID
    private String idUser;
    private Date dateBorrowed;//ngay muon
    private Date dateDue;//ngay het han
    private Date dateReturned;//ngay tra lai
    private int dateDelay;//So ngay tre
    private int fine;//tien phat
    private String note;//Ghi chu
    private String lendedBy;//Agent ID
    private String receivedBy;//Agent ID
    private boolean isReturned;
    private boolean isLost;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getIdBook() {
        return idBook;
    }

    public void setIdBook(String idBook) {
        this.idBook = idBook;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public Date getDateBorrowed() {
        return dateBorrowed;
    }

    public void setDateBorrowed(Date dateBorrowed) {
        this.dateBorrowed = dateBorrowed;
    }

    public Date getDateDue() {
        return dateDue;
    }

    public void setDateDue(Date dateDue) {
        this.dateDue = dateDue;
    }

    public Date getDateReturned() {
        return dateReturned;
    }

    public void setDateReturned(Date dateReturned) {
        this.dateReturned = dateReturned;
    }

    public int getDateDelay() {
        return dateDelay;
    }

    public void setDateDelay(int dateDelay) {
        this.dateDelay = dateDelay;
    }

    public int getFine() {
        return fine;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getLendedBy() {
        return lendedBy;
    }

    public void setLendedBy(String lendedBy) {
        this.lendedBy = lendedBy;
    }

    public String getReceivedBy() {
        return receivedBy;
    }

    public void setReceivedBy(String receivedBy) {
        this.receivedBy = receivedBy;
    }

    public boolean isReturned() {
        return isReturned;
    }

    public void setReturned(boolean returned) {
        isReturned = returned;
    }

    public boolean isLost() {
        return isLost;
    }

    public void setLost(boolean lost) {
        isLost = lost;
    }

    public BorrowedModel(int ID, String idBook, String idUser, Date dateBorrowed, Date dateDue, Date dateReturned, int dateDelay, int fine, String note, String lendedBy, String receivedBy, boolean isReturned, boolean isLost) {
        this.ID = ID;
        this.idBook = idBook;
        this.idUser = idUser;
        this.dateBorrowed = dateBorrowed;
        this.dateDue = dateDue;
        this.dateReturned = dateReturned;
        this.dateDelay = dateDelay;
        this.fine = fine;
        this.note = note;
        this.lendedBy = lendedBy;
        this.receivedBy = receivedBy;
        this.isReturned = isReturned;
        this.isLost = isLost;
    }

    public BorrowedModel() {
    }
}
