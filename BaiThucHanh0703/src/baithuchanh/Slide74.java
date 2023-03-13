package baithuchanh;

import java.util.Scanner;

public class Slide74 {

	public static void main(String[] args) {
		int i,tong = 0;
		int n;
		Scanner sc = new Scanner(System.in);
		
		do {
		System.out.print("nhap kich thuoc cua mang: ");
		 n =sc.nextInt();
		 }while(n<0);
			
		int[] arr= new int[n];
		for( i=0 ; i < n; i++)
		{
			System.out.printf("gia tri thu %d: " ,i+1);
			arr[i] = sc.nextInt();	
			
		}
		sc.close();
		for(i = 0; i < n;i++)
		{
			if(arr[i]%2==0)
			{
				tong += arr[i];
			}
		}
		
		System.out.println("tong cac so chan =" +tong);
	
	}

}


