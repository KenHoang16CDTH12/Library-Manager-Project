package kenhoang.ui.dashboard;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import kenhoang.ui.login.ControllerLogin;

/**
 * Created by kenhoang on 7/8/17.
 */
public class DashboardUIMain extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Stage dashboardStage = new Stage();
        dashboardStage.setTitle("");
        Parent root = FXMLLoader.load(getClass().getResource("DashboardUI.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("DashboardUI.css").toExternalForm());
        dashboardStage.setMaximized(true);
        dashboardStage.setScene(scene);
        dashboardStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
