
package baithuchanhlab3;

import java.util.Scanner;


public class hinhtrutron {
    final float PI = 3.14f;
    float r, h;
    float cv;
    float dt;
    float tt;

    //nhap cac phuong thuc
    public void nhapSoLieu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ban kinh hinh tru tron: ");
        r = sc.nextFloat();
        System.out.println("Nhap chieu cao hinh tru tron: ");
        h = sc.nextFloat();
        
    }
    public void tinhKetQua(){
        cv = 2 * PI * r * h;
        dt = 2 * PI * r * (r + h);
        tt = PI * r * r * h;
    }
    public void inThongTin(){
        System.out.printf("Chu vi hinh tru tron la = %f", cv);
        System.out.printf("\nDien tich hinh tru tron la = %f", dt);
        System.out.printf("\nThe tich hinh tru tron = %f", tt);
    }
}
