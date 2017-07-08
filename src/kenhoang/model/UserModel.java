package kenhoang.model;

import java.sql.Date;

/**
 * Created by sample on 7/7/17.
 */
public class UserModel {
    private int ID;
    private String idUser;
    private String lastName;
    private String midName;
    private String firstName;
    private Date birthday;
    private String address;
    private String phone;
    private String email;
    private int idClass;//Class ID
    private int cardType;//Card ID
    private boolean active;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
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

    public int getIdClass() {
        return idClass;
    }

    public void setIdClass(int idClass) {
        this.idClass = idClass;
    }

    public int getCardType() {
        return cardType;
    }

    public void setCardType(int cardType) {
        this.cardType = cardType;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public UserModel(int ID, String idUser, String lastName, String midName, String firstName, Date birthday, String address, String phone, String email, int idClass, int cardType, boolean active) {
        this.ID = ID;
        this.idUser = idUser;
        this.lastName = lastName;
        this.midName = midName;
        this.firstName = firstName;
        this.birthday = birthday;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.idClass = idClass;
        this.cardType = cardType;
        this.active = active;
    }

    public UserModel() {
    }
}
