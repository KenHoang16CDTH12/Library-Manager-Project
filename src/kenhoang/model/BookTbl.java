package kenhoang.model;

import javafx.beans.property.*;

/**
 * Created by kenhoang on 7/11/17.
 */
public class BookTbl {
    private int ID;
    private IntegerProperty STT = IntegerProperty.integerProperty(new SimpleIntegerProperty().asObject());
    private StringProperty maSach = new SimpleStringProperty();
    private StringProperty tenSach = new SimpleStringProperty();
    private StringProperty tacGia = new SimpleStringProperty();
    private StringProperty maLoaiSach = new SimpleStringProperty();
    private StringProperty namXuatBan = new SimpleStringProperty();
    private IntegerProperty soLuong = IntegerProperty.integerProperty(new SimpleIntegerProperty().asObject());
    private BooleanProperty trangThai = new SimpleBooleanProperty(false);

    public BookTbl() {
    }

    public BookTbl(int ID, IntegerProperty STT, StringProperty maSach, StringProperty tenSach, StringProperty tacGia, StringProperty maLoaiSach, StringProperty namXuatBan, IntegerProperty soLuong, BooleanProperty trangThai) {
        this.ID = ID;
        this.STT = STT;
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.maLoaiSach = maLoaiSach;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
        this.trangThai = trangThai;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getSTT() {
        return STT.get();
    }

    public IntegerProperty STTProperty() {
        return STT;
    }

    public void setSTT(int STT) {
        this.STT.set(STT);
    }

    public String getMaSach() {
        return maSach.get();
    }

    public StringProperty maSachProperty() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach.set(maSach);
    }

    public String getTenSach() {
        return tenSach.get();
    }

    public StringProperty tenSachProperty() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach.set(tenSach);
    }

    public String getTacGia() {
        return tacGia.get();
    }

    public StringProperty tacGiaProperty() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia.set(tacGia);
    }

    public String getMaLoaiSach() {
        return maLoaiSach.get();
    }

    public StringProperty maLoaiSachProperty() {
        return maLoaiSach;
    }

    public void setMaLoaiSach(String maLoaiSach) {
        this.maLoaiSach.set(maLoaiSach);
    }

    public String getNamXuatBan() {
        return namXuatBan.get();
    }

    public StringProperty namXuatBanProperty() {
        return namXuatBan;
    }

    public void setNamXuatBan(String namXuatBan) {
        this.namXuatBan.set(namXuatBan);
    }

    public int getSoLuong() {
        return soLuong.get();
    }

    public IntegerProperty soLuongProperty() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong.set(soLuong);
    }

    public boolean isTrangThai() {
        return trangThai.get();
    }

    public BooleanProperty trangThaiProperty() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai.set(trangThai);
    }
}
