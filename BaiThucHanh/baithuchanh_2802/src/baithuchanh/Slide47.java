package baithuchanh;

import java.util.Scanner;

public class Slide47 {

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
		
		System.out.println( "tong = " +a.substring(0,a.length()-2) + " = " +sum);
		sc.close();

	}

}