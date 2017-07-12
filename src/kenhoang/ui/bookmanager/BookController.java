package kenhoang.ui.bookmanager;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import kenhoang.connect.BookService;
import kenhoang.connect.CategoryService;
import kenhoang.model.BookModel;
import kenhoang.model.BookTbl;
import kenhoang.model.CategoryModel;
import kenhoang.refresh.IDataSet;

import javax.xml.soap.Detail;
import java.io.IOException;
import java.net.URL;
import java.sql.Date;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BookController implements Initializable, IDataSet{

    public ImageView imgBack;
    public TableView<BookTbl> tblBook;
    public TableColumn<BookTbl, Integer> colSTT;
    public TableColumn<BookTbl, String> colIDBook;
    public TableColumn<BookTbl, String> colNameBook;
    public TableColumn<BookTbl, String> colAuthor;
    public TableColumn<BookTbl, String> colCat;
    public TableColumn<BookTbl, String> colYearPublish;
    public TableColumn<BookTbl, Integer> colQty;
    public TableColumn<BookTbl, Boolean> colState;
    //Service
    BookService bookService;
    CategoryService categoryService;
    ArrayList<BookModel> arrBooks;
    ArrayList<CategoryModel> arrCategory;
    ArrayList<BookTbl> arrTblBook = new ArrayList<>();
    //Data
    private ObservableList<BookTbl> data = FXCollections.observableArrayList();;
    public void goBack(MouseEvent mouseEvent) {
        try {
            imgBack.getScene().getWindow().hide();
            Stage dashboardStage = new Stage();
            dashboardStage.setTitle("Home");
            Parent root = FXMLLoader.load(getClass().getResource("/kenhoang/ui/dashboard/DashboardUI.fxml"));
            Scene scene = new Scene(root);
            dashboardStage.setScene(scene);
            dashboardStage.setMaximized(true);
            dashboardStage.show();
        } catch (IOException ex) {
            Logger.getLogger(BookController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        addDataTable();
        refreshDataTableBook();
        tblBook.setItems(data);
    }

    private void addDataTable() {
        //Fill data table
        colSTT.setCellValueFactory(cellData -> cellData.getValue().STTProperty().asObject());
        colIDBook.setCellValueFactory(cellData -> cellData.getValue().maSachProperty());
        colNameBook.setCellValueFactory(cellData -> cellData.getValue().tenSachProperty());
        colAuthor.setCellValueFactory(cellData -> cellData.getValue().tacGiaProperty());
        colCat.setCellValueFactory(cellData -> cellData.getValue().maLoaiSachProperty());
        colYearPublish.setCellValueFactory(cellData -> cellData.getValue().namXuatBanProperty());
        colQty.setCellValueFactory(cellData -> cellData.getValue().soLuongProperty().asObject());
        colState.setCellValueFactory(cellData -> cellData.getValue().trangThaiProperty());
        //Set checkbox colState
        colState.setCellFactory(param -> new CheckBoxTableCell<BookTbl, Boolean>());

    }

    @Override
    public void refreshDataTableBook() {
        bookService = new BookService();
        arrBooks = bookService.getAllBook();
        categoryService = new CategoryService();
        data.clear();
        int index = 0;
        for (int i = 0; i < arrBooks.size(); i++) {
            index++;
            BookModel bookModel = arrBooks.get(i);
            int id = bookModel.getID();
            String idBook = bookModel.getIdBook();
            String nameBook = bookModel.getNameBook();
            String nameAuthor = bookModel.getNameAuthor();
            String idCat = bookModel.getIdCat();
            Date yearPublish = bookModel.getYearPublishBook();
            int qty = bookModel.getQty();
            boolean state = bookModel.isActive();
            BookTbl bookTbl = new BookTbl();
            bookTbl.setID(id);
            bookTbl.STTProperty().setValue(index);
            bookTbl.maSachProperty().setValue(idBook);
            bookTbl.tenSachProperty().setValue(nameBook);
            bookTbl.tacGiaProperty().setValue(nameAuthor);
            bookTbl.maLoaiSachProperty().setValue(idCat);
            bookTbl.namXuatBanProperty().setValue(String.valueOf(yearPublish));
            bookTbl.soLuongProperty().setValue(qty);
            bookTbl.trangThaiProperty().setValue(state);
            data.add(bookTbl);
        }
    }
}
