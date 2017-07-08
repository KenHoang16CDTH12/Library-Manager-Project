package kenhoang.io;

import kenhoang.controller.ControllerLogin;
import kenhoang.model.AgentModel;

import java.io.*;

public class FileFactory {
    public static void saveData(Object data, String path) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(data);
            oos.close();
            fos.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static Object readData(String path) {
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object data = ois.readObject();
            ois.close();
            fis.close();
            return data;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    /**
     * Handle save data login
     * */
    public static void showInforSave(ControllerLogin controller) {
        File file = new File("AgentLogin.data");
        if (file.exists()) {
            Object data = FileFactory.readData("AgentLogin.data");
            if (data != null) {
                AgentModel agentLogin = (AgentModel) data;
                controller.txtUsername.setText(agentLogin.getAgentUID());
                controller.txtPassword.setText(agentLogin.getAgentPWD());
                controller.chkSave.setSelected(true);
            }
        }
    }
}

