package kenhoang.main;

import javafx.application.Application;
import javafx.stage.Stage;


public class Main extends Application {
    private ShowWindow showWindow;
    @Override
    public void start(Stage primaryStage) throws Exception{
        showWindow = new ShowWindow();
        //Hiển thị login ui
        showWindow.LoginUI(primaryStage);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
