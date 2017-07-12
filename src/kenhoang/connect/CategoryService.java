package kenhoang.connect;


import kenhoang.model.CategoryModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 * Created by kenhoang on 7/11/17.
 */
public class CategoryService {
    public static Connection connection = ConnectAccess.getConnect("CSDL/dbThuVien.accdb");

    /**
     * Lấy toàn bộ looại sách
     * @return listCategorys
     */
    public ArrayList<CategoryModel> getAllBook() {
        ArrayList<CategoryModel> listCategorys = new ArrayList<>();
        try {
            String sql = "SELECT * FROM tblCategory";
            PreparedStatement preStatement = connection.prepareStatement(sql);
            ResultSet result = preStatement.executeQuery();
            while (result.next()) {
                //Get Data from tblCategory
                CategoryModel categoryModel = new CategoryModel();
                categoryModel.setID(result.getInt(1));
                categoryModel.setIdCat(result.getString(2));
                categoryModel.setCatName(result.getString(3));
                categoryModel.setCatDesc(result.getString(4));

                listCategorys.add(categoryModel);
            }
         }
        catch(Exception ex){
             ex.printStackTrace();
         }
            return listCategorys;
    }

    /**
     * Thêm loại sách
     * @param categoryModel
     * @return preStatement.executeUpdate();
     */
    public int addCategorys (CategoryModel categoryModel) {
        try {
            String sql = "INSERT INTO tblCategory" +
                    " (idCat, CatName, catDesc) " +
                    "values (?, ?, ?)  ";

            PreparedStatement preStatement = connection.prepareStatement(sql);

            preStatement.setString(1, categoryModel.getIdCat());
            preStatement.setString(2, categoryModel.getCatName());
            preStatement.setString(3, categoryModel.getCatDesc());

            return preStatement.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return -1;
    }
    /***
     * Cập nhật loại sách
     * @param categoryModel
     * @return preStatement.executeUpdate();
     */
    public int handleUpdateCategorys(CategoryModel categoryModel) {
        try {
            String sql = "UPDATE tblCategory SET " +
                    " idCat = ?, CatName = ?, catDesc = ?" +
                    " WHERE ID = ?";

            PreparedStatement preStatement = connection.prepareStatement(sql);
            preStatement.setString(1, categoryModel.getIdCat());
            preStatement.setString(2, categoryModel.getCatName());
            preStatement.setString(3, categoryModel.getCatDesc());
            //where
            preStatement.setInt(16, categoryModel.getID());

            return preStatement.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return -1;
    }

    /**
     * Xóa loại
     * @param categoryModel
     * @return
     */
    public int removeBook(CategoryModel categoryModel) {
        try {
            String sql = "DELETE FROM tblCategory WHERE ID = ?";

            PreparedStatement preStatement = connection.prepareStatement(sql);
            //where
            preStatement.setInt(1, categoryModel.getID());
            return preStatement.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return -1;
    }

}
