
package hinhhoc;

import java.util.Scanner;


public class HinhTruTron extends HinhTron{
    
    public float chieucao;
    public HinhTruTron()
    {
        ten = "tru tron";
    }
    public void nhapChieuCao()
    {
        nhapBanKinh();
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap chieu cao: ");
        chieucao = sc.nextFloat();
    }
    
    public void tinhTheTich()
    {
        tinhDienTich();
        thetich = dientich * chieucao;
    }
    
}
