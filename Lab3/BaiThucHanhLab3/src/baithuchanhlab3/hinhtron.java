package BaiThucHanhLab3;

import java.util.Scanner;


public class hinhtron {

    final float pi =  3.14f;
    float bk;
    float chuvi, dientich;
    public void nhapBanKinh()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ban kinh: ");
        bk = sc.nextFloat();
    }
    
    public void tinhChuVi()
    {
        chuvi = 2*pi*bk;
    }
    
    public void tinhDienTich()
    {
        dientich = pi * bk * bk;
    }

    public void xuatThongTin()
    {
        System.out.println("chu vi = " +chuvi);
        System.out.println("dien tich = " +dientich);
    }
 
}