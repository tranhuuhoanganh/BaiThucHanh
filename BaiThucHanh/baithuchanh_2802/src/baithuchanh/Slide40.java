package baithuchanh;

import java.util.Scanner;

public class Slide40 {

	public static void main(String[] args) {
		int ngay;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so ngay: ");
		ngay = sc.nextInt();
		
		switch (ngay) {
		case 1: System.out.println("chu nhat");break;
		case 2: System.out.println("thu 2 ");break;
		case 3: System.out.println("thu 3 ");break;
		case 4: System.out.println("thu 4 ");break;
		case 5: System.out.println("thu 5 ");break;
		case 6: System.out.println("thu 6 ");break;
		case 7: System.out.println("thu 7 ");break;
		
		
		default: System.out.println("khong la ngay nao ");
			
		}
		sc.close();
		

	}

}
