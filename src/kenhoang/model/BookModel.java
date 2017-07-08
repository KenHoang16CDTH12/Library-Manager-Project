package kenhoang.model;


import java.sql.Date;

/**
 * Created by sample on 7/7/17.
 */
public class BookModel {
    private int ID;
    private String idBook;
    private int idCat;//Category ID
    private String nameBook;
    private String ISBN;//QR Code
    private String nameAuthor;
    private String publishBook;
    private Date yearPublishBook;
    private int pagesCountBook;
    private String priceBook;
    private Date dateArrived;
    private int qty;//number book
    private int borrowed;//Config
    private int loseAndBad;//Config
    private String desc;//Content
    private boolean active;
    private int idLocation;//Location ID

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

    public int getIdCat() {
        return idCat;
    }

    public void setIdCat(int idCat) {
        this.idCat = idCat;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public String getPublishBook() {
        return publishBook;
    }

    public void setPublishBook(String publishBook) {
        this.publishBook = publishBook;
    }

    public Date getYearPublishBook() {
        return yearPublishBook;
    }

    public void setYearPublishBook(Date yearPublishBook) {
        this.yearPublishBook = yearPublishBook;
    }

    public int getPagesCountBook() {
        return pagesCountBook;
    }

    public void setPagesCountBook(int pagesCountBook) {
        this.pagesCountBook = pagesCountBook;
    }

    public String getPriceBook() {
        return priceBook;
    }

    public void setPriceBook(String priceBook) {
        this.priceBook = priceBook;
    }

    public Date getDateArrived() {
        return dateArrived;
    }

    public void setDateArrived(Date dateArrived) {
        this.dateArrived = dateArrived;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getBorrowed() {
        return borrowed;
    }

    public void setBorrowed(int borrowed) {
        this.borrowed = borrowed;
    }

    public int getLoseAndBad() {
        return loseAndBad;
    }

    public void setLoseAndBad(int loseAndBad) {
        this.loseAndBad = loseAndBad;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getIdLocation() {
        return idLocation;
    }

    public void setIdLocation(int idLocation) {
        this.idLocation = idLocation;
    }

    public BookModel() {
    }

    public BookModel(int ID, String idBook, int idCat, String nameBook, String ISBN, String nameAuthor, String publishBook, Date yearPublishBook, int pagesCountBook, String priceBook, Date dateArrived, int qty, int borrowed, int loseAndBad, String desc, boolean active, int idLocation) {
        this.ID = ID;
        this.idBook = idBook;
        this.idCat = idCat;
        this.nameBook = nameBook;
        this.ISBN = ISBN;
        this.nameAuthor = nameAuthor;
        this.publishBook = publishBook;
        this.yearPublishBook = yearPublishBook;
        this.pagesCountBook = pagesCountBook;
        this.priceBook = priceBook;
        this.dateArrived = dateArrived;
        this.qty = qty;
        this.borrowed = borrowed;
        this.loseAndBad = loseAndBad;
        this.desc = desc;
        this.active = active;
        this.idLocation = idLocation;
    }
}
