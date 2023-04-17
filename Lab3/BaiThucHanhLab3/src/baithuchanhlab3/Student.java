
package baithuchanhlab3;
import java.util.Scanner;

public class Student {
        String hoten="";
        String gioitinh ="";
        int namsinh,tuoi;
        
        public void thongTin() 
        {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho va ten :");
        hoten=sc.nextLine();
        System.out.print("Nhap so nam sinh :");
        namsinh=sc.nextInt();
        System.out.print("Nhap gioi tinh :");
        Scanner rc = new Scanner(System.in);
        gioitinh = rc.nextLine();
        }
    
        public void tinhTuoi()
        { 
            tuoi = 2023 - namsinh;
        }
        
        public void inThongTin() 
        {
            System.out.println("------------------------------------");
               System.out.println("Ho ten:" +hoten);
               System.out.println("tuoi: "+tuoi);
               System.out.println("gioi tinh: "+gioitinh);
               
        }
    }
    

