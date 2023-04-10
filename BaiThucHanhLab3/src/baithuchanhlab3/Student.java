
package baithuchanhlab3;
import java.util.Scanner;

public class Student {
    String hoten,gioitinh;
        int namsinh,tuoi;
        
        public static void thongTin(String hoten,int namsinh ,String gioitinh) 
        {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho va ten :");
        hoten=sc.nextLine();
        System.out.print("\nNhap so nam sinh :");
        namsinh=sc.nextInt();
        System.out.print("\nNhap gioi tinh :");
        gioitinh=sc.nextLine();
        }
    
        public  void tinhTuoi()
        { 
            tuoi = 2023 - namsinh;
        }
        
        public void inThongTin() 
        {
        System.out.printf("\nTên: %s \nTuổi: %d \nGiới tính: %s" ,hoten, tuoi, gioitinh);       
        }
    }
    

