package kenhoang.ui.bookmanager;


import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BookController {

    public ImageView imgBack;
    public TableColumn colSTT;
    public TableColumn colIDBook;
    public TableColumn colNameBook;
    public TableColumn colAuthor;
    public TableColumn colCat;
    public TableColumn colYearPublish;
    public TableColumn colQty;
    public TableColumn colDesc;

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
}
