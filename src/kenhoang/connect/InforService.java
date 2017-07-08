package kenhoang.connect;


import kenhoang.connect.ConnectAccess;
import kenhoang.model.Infor;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 * Created by sample on 20/03/2017.
 */
public class InforService {
    public static Connection connection = ConnectAccess.getConnect("CSDL/dbThuVienOld.accdb");
    public ArrayList<Infor> getAllStudents()
    {
        ArrayList<Infor> listStudents = new ArrayList<Infor>();
        try{
            String sql = "select * from ThongTin" ;
            PreparedStatement preStatement = connection.prepareStatement(sql);
            ResultSet result = preStatement.executeQuery();
            while(result.next()){
                String date = String.valueOf(result.getDate(2));
                String[] sDate = date.split("-");
                String year = sDate[0].trim();
                String month = sDate[1].trim();
                String day = sDate[2].trim();
                String dayMonthYear = day + "/" + month + "/" + year;
                Infor infor = new Infor();
                infor.setSTT(result.getInt(1));
                infor.setNgayMuon(dayMonthYear);
                infor.setMaSinhVien(result.getString(3));
                infor.setHoVaTen(result.getString(4));
                infor.setLop(result.getString(5));
                infor.setSachMuon(result.getString(6));
                infor.setKyHieu(result.getString(7));
                infor.setDaTra(result.getBoolean(8));
                listStudents.add(infor);
            }

        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return listStudents;
    }
    public int addStudents(Infor tv) {
        try{
            String sql="insert into ThongTin (NgayMuon, MaSV, HoTen, Lop, TenSach, KyHieu, DaTra) " +
                    "values (?, ?, ?, ?, ?, ?, ?)  ";
            String date = tv.getNgayMuon();
            String[] sDate = date.split("/");
            String year = sDate[2].trim();
            String month = sDate[1].trim();
            String day = sDate[0].trim();
            String yearMonthDay = year + "-" + month + "-" + day;

            PreparedStatement preStatement = connection.prepareStatement(sql);
            //preStatement.setDate(1, Date.valueOf(tv.getNgayMuon()));
            preStatement.setDate(1, Date.valueOf(yearMonthDay));
            preStatement.setString(2, tv.getMaSinhVien());
            preStatement.setString(3, tv.getHoVaTen());
            preStatement.setString(4, tv.getLop());
            preStatement.setString(5, tv.getSachMuon());
            preStatement.setString(6, tv.getKyHieu());
            preStatement.setBoolean(7, tv.isDaTra());
            return preStatement.executeUpdate();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return -1;
    }

    public ArrayList<Infor> FilterListStudents (boolean daTra) {
        ArrayList<Infor> listStudents = new ArrayList<Infor>();
        try {
            String sql = "select * from ThongTin where DaTra = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setBoolean(1, daTra);
            ResultSet result = preparedStatement.executeQuery();
            while(result.next())
            {
                String date = String.valueOf(result.getDate(2));
                String[] sDate = date.split("-");
                String year = sDate[0].trim();
                String month = sDate[1].trim();
                String day = sDate[2].trim();
                String dayMonthYear = day + "/" + month + "/" + year;
                Infor inforStudents = new Infor();
                inforStudents.setSTT(result.getInt(1));
                inforStudents.setNgayMuon(String.valueOf(dayMonthYear));
                inforStudents.setMaSinhVien(result.getString(3));
                inforStudents.setHoVaTen(result.getString(4));
                inforStudents.setLop(result.getString(5));
                inforStudents.setSachMuon(result.getString(6));
                inforStudents.setKyHieu(result.getString(7));
                inforStudents.setDaTra(result.getBoolean(8));
                listStudents.add(inforStudents);
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return listStudents;
    }
    public int handleUpdate(Infor infor) {
        try{
            String sql= "UPDATE ThongTin SET NgayMuon = ? ,MaSV = ?, HoTen = ?, Lop = ?, TenSach = ?, KyHieu = ?, DaTra = ? WHERE STT = ?";
            String date = infor.getNgayMuon();
            String[] sDate = date.split("/");
            String year = sDate[2].trim();
            String month = sDate[1].trim();
            String day = sDate[0].trim();
            String yearMonthDay = year + "-" + month + "-" + day;
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setDate(1, Date.valueOf(yearMonthDay));
            preparedStatement.setString(2,infor.getMaSinhVien());
            preparedStatement.setString(3,infor.getHoVaTen());
            preparedStatement.setString(4,infor.getLop());
            preparedStatement.setString(5,infor.getSachMuon());
            preparedStatement.setString(6, infor.getKyHieu());
            preparedStatement.setBoolean(7, infor.isDaTra());
            preparedStatement.setInt(8,infor.getSTT());
            return preparedStatement.executeUpdate();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return -1;
    }
    public int deleteRow(Infor inforStudents) {
        try {
            String sql = "DELETE FROM ThongTin WHERE STT = ?";
            PreparedStatement preStatement = connection.prepareStatement(sql);
            preStatement.setInt(1, inforStudents.getSTT());
            return preStatement.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return -1;
    }
    public ArrayList<Infor>findBookFromIDStudents(String idStudents)
    {
        ArrayList<Infor> listStudents=new ArrayList<Infor>();
        try
        {
            idStudents = idStudents
                    .replace("!", "!!")
                    .replace("%", "!%")
                    .replace("_", "!_")
                    .replace("[", "![");
            String sql = "SELECT * FROM ThongTin WHERE maSV LIKE ?  " +
                    " OR " +
                    "HoTen LIKE ?  " +
                    " OR " +
                    "Lop LIKE ?  " +
                    " OR " +
                    "TenSach LIKE ?  " +
                    " OR " +
                    "KyHieu LIKE ?  " +
                    " OR " +
                    "NgayMuon LIKE ?";
            PreparedStatement preStatement = connection.prepareStatement(sql);

            preStatement.setString(1, "%" + idStudents + "%");
            preStatement.setString(2, "%" + idStudents + "%");
            preStatement.setString(3, "%" + idStudents + "%");
            preStatement.setString(4, "%" + idStudents + "%");
            preStatement.setString(5, "%" + idStudents + "%");
            preStatement.setString(6, "%" + idStudents + "%");

            ResultSet result=preStatement.executeQuery();
            while(result.next())
            {
                String date = String.valueOf(result.getDate(2));
                String[] sDate = date.split("-");
                String year = sDate[0].trim();
                String month = sDate[1].trim();
                String day = sDate[2].trim();
                String dayMonthYear = day + "/" + month + "/" + year;
                Infor inforStudents = new Infor();
                inforStudents.setSTT(result.getInt(1));
                inforStudents.setNgayMuon(String.valueOf(dayMonthYear));
                inforStudents.setMaSinhVien(result.getString(3));
                inforStudents.setHoVaTen(result.getString(4));
                inforStudents.setLop(result.getString(5));
                inforStudents.setSachMuon(result.getString(6));
                inforStudents.setKyHieu(result.getString(7));
                inforStudents.setDaTra(result.getBoolean(8));
                listStudents.add(inforStudents);
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return listStudents;
    }
}