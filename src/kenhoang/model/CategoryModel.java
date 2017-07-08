package kenhoang.model;

/**
 * Created by sample on 7/7/17.
 */
public class CategoryModel {
    private int idCat;
    private String catName;
    private String catDesc;

    public int getIdCat() {
        return idCat;
    }

    public void setIdCat(int idCat) {
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

    public CategoryModel(int idCat, String catName, String catDesc) {
        this.idCat = idCat;
        this.catName = catName;
        this.catDesc = catDesc;
    }

    public CategoryModel() {
    }
}
