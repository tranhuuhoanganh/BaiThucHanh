
package baithuchanhlab3;

import BaiThucHanhLab3.hinhtron;
import java.util.Scanner;


public class bai1 {
     public static void main(String[] args) {
         
         hinhtron ht = new hinhtron();
         Student st = new Student();
         int chon;
         Scanner sc = new Scanner(System.in);
         System.out.println("1:hinh tron \n2:student");
         System.out.print("nhap chuong trinh muon chay: ");
         chon = sc.nextInt();
         switch(chon)
         {
         case 1 -> {
             System.out.println("------------------------");
             ht.nhapBanKinh();
             ht.tinhChuVi();
             ht.xuatThongTin();
             }
         case 2 -> { 
             System.out.println("------------------------");
             st.thongTin();
             st.tinhTuoi();
             st.inThongTin();
             }
         }
        
      
    }
    }

    
    
