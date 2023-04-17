
package hinhhoc;

import java.util.Scanner;


public class HinhVuong extends HinhChuNhat{
    
    
    public HinhVuong()
    {
        ten = "vuong";
    }
    
    public void nhapCanh()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap canh hinh vuong: ");
        chieudai=chieurong = sc.nextFloat();
    }
}
