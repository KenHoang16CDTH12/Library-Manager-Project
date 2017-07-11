package kenhoang.ui.bookmanager;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import kenhoang.io.FileFactory;


public class BookUIMain extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        Stage dashboardStage = new Stage();
        dashboardStage.setTitle("Quản lý sách");
        Parent root = FXMLLoader.load(getClass().getResource("BookUI.fxml"));
        Scene scene = new Scene(root);
        dashboardStage.setMaximized(true);
        dashboardStage.setScene(scene);
        dashboardStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
