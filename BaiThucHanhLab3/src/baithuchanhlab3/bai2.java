
package baithuchanhlab3;
import java.util.Scanner;

public class bai2 {
     public static void main(String[] args) throws Exception {
            hinhtrutron htru = new hinhtrutron();
            nhanvien nv = new nhanvien();
            int chon;
        Scanner sc = new Scanner(System.in);    
        System.out.print("1.Hinhtru \n2.nhanvien \nVui long chon: ");  
        chon = sc.nextInt();
        switch(chon){
            case 1 -> {
                htru.nhapSoLieu();
                htru.tinhKetQua();
                htru.inThongTin();
             }
            case 2 -> {
                nv.nhapThongTin();
                nv.tinhLuong();
                nv.inThongTin();
             }
        default -> System.out.println("Vui long chon lai");  
      }
      
}
}
