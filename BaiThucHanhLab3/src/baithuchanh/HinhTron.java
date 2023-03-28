package baithuchanh;
import java.util.Scanner;
public class HinhTron {

	
		final float Pi = 3.14f;
	    float r;
	    float chuvi;
	    float dientich;
	    void nhapbankinh(){
	            Scanner sc = new Scanner(System.in);           
	            System.out.print("Nhap ban kinh r=");
	            r=sc.nextFloat();
	        sc.close();
	        }
	    void tinhchuvi(){
	        chuvi=2*r*Pi;
	    } 
	    void tinhdientich(){
	        dientich=r * r *Pi ;
	    }
	    void inthongso(){
	    System.out.printf("Chu vi cua hinh tron ban kinh %f = %f",r ,chuvi);
	    System.out.printf("\nDien tich cua hinh tron ban kinh %f = %f",r, dientich);
	    }
	

}