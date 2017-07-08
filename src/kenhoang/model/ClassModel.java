package kenhoang.model;

/**
 * Created by sample on 7/7/17.
 */
public class ClassModel {
    private int idClass;
    private int idCourse; //Course ID
    private String className;
    private String classDesc;

    public int getIdClass() {
        return idClass;
    }

    public void setIdClass(int idClass) {
        this.idClass = idClass;
    }

    public int getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(int idCourse) {
        this.idCourse = idCourse;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassDesc() {
        return classDesc;
    }

    public void setClassDesc(String classDesc) {
        this.classDesc = classDesc;
    }

    public ClassModel(int idClass, int idCourse, String className, String classDesc) {
        this.idClass = idClass;
        this.idCourse = idCourse;
        this.className = className;
        this.classDesc = classDesc;
    }

    public ClassModel() {
    }
}
