

//Viết chương trình nhập vào các phần tử cho 1 ArrayList từ bàn phím. Sau đó tìm và hiển thị phần tử lớn nhất trong ArrayList đó.
package arraylist;

import java.util.Scanner;
import java.util.ArrayList;
public class slide22 {

    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so phan tu trong day: ");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>(n);
        
        for (int i = 0; i < n; i++) {
            System.out.printf("nhap phan tu thu %d: ",i+1);
            number = sc.nextInt();
            arr.add(number);     
        }
        System.out.print("day so vua nhap la: ");
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + "\t");   
        }       
        
        int max = arr.get(0);
        for(int i = 0; i < arr.size(); i++){
        if(max<arr.get(i))
        {
            max = arr.get(i) ;
        }     
            }
        System.out.println("\nso lon nhat la: "+max);
        
    }
    
}
