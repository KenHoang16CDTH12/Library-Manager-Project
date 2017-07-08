package kenhoang.main;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import kenhoang.controller.ControllerLogin;
import kenhoang.io.FileFactory;

import java.io.IOException;

/**
 * Created by kenhoang on 7/8/17.
 */
public class ShowWindow {
    public void LoginUI(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/kenhoang/ui/UILogin.fxml"));
        Parent root = loader.load();
        ControllerLogin controller = loader.getController();
        Scene scene = new Scene(root, 700, 400);
        scene.getStylesheets().add(getClass().getResource("/kenhoang/css/application.css").toExternalForm());
        primaryStage.setTitle("HueIC Library");
        primaryStage.setScene(scene);
        primaryStage.show();
        //handle save data login
        FileFactory.showInforSave(controller);
    }
}
