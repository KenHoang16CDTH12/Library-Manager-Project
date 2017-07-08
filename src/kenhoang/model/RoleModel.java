package kenhoang.model;

/**
 * Created by sample on 7/7/17.
 */
public class RoleModel {
    private int ID;
    private int idRole;
    private String roleName;
    private String roleDesc;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getIdRole() {
        return idRole;
    }

    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    public RoleModel(int ID, int idRole, String roleName, String roleDesc) {
        this.ID = ID;
        this.idRole = idRole;
        this.roleName = roleName;
        this.roleDesc = roleDesc;
    }

    public RoleModel() {
    }
}
