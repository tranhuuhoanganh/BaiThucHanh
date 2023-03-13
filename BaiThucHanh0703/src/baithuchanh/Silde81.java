package baithuchanh;
import java.util.Scanner;

public class Silde81 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int i,j;
	    int n,m;
	    int tong=0;
	
	    
	    do{
	        System.out.print("nhap so hang: ");
	        n = sc.nextInt();
	        System.out.print("nhap so cot: ");
	        m = sc.nextInt();
	    }while(n<0&&m<0);
	    
		int[][] arr =  new int[n][m];

	    for(i=0;i<n;i++){
	        for(j=0;j<m;j++){
	            System.out.printf("[%d][%d]= ",i,j,arr[i][j]);
	            arr[i][j] = sc.nextInt();
	            
	        }
	    }
	    
	    System.out.println("mang vua nhap : ");
	    for(i=0;i<n;i++){
	        for(j=0;j<m;j++){
	             System.out.print(arr[i][j] + "\t");
	        }
	        	System.out.println("\n");
	        }
	    System.out.print("cac so chan la: ");
	    for(i=0;i<n;i++){
	    	for(j=0;j<m;j++){
	    		if(arr[i][j]%2==0) {
	    			System.out.print(arr[i][j]);
	    			
	                 }
	        }
	        }
	  
	}

}
