
package baithuchanhlab3;

import java.util.Scanner;


public class hinhtrutron {
    
    final float pi =  3.14f;
    float bk,cc;
    float chuvi, dientich,thetich;
    
    
    public void nhapThongTin()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ban kinh: ");
        bk = sc.nextFloat();
        System.out.print("nhap chieu cao:");
        cc = sc.nextFloat();
    }
    
    public void tinhChuVi()
    {
        chuvi = 2 * pi * bk * cc;
    }
    
    public void tinhDienTich()
    {
        dientich = 2 * pi * bk * (bk + cc);
    }
    
    public void tinhTheTich()
    {   
        thetich = pi * bk * bk * cc;
    }
    
    public void in()
    {
        System.out.println("chu vi = " +chuvi);
        System.out.println("dien tich = " +dientich);
        System.out.println("the tich = " +thetich);
    }
}





        