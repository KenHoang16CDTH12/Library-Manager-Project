package kenhoang.model;

/**
 * Created by sample on 7/7/17.
 */
public class CourseModel {
    private int idCourse;
    private String nameCourse;
    private int facultyID;//facultyID
    private String courseDesc;

    public int getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(int idCourse) {
        this.idCourse = idCourse;
    }

    public String getNameCourse() {
        return nameCourse;
    }

    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    public int getFacultyID() {
        return facultyID;
    }

    public void setFacultyID(int facultyID) {
        this.facultyID = facultyID;
    }

    public String getCourseDesc() {
        return courseDesc;
    }

    public void setCourseDesc(String courseDesc) {
        this.courseDesc = courseDesc;
    }

    public CourseModel(int idCourse, String nameCourse, int facultyID, String courseDesc) {
        this.idCourse = idCourse;
        this.nameCourse = nameCourse;
        this.facultyID = facultyID;
        this.courseDesc = courseDesc;
    }

    public CourseModel() {
    }
}
