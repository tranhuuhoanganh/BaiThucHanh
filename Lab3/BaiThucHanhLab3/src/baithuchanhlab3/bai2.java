
package baithuchanhlab3;
import java.util.Scanner;


public class bai2 {
     public static void main(String[] args)  {
            hinhtrutron htt = new hinhtrutron();
            nhanvien nv = new nhanvien();
            int chon;
        Scanner sc = new Scanner(System.in);    
        System.out.print("1.Hinhtru \n2.nhanvien \nVui long chon: ");  
        chon = sc.nextInt();
        switch(chon){
            case 1 -> {
                System.out.println("---------------------------");
                htt.nhapThongTin();
                htt.tinhChuVi();
                htt.tinhDienTich();
                htt.tinhTheTich();
                htt.in();
             }
            case 2 -> {
                System.out.println("---------------------------");
                nv.thongTinNV();
                nv.tinhLuong();
                nv.inThongTinNv();
             }
      
      }
      
}
}
