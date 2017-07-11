package kenhoang.connect;


import kenhoang.model.AgentModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Created by sample on 7/7/17.
 */
public class AgentService {
    public static Connection connection = ConnectAccess.getConnect("CSDL/dbThuVien.accdb");
    //Hàm kenhoang.ui.dashboard.login (Kiểm tra đăng nhập thành công thì lấy dữ liệu của người đăng nhập)
    public static AgentModel login(String userName, String passWord) {
        AgentModel agent = null;
        try {
            String sql = "SELECT * FROM tblAgent WHERE agentUID = ? AND agentPWD = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, userName);
            preparedStatement.setString(2, passWord);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                agent = new AgentModel();
                agent.setID(resultSet.getInt("ID"));
                agent.setAgentID(resultSet.getString("agentID"));
                agent.setAgentUID(resultSet.getString("agentUID"));
                agent.setAgentPWD(resultSet.getString("agentPWD"));
                agent.setLastName(resultSet.getString("lastName"));
                agent.setMidName(resultSet.getString("midName"));
                agent.setFirstName(resultSet.getString("firstName"));
                agent.setAddress(resultSet.getString("Address"));
                agent.setPhone(resultSet.getString("Phone"));
                agent.setEmail(resultSet.getString("Email"));
                agent.setLevel(resultSet.getInt("Level"));
                agent.setActive(resultSet.getBoolean("Active"));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return agent;
    }
    public static AgentModel InforAgent(int idAgent) {
        AgentModel agent = null;
        try {
            String sql = "SELECT * FROM tblAgent WHERE ID = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, idAgent);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                agent = new AgentModel();
                agent.setID(resultSet.getInt("ID"));
                agent.setAgentID(resultSet.getString("agentID"));
                agent.setAgentUID(resultSet.getString("agentUID"));
                agent.setAgentPWD(resultSet.getString("agentPWD"));
                agent.setLastName(resultSet.getString("lastName"));
                agent.setMidName(resultSet.getString("midName"));
                agent.setFirstName(resultSet.getString("firstName"));
                agent.setAddress(resultSet.getString("Address"));
                agent.setPhone(resultSet.getString("Phone"));
                agent.setEmail(resultSet.getString("Email"));
                agent.setLevel(resultSet.getInt("Level"));
                agent.setActive(resultSet.getBoolean("Active"));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return agent;
    }
}