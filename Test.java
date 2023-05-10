package Bai1;

import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        AccountList acL = new AccountList();
        Scanner sc = new Scanner(System.in);
        int menu;
        do{
            System.out.println("1. Nhap tai khoan");
            System.out.println("2. In tai khoan");
            System.out.println("3. Nap tien");
            System.out.println("4. Rut tien");
            System.out.println("5. Dao han");
            System.out.println("6. Chuyen tien");
            System.out.println("7. Thoat");
            System.out.print("Lua chon: ");
            menu = sc.nextInt();
            switch(menu){
                case 1:
                    acL.NhapTk();
                    break;
                case 2:
                    System.out.println("Hien co " + acL.Size() +" trong kho");
                    acL.in();
                    break;
                case 3:
                    int sotk;
                    System.out.print("Chon tai khoan can nap:");
                    sotk = sc.nextInt();
                    System.out.print("Nhap so tien nap: ");
                    double sotien=sc.nextDouble();
                    if(acL.TimTK(sotk)==null){
                        System.out.println("Khong tim thay");
                    }else{
                        acL.ChonNapTien(sotk, sotien);
                    }
                    
                    break;

                case 4:
                    System.out.print("Chon tai khoan can rut:");
                    sotk = sc.nextInt();
                    System.out.print("Nhap so tien rut: ");
                    sotien = sc.nextDouble();
                    if(acL.TimTK(sotk)==null){
                        System.out.println("Khong tim thay");
                    }else{
                        acL.ChonRutTien(sotk, sotien);
                    }
                    
                    break;
                case 5:
                    acL.DaoHan();
                    break;
                case 6:
                    System.out.print("Nhap so tai khoan chuyen: ");
                    int  stkC = sc.nextInt();
                    
                    Account ac1=acL.TimTK(stkC);
                    
                    System.out.print("Nhap so tai khoan nhan:");
                    int stkN = sc.nextInt();
                    Account ac2= acL.TimTK(stkN);
                   
                    System.out.print("nhap so tien chuyen: ");
                    double sotienC=sc.nextDouble();
                    if(ac1 == null || ac2 == null){
                       System.out.println("Tai khoan khong ton tai!");
                    }else{
                        acL.chuyenTien(ac1, ac2, sotienC);
                   }
                    break;
                default:
                    if(menu!=7){
                    System.out.println("nhap sai, chuc nang khong ton tai");
                    }else { System.out.println("Da thoat"); }
            }
        }while(menu!=7);
    }
}
