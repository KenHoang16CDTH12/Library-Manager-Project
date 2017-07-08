package kenhoang.model;

import javafx.beans.property.*;

/**
 * Created by sample on 5/28/17.
 */
public class Infor {
    private int STT;
    private IntegerProperty iD = IntegerProperty.integerProperty(new SimpleIntegerProperty().asObject());
    private StringProperty ngayMuon = new SimpleStringProperty();
    private StringProperty maSinhVien = new SimpleStringProperty();
    private StringProperty hoVaTen = new SimpleStringProperty();
    private StringProperty lop = new SimpleStringProperty();
    private StringProperty sachMuon = new SimpleStringProperty();
    private StringProperty kyHieu  = new SimpleStringProperty();
    private BooleanProperty daTra = new SimpleBooleanProperty(false);

    public Infor() {
    }

    public Infor(int STT, IntegerProperty iD, StringProperty ngayMuon, StringProperty maSinhVien, StringProperty hoVaTen, StringProperty lop, StringProperty sachMuon, StringProperty kyHieu, BooleanProperty daTra) {
        this.STT = STT;
        this.iD = iD;
        this.ngayMuon = ngayMuon;
        this.maSinhVien = maSinhVien;
        this.hoVaTen = hoVaTen;
        this.lop = lop;
        this.sachMuon = sachMuon;
        this.kyHieu = kyHieu;
        this.daTra = daTra;
    }

    public int getSTT() {
        return STT;
    }

    public void setSTT(int STT) {
        this.STT = STT;
    }

    public int getiD() {
        return iD.get();
    }

    public IntegerProperty iDProperty() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD.set(iD);
    }

    public String getNgayMuon() {
        return ngayMuon.get();
    }

    public StringProperty ngayMuonProperty() {
        return ngayMuon;
    }

    public void setNgayMuon(String ngayMuon) {
        this.ngayMuon.set(ngayMuon);
    }

    public String getMaSinhVien() {
        return maSinhVien.get();
    }

    public StringProperty maSinhVienProperty() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien.set(maSinhVien);
    }

    public String getHoVaTen() {
        return hoVaTen.get();
    }

    public StringProperty hoVaTenProperty() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen.set(hoVaTen);
    }

    public String getLop() {
        return lop.get();
    }

    public StringProperty lopProperty() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop.set(lop);
    }

    public String getSachMuon() {
        return sachMuon.get();
    }

    public StringProperty sachMuonProperty() {
        return sachMuon;
    }

    public void setSachMuon(String sachMuon) {
        this.sachMuon.set(sachMuon);
    }

    public String getKyHieu() {
        return kyHieu.get();
    }

    public StringProperty kyHieuProperty() {
        return kyHieu;
    }

    public void setKyHieu(String kyHieu) {
        this.kyHieu.set(kyHieu);
    }

    public boolean isDaTra() {
        return daTra.get();
    }

    public BooleanProperty daTraProperty() {
        return daTra;
    }

    public void setDaTra(boolean daTra) {
        this.daTra.set(daTra);
    }
}
