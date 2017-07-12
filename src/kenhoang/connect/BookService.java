package kenhoang.connect;

import kenhoang.model.BookModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by kenhoang on 7/11/17.
 */
public class BookService {
    public static Connection connection = ConnectAccess.getConnect("CSDL/dbThuVien.accdb");

    /**
     * Lấy toàn bộ sách
     * @return listBooks
     */
    public ArrayList<BookModel> getAllBook() {
        ArrayList<BookModel> listBooks = new ArrayList<>();
        try {
            String sql = "SELECT * FROM tblBook";
            PreparedStatement preStatement = connection.prepareStatement(sql);
            ResultSet result = preStatement.executeQuery();
            while (result.next()) {
                //Get Data from tblTable
                BookModel bookModel = new BookModel();
                bookModel.setID(result.getInt(1));
                bookModel.setIdBook(result.getString(2));
                bookModel.setIdCat(result.getString(3));
                bookModel.setNameBook(result.getString(4));
                bookModel.setISBN(result.getString(5));
                bookModel.setNameAuthor(result.getString(6));
                bookModel.setPublishBook(result.getString(7));
                bookModel.setYearPublishBook(result.getDate(8));
                bookModel.setPagesCountBook(result.getInt(9));
                bookModel.setPriceBook(result.getString(10));
                bookModel.setDateArrived(result.getDate(11));
                bookModel.setQty(result.getInt(12));
                bookModel.setBorrowed(result.getInt(13));
                bookModel.setLoseAndBad(result.getInt(14));
                bookModel.setDesc(result.getString(15));
                bookModel.setActive(result.getBoolean(16));
                bookModel.setIdLocation(result.getInt(17));

                listBooks.add(bookModel);
            }
        } catch (Exception ex) {
            Logger.getLogger(BookService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listBooks;
    }

    /**
     * Thêm sách
     * @param bookModel
     * @return preStatement.executeUpdate();
     */
    public int addBook (BookModel bookModel) {
        try {
            String sql = "INSERT INTO tblBook" +
                    " (idBook, idCat, nameBook, ISBN, nameAuthor, publishBook, yearPublishBook," +
                    " pagesCountBook, priceBook, dateArrived, qty, borrowed, loseAndBad, desc, Active," +
                    " idLocation) " +
                    "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)  ";

            PreparedStatement preStatement = connection.prepareStatement(sql);

            preStatement.setString(1, bookModel.getIdBook());
            preStatement.setString(2, bookModel.getIdCat());
            preStatement.setString(3, bookModel.getNameBook());
            preStatement.setString(4, bookModel.getISBN());
            preStatement.setString(5, bookModel.getNameAuthor());
            preStatement.setString(6, bookModel.getPublishBook());
            preStatement.setDate(7, bookModel.getYearPublishBook());
            preStatement.setInt(8, bookModel.getPagesCountBook());
            preStatement.setString(9, bookModel.getPriceBook());
            preStatement.setDate(10, bookModel.getDateArrived());
            preStatement.setInt(11, bookModel.getQty());
            preStatement.setInt(12, bookModel.getBorrowed());
            preStatement.setInt(13, bookModel.getLoseAndBad());
            preStatement.setString(14, bookModel.getDesc());
            preStatement.setBoolean(15, bookModel.isActive());
            preStatement.setInt(16, bookModel.getIdLocation());

            return preStatement.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return -1;
    }

    /***
     * Cập nhật sách
     * @param bookModel
     * @return preStatement.executeUpdate();
     */
    public int handleUpdateBook(BookModel bookModel) {
        try {
            String sql = "UPDATE tblBook SET " +
                    " idBook = ?, idCat = ?, nameBook = ?, ISBN = ?, nameAuthor = ?, publishBook = ?," +
                    " yearPublishBook = ?, pagesCountBook = ?, priceBook = ?, dateArrived = ?, " +
                    " qty = ?, borrowed = ?, loseAndBad = ?, desc = ?, Active = ?, idLocation = ?" +
                    " WHERE ID = ?";

            PreparedStatement preStatement = connection.prepareStatement(sql);
            preStatement.setString(1, bookModel.getIdBook());
            preStatement.setString(2, bookModel.getIdCat());
            preStatement.setString(3, bookModel.getNameBook());
            preStatement.setString(4, bookModel.getISBN());
            preStatement.setString(5, bookModel.getNameAuthor());
            preStatement.setString(6, bookModel.getPublishBook());
            preStatement.setDate(7, bookModel.getYearPublishBook());
            preStatement.setInt(8, bookModel.getPagesCountBook());
            preStatement.setString(9, bookModel.getPriceBook());
            preStatement.setDate(10, bookModel.getDateArrived());
            preStatement.setInt(11, bookModel.getQty());
            preStatement.setInt(12, bookModel.getBorrowed());
            preStatement.setInt(13, bookModel.getLoseAndBad());
            preStatement.setString(14, bookModel.getDesc());
            preStatement.setBoolean(15, bookModel.isActive());
            preStatement.setInt(16, bookModel.getIdLocation());
            //where
            preStatement.setInt(17  , bookModel.getID());

            return preStatement.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return -1;
    }

    /**
     * Cập nhật số lượng sách
     * @param bookModel
     * @return preStatement.executeUpdate();
     */
    public int handleQTYBook(BookModel bookModel) {
        try {
            String sql = "UPDATE tblBook SET " +
                    " qty = ? " +
                    " WHERE idBook = ?";

            PreparedStatement preStatement = connection.prepareStatement(sql);
            preStatement.setInt(1, bookModel.getQty());
            //where
            preStatement.setString(2, bookModel.getIdBook());

            return preStatement.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return -1;
    }

    /**
     * Xóa sách
     * @param bookModel
     * @return
     */
    public int removeBook(BookModel bookModel) {
        try {
            String sql = "DELETE FROM tblBook WHERE ID = ?";

            PreparedStatement preStatement = connection.prepareStatement(sql);
            //where
            preStatement.setInt(1, bookModel.getID());
            return preStatement.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return -1;
    }
}
