
package baithuchanh_2102;
import java.util.Scanner;

public class BaiThucHanh_2102 {

   
    public static void main(String[] args) {
int tong=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap so ngong nhien: ");
		int a = sc.nextInt();
		
		while (a>0) {
		tong += a%10;
		a /=10;	
		}
		
		System.out.println("tong = " +tong);    }
    
}
