package kenhoang.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import kenhoang.connect.AgentService;
import kenhoang.io.FileFactory;
import kenhoang.model.AgentModel;
import kenhoang.notification.ShowNotification;
import kenhoang.util.Config;

import java.io.IOException;
import java.util.Optional;

public class ControllerLogin {
    //Components
    public TextField txtUsername;
    public PasswordField txtPassword;
    public CheckBox chkSave;
    public Button btnLogin;
    public Button btnExit;
    //Stage
    public static Stage tableStage;
    //Model
    public AgentModel AgentLogin = null;
    /**
     * Xử lý sự kiện đăng nhập btnLogin
     * */
    public void handleLogin(ActionEvent event) throws IOException {
        AgentLogin = AgentService.login(txtUsername.getText(), txtPassword.getText());
        if (AgentLogin == null) {
            ShowNotification.notificationError(Config.NOTIFICATIONS_LOGIN, Config.LOGIN_FAILED);
        }
        else {
            //Comment 19:22 7/7
            /*Stage stage = (Stage) btnLogin.getScene().getWindow();
            stage.close();
            showWindow();*/
            ShowNotification.notificationInformation(Config.NOTIFICATIONS_LOGIN, Config.LOGIN_SUCCESS);
        }
        //Xử lý lưu thông tin đăng nhập khi tích vào checkbox.
        if (chkSave.isSelected()) {
            FileFactory.saveData(AgentLogin, "AgentLogin.data");
        }
        else {
            FileFactory.saveData(null, "AgentLogin.data");
        }
    }
    /**
     * Xử lý sự kiện btnExit thoát chương trình.
     * */
    public void handleExit(ActionEvent event) {
        ShowNotification.notificationConfirmation(Config.NOTIFICATION_EXIT, Config.HEADER_EXIT, Config.CONTENT_EXIT);
    }


}
