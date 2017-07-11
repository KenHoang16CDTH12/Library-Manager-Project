package kenhoang.ui.dashboard;

import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import kenhoang.connect.AgentService;
import kenhoang.model.AgentModel;
import kenhoang.notification.ShowNotification;
import kenhoang.ui.login.LoginController;
import kenhoang.util.StringConfig;

import javax.management.Notification;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by kenhoang on 7/9/17.
 */
public class OverviewController implements Initializable{
    public Group groupBookManager;
    public Label lblName;
    public Label lblRole;
    public Label lblUsername;
    public Label lblAgentID;
    public Label lblEmail;
    public Label lblPhone;

    AgentModel agentModel;
    AgentService agentService;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        fillData();
        addEvents();
    }

    private void fillData() {
        agentModel = agentService.InforAgent(LoginController.ID_AGENT);
        String name = "";
        if (agentModel.getMidName() == null) {
            name += "";
        } else {
            name += agentModel.getMidName();
        }
        if (agentModel.getFirstName() == null) {
            name += "";
        } else {
            name += " " + agentModel.getFirstName();
        }
        lblName.setText(name);
        switch (agentModel.getLevel()) {
            case 1:
                lblRole.setText(StringConfig.ADMIN);
                break;
            case 2:
                lblRole.setText(StringConfig.AGENTS);
                break;
            case 3:
                lblRole.setText(StringConfig.STUDENTS);
                break;
            default:
                lblRole.setText(StringConfig.GUEST);
        }
        lblUsername.setText(agentModel.getAgentUID());
        lblAgentID.setText(agentModel.getAgentID());
        lblEmail.setText(agentModel.getEmail());
        String phone = agentModel.getPhone();
        lblPhone.setText("+84 " + phone.substring(1));

    }

    private void addEvents() {
        groupBookManager.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                handleClickBookManger();
            }
        });
    }
    //Xử lý mở giảo diện quản lý sách
    private void handleClickBookManger() {
        groupBookManager.getScene().getWindow().hide();
        try {
            Stage bookStage = new Stage();
            bookStage.setTitle("Quản lý sách");
            Parent root = FXMLLoader.load(getClass().getResource("/kenhoang/ui/bookmanager/BookUI.fxml"));
            Scene scene = new Scene(root);
            bookStage.setScene(scene);
            bookStage.setMaximized(true);
            bookStage.show();
        } catch (IOException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
