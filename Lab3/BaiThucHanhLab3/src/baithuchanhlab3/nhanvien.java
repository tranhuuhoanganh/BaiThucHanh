
package baithuchanhlab3;

import java.util.Scanner;

public class nhanvien {
    
    String tennv = "";
    int manhanvien,tuoi;
    float luong,hesoluong;
    final float lcb = 1490000;
    
    public void thongTinNV()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ten nhan vien: ");
        tennv =sc.nextLine();
        System.out.print("nhap ma nhan vien: ");
        manhanvien = sc.nextInt();
        System.out.print("nhap tuoi: ");
        tuoi = sc.nextInt();
        System.out.print("nhap he so luong: ");
        hesoluong = sc.nextFloat();  
    }
    
    public void tinhLuong()
    {
        luong = hesoluong * lcb;
    }
    
    public void inThongTinNv()
    {
        System.out.println("---------------------------");
        System.out.println("Ho Va Ten: "+tennv);
        System.out.println("Tuoi: " +tuoi);
        System.out.println("MSNV: "+manhanvien);
        System.out.println("Luong nhan duoc la: "+luong);
    }
  
}



