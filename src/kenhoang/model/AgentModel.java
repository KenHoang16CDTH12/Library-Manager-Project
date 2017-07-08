package kenhoang.model;

import java.io.Serializable;

/**
 * Created by sample on 7/7/17.
 */
public class AgentModel implements Serializable{
    private int ID;
    private String agentID;
    private String agentUID;
    private String agentPWD;
    private String lastName;
    private String midName;
    private String firstName;
    private String address;
    private String phone;
    private String email;
    private int level;
    private boolean active;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getAgentID() {
        return agentID;
    }

    public void setAgentID(String agentID) {
        this.agentID = agentID;
    }

    public String getAgentUID() {
        return agentUID;
    }

    public void setAgentUID(String agentUID) {
        this.agentUID = agentUID;
    }

    public String getAgentPWD() {
        return agentPWD;
    }

    public void setAgentPWD(String agentPWD) {
        this.agentPWD = agentPWD;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMidName() {
        return midName;
    }

    public void setMidName(String midName) {
        this.midName = midName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public AgentModel(int ID, String agentID, String agentUID, String agentPWD, String lastName, String midName, String firstName, String address, String phone, String email, int level, boolean active) {
        this.ID = ID;
        this.agentID = agentID;
        this.agentUID = agentUID;
        this.agentPWD = agentPWD;
        this.lastName = lastName;
        this.midName = midName;
        this.firstName = firstName;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.level = level;
        this.active = active;
    }

    public AgentModel() {
    }
}
