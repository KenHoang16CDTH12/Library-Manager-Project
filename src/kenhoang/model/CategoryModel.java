package kenhoang.model;

/**
 * Created by sample on 7/7/17.
 */
public class CategoryModel {
    private int ID;
    private String idCat;
    private String catName;
    private String catDesc;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getIdCat() {
        return idCat;
    }

    public void setIdCat(String idCat) {
        this.idCat = idCat;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getCatDesc() {
        return catDesc;
    }

    public void setCatDesc(String catDesc) {
        this.catDesc = catDesc;
    }

    public CategoryModel(int ID, String idCat, String catName, String catDesc) {
        this.ID = ID;
        this.idCat = idCat;
        this.catName = catName;
        this.catDesc = catDesc;
    }

    public CategoryModel() {
    }
}
