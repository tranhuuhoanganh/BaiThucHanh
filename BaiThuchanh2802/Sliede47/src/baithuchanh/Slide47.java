package baithuchanh;

import java.util.Scanner;

public class Slide47 {

	public static void main(String[] args) {
		float sum=0,number;
		
		Scanner sc = new Scanner(System.in);
		
		
		do {
			System.out.print("nhap so: ");
			number = sc.nextFloat();
			sum +=number;
			if(sum>100) {break;}
			
		}while(number>0);
		
		System.out.println("sum = " +sum);
		sc.close();

		
	}

}
