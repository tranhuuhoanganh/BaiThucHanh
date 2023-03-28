
package baithuchanhlab3;
import java.util.Scanner;

public class Student {
     String hoten;
		    int tuoi, namsinh;
		    String gioitinh;
		    public void nhapthongtin(){
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Nhap ho va ten :");
		        hoten=sc.nextLine();
		        System.out.print("\nNhap so nam sinh :");
		        namsinh=sc.nextInt();
		        System.out.print("\nNhap gioi tinh :");
		        gioitinh=sc.next();
		        
		    }
		    public void tinhtuoi()
		    {
		        tuoi = 2023 - namsinh;
		    }

		    public void inthongtin()
		    {
		        System.out.printf("\nSinh vien tren co thong tin la:\nHo va ten: %s \nGioi tinh: %s \nNam sinh: %d \nTuoi: %d ", hoten, gioitinh, namsinh, tuoi );
		    }
    }
    

