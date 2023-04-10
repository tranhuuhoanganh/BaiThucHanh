
package baithuchanhlab3;
import java.util.Scanner;

public class bai1 {
     public static void main(String[] args) throws Exception {
        hinhtron ht;
         ht = new hinhtron();
        Student sv = new Student();
        Scanner sc = new Scanner(System.in);
        int chon;
        System.out.print("1.Hinh tron \n2.Student \nVui long chon: ");  
        chon = sc.nextInt();
        switch(chon){
            case 1 -> {
                ht.nhapbankinh();
                ht.tinhchuvi();
                ht.tinhdientich();
                ht.inthongso();
             }
            case 2 -> {
                sv.thongTin();
                sv.tinhTuoi();
                sv.inThongTin();
             }
            default -> System.out.println("Vui long lua chon dung!");
        }
    
    }
    }
    
