
package Silde;


public class Slide9 {
    public static void main(String[] args) {
        try {
            try {
                System.out.println("thuc hien phep chia");
                int b =39/0;
            } catch (ArithmeticException e) {
                System.out.println(e);
            }
            
            try {
                int a[] = new int[5];
                a[5] = 4;          
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }
            
        } catch (Exception e) {
            System.out.println("xy ly ngoai le");
        }
        System.out.println("tiep tuc chuong trinh");
    }
}
