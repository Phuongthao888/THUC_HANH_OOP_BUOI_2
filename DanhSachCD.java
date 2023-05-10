package Bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DanhSachCD {
    private ArrayList<CD> danhsach;
    Scanner sc = new Scanner(System.in);
    CD cd;
    
    public DanhSachCD(){
        super();
        danhsach = new ArrayList<CD>();
    }
    
    public void Nhap(){
        String MaCD;
        String TuaCD;
        int SoBaiHat;
        float Gia;

        String macd;
        boolean trungMaCD;
        do {
            sc.nextLine();
            System.out.print("Nhap ma cd: ");
            macd = sc.nextLine();

            // Kiểm tra xem mã CD có tồn tại hay không
            trungMaCD = false;
            for (CD cd : danhsach) {
                if (cd.getMaCD().equals(macd)) {
                    trungMaCD = true;
                    System.out.println("Ma cd da ton tai trong danh sach, vui long nhap lai!");
                    break;
                }
            }
        } while (trungMaCD);

        System.out.print("Nhap tua cd: "); TuaCD = sc.nextLine();
        System.out.print("Nhap so cd: "); SoBaiHat = sc.nextInt();
        System.out.print("Nhap gia: "); Gia = sc.nextFloat();
        cd = new CD(macd, TuaCD, SoBaiHat, Gia);
        danhsach.add(cd);
        System.out.println("Them thanh cong");
    }
    
    public void in(){
        for (CD cd1 : danhsach) {
            System.out.println(cd1.toString());
        }
    }
    
    public int SoLuong(){
        return this.danhsach.size();
    }
    
    public void SapXepTheoGiaGiam(){
        Collections.sort(danhsach, new Comparator<CD>(){
            @Override
            public int compare(CD cd1, CD cd2) {
                if(cd1.getGia()>cd2.getGia()){
                    return -1;
                }else if(cd1.getGia()<cd2.getGia()){
                    return 1;
                }else
                    return 0;
            }
            
        });
    }
    
    public void SapXepTheoGiaTang(){
        Collections.sort(danhsach , new Comparator<CD>(){
            @Override
            public int compare(CD cd1, CD cd2) {
                if(cd1.getGia()< cd2.getGia()){
                    return -1;
                }else if(cd1.getGia()> cd2.getGia()){
                    return 1;
                }else
                    return 0;
            }
            
        });
    }
}
