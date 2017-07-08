package kenhoang.ui.login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import kenhoang.connect.AgentService;
import kenhoang.io.FileFactory;
import kenhoang.model.AgentModel;
import kenhoang.notification.ShowNotification;
import kenhoang.util.SoundConfig;
import kenhoang.util.StringConfig;
import kenhoang.util.Util;

import java.io.IOException;

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
    public Label lblUserName;
    public Label lblPassword;
    public ImageView imgUserName;
    public ImageView imgPassWord;
    public TextField tfPassWord;

    /**
     * Xử lý sự kiện đăng nhập btnLogin
     * */
    public void handleLogin(ActionEvent event) throws IOException {
        login();
    }

    private void login() {
        AgentLogin = AgentService.login(txtUsername.getText(), txtPassword.getText());
        if (txtUsername.getText().equals("")) {
            new SoundConfig().Voice(SoundConfig.LOGIN_NOT_INPUT_USER);
            ShowNotification.notificationWarning(StringConfig.NOTIFICATIONS_LOGIN, StringConfig.LOGIN_NOT_USERNAME);
        } else {
            if (AgentLogin == null) {
                new SoundConfig().Voice(SoundConfig.LOGIN_ERROR);
                ShowNotification.notificationError(StringConfig.NOTIFICATIONS_LOGIN, StringConfig.LOGIN_FAILED);
            }
            else {
                //Comment 19:22 7/7
            /*Stage stage = (Stage) btnLogin.getScene().getWindow();
            stage.close();
            showWindow();*/
                ShowNotification.notificationInformation(StringConfig.NOTIFICATIONS_LOGIN, StringConfig.LOGIN_SUCCESS);
            }
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
        new SoundConfig().Voice(SoundConfig.LOGIN_EXIT);
        ShowNotification.notificationConfirmation(StringConfig.NOTIFICATION_EXIT, StringConfig.HEADER_EXIT, StringConfig.CONTENT_EXIT);
    }
    @FXML
    public void initialize() {
        Util util = new Util();
        util.iconClean(imgUserName, txtUsername);
        util.iconPass(imgPassWord, tfPassWord, txtPassword);
    }
    @FXML
    private void passWordEnter(KeyEvent e) {
        if (KeyCode.ENTER == e.getCode()) {
            login();
        }
    }
}
