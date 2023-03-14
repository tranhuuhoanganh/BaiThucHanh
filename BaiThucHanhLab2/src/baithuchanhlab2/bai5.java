
package baithuchanhlab2;

import java.util.Scanner;


public class bai5 {
            public static void main(String[] args) {
        	int  sum=0,number;
		String a = "";
		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("nhap so: ");
			number = sc.nextInt();
			a += number + "+";
			sum +=number;
		}while(sum<100);
                System.out.println("tong cac so: ");
                System.out.println( "" +a.substring(0,a.length()-1) + " = " +sum);
            }
}
