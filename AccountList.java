package Bai1;

import java.nio.file.attribute.AclEntry;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class AccountList {
    private ArrayList<Account> ac;
    Scanner sc = new Scanner(System.in);
    Account account;
    
    public AccountList(){
        super();
        ac = new ArrayList<Account>();
    }
    
    public void NapTien(Account a,double soTienNap){
            a.setSoTien(a.getSoTien() + soTienNap);
        }
       
    public void ChonNapTien(int sotk,double sotiennap){
        long d;
        for (int i = 0; i<this.ac.size(); i++) {
            Account account = this.ac.get(i);
            if(account.getSoTk() == sotk){
                NapTien(this.ac.get(i),sotiennap);
            }            
        }
    }
    
     public void RutTien(Account a,double soTienRut){
            a.setSoTien(a.getSoTien() - soTienRut);
        }
    public void ChonRutTien(int sotk,double sotienrut){
        long d;
        for (int i = 0; i<this.ac.size(); i++) {
            Account account = this.ac.get(i);
            if(account.getSoTk() == sotk){
                RutTien(this.ac.get(i),sotienrut);
            }            
        }
    }
    
    public double DaoHan(){
        double lai = 0.35;
        double SoTien = account.getSoTien() + account.getSoTien()*lai;
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String str3 = formatter.format(SoTien);
        System.out.println("Ban nhan duoc " +str3+ "VND tu dao han");
        return SoTien;
    }
    
    public void NhapTk(){
        String TenTk;
        int SoTk;
        Account taikhoan = new Account();
        System.out.print("Nhap ten tai khoan: ");TenTk = sc.nextLine(); 
        System.out.print("Nhap so tai khoan: "); SoTk = sc.nextInt(); sc.nextLine();
        account = new Account(SoTk, TenTk);
        ac.add(account); System.out.println("Them tai khoan thanh cong");
    }
    
    public void in(){
        for (Account account1 : ac) {
            System.out.println(account1.toString());
        }
    }
    
    public int Size(){
       return this.ac.size();}
    
    public Account TimTK(int sotk){
        for (Account account1 : ac) {
             if(account1.getSoTk()==sotk){
                return account1;
             }
        }
        return null;
    }
    
        public void chuyenTien(Account a1,Account a2, double sotienChuyen){
            RutTien(a1, sotienChuyen);
            NapTien(a2, sotienChuyen);
    }
}
