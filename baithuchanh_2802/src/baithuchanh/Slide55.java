package baithuchanh;


public class Slide55 {

	public static void main(String[] args) {

		System.out.println("cac so chia het cho 5 :");
		
		for(int i=0;i<=100;i++)
		{
			if(i % 5 == 0) {
				break;
			}
			System.out.println(i);
		}	
}
}