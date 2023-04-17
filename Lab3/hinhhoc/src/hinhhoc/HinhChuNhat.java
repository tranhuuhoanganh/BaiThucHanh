
package hinhhoc;

import java.util.Scanner;


public class HinhChuNhat extends HinhHoc{
    public float chieudai;
    public float chieurong;
    
    public HinhChuNhat()
    {
        ten = "chu nhat";
    }
    public void nhapChieu()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap chieu dai: ");
        chieudai = sc.nextFloat();
        System.out.print("nhap chieu rong: ");
        chieurong = sc.nextFloat();
    }
    
    public void tinhChuVi()
    {
        chuvi = (chieudai + chieurong) *2;
    }
    
    public void tinhDienTich()
    {
        dientich = chieudai * chieurong;
    }
    
   
    
}
