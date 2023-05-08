
package arraylist;

import java.util.LinkedList;
import java.util.Scanner;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> arrlist = new LinkedList<Integer>();
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.print("Nhap vao kich thuoc cua mang: ");
        int n = sc.nextInt();
        sc.close();
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap vao phan tu a[%d]: ", i);
            number = sc.nextInt();
            arrlist.addFirst(number);
        }

        System.out.print("Phan tu trong mang la: ");
        for (Integer integer : arrlist) {
            System.out.print(integer + "\t");
        }

        System.out.println("");
        arrlist.sort((o1, o2) -> o1 - o2);
        System.out.print("Sap xep tang dan: ");
        for (Integer integer : arrlist) {
            System.out.print(integer + "\t");
        }

        System.out.println("");
        arrlist.sort((o1, o2) -> o2 - o1);
        System.out.print("Sap xep giam dan: ");
        for (Integer integer : arrlist) {
            System.out.print(integer + "\t");
        }

        System.out.println("");
        System.out.print("Phan tu lon nhat cua mang la: " + arrlist.get(0));

        System.out.println("");
        System.out.print("Phan tu nho nhat cua mang la: " + arrlist.get(n-1));
    }
}