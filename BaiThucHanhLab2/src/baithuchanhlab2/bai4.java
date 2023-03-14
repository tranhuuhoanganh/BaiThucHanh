
package baithuchanhlab2;

import java.util.Scanner;


public class bai4 {
            public static void main(String[] args) {
		int thang;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap thang: ");
		thang = sc.nextInt();
		
		switch (thang) {
		case 1 -> System.out.println("thang 1");
		case 2 -> System.out.println("thang 2 ");
		case 3 -> System.out.println("thang 3 ");
		case 4 -> System.out.println("thang 4 ");
		case 5 -> System.out.println("thang 5 ");
		case 6 -> System.out.println("thang 6 ");
		case 7 -> System.out.println("thang 7 ");
                case 8 -> System.out.println("thang 8 ");
                case 9 -> System.out.println("thang 9 ");
                case 10 -> System.out.println("thang 10 ");
                case 11 -> System.out.println("thang 11 ");
                case 12 -> System.out.println("thang 12 ");
		
		
		default -> System.out.println("khong la thang nao ");
			
		}
		
		

	}
}
