package kenhoang.ui.login;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import kenhoang.io.FileFactory;


public class LoginUIMain extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("LoginUI.fxml"));
        Parent root = loader.load();
        LoginController controller = loader.getController();
        Scene scene = new Scene(root, 700, 400);
        scene.getStylesheets().add(getClass().getResource("LoginUI.css").toExternalForm());
        primaryStage.setTitle("HueIC Library");
        primaryStage.setScene(scene);
        primaryStage.show();
        //handle save data kenhoang.ui.dashboard.login
        FileFactory.showInforSave(controller);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
