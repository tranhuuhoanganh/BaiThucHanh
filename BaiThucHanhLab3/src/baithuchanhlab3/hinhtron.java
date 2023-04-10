package BaiThucHanhLab3;
import java.util.Scanner;

public class hinhtron {

  final float PI = 3.14f;
    float r;
    float cv;
    float dt;

    //nhap cac phuong thuc
    public void nhapBanKinh(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ban kinh r = ");
        r = sc.nextFloat();
        
    }

    public void tinhChuVi(){
        cv = 2 * r * PI;
    }

    public void tinhDienTich(){
        dt = r * r * PI;
    }

    public void inKetQua(){
        System.out.printf("Chu vi hinh tron ban kinh %f = %f " ,r ,cv);
        System.out.printf("\nDien tich hinh tron ban kinh %f = %f " ,r , dt);
    }


}