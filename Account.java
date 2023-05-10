package Bai1;

import java.text.NumberFormat;
import java.util.Locale;

public class Account {
    private double SoTien;
    private int SoTk;
    private String TenTk;
    private String TrangThaiTk;

    public Account() {
    }

    public Account(int SoTk, String TenTk) {
        this.SoTk = SoTk;
        this.TenTk = TenTk;
    }

    public Account(double SoTien, int SoTk, String TenTk) {
        this.SoTien = SoTien;
        this.SoTk = SoTk;
        this.TenTk = TenTk;
    }

    public double getSoTien() {
        return SoTien;
    }

    public int getSoTk() {
        return SoTk;
    }

    public String getTenTk() {
        return TenTk;
    }

    public String getTrangThaiTk() {
        return TrangThaiTk;
    }

    public void setSoTien(double SoTien) {
        if(SoTien>0){
           this.SoTien = SoTien;
        }
    }

    public void setSoTk(int SoTk) {
        if(SoTk>0 || SoTk != 99999999){
            this.SoTk = SoTk;    
        }
    }

    public void setTenTk(String TenTk) {
        if(TenTk != null){
            this.TenTk = TenTk;
        }
    }

    public void setTrangThaiTk(String TrangThaiTk) {
        this.TrangThaiTk = TrangThaiTk;
    }
    
    public String toString(){
        Locale local = new Locale("vi", "vn");
        NumberFormat formatter = NumberFormat.getCurrencyInstance(local);
        String str1 = formatter.format(SoTien);
        return  "So tai khoan: "+ SoTk + " - Ten tai khoan: " + TenTk + " - so tien trong tai khoan: " + SoTien;
    } 
}
