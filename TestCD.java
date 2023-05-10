package Bai2;

import java.util.Scanner;
import javax.swing.SpringLayout;

public class Test {
    public static void main(String[] args) {
        DanhSachCD ds = new DanhSachCD();
        Scanner sc = new Scanner(System.in);
        int menu;
        do{
            System.out.println("1. Nhap");
            System.out.println("2. in");
            System.out.println("3. Kich thuoc");
            System.out.println("4. Sap xep gia giam dan");
            System.out.println("5. Sap xep gia tang");
            System.out.println("6. Thoat");
            System.out.print("Lua chon: ");
            menu = sc.nextInt();
            switch(menu){
                case 1:
                    ds.Nhap();
                    break;
                case 2:
                    ds.in();
                    break;
                case 3:
                    System.out.println("Co " +ds.SoLuong() + " CD trong danh sach");
                    break;
                case 4:
                    ds.SapXepTheoGiaGiam();
                    ds.in();
                    break;
                case 5:
                    ds.SapXepTheoGiaTang();
                    ds.in();
                    break;
                default:
                    if(menu!=6){
                    System.out.println("nhap sai, chuc nang khong ton tai");
                    }else { System.out.println("Da thoat"); }
            }
        }while(menu!=6);
    }
}
