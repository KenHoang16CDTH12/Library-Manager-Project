package kenhoang.model;

/**
 * Created by sample on 7/7/17.
 */
public class FacultyModel {
    private int idFaculty;
    private String facultyName;
    private String facultyDesc;

    public int getIdFaculty() {
        return idFaculty;
    }

    public void setIdFaculty(int idFaculty) {
        this.idFaculty = idFaculty;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getFacultyDesc() {
        return facultyDesc;
    }

    public void setFacultyDesc(String facultyDesc) {
        this.facultyDesc = facultyDesc;
    }

    public FacultyModel() {
    }

    public FacultyModel(int idFaculty, String facultyName, String facultyDesc) {
        this.idFaculty = idFaculty;
        this.facultyName = facultyName;
        this.facultyDesc = facultyDesc;
    }
}
