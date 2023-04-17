
package hinhhoc;

import java.util.Scanner;


public class HinhTron extends HinhHoc{

   public float bankinh;
   public HinhTron()
   {
       ten = " tron ";
   }
    public void nhapBanKinh() {
        System.out.print("nhap ban kinh: ");
        Scanner sc = new Scanner(System.in);
        bankinh = sc.nextFloat();
    }
    
    public void tinhChuVi()
    {
        chuvi = 2*pi*bankinh;
    }
    
    public void tinhDienTich()
    {
        dientich = pi * bankinh * bankinh;
    }
    
}
