
package arraylist;

import java.util.ArrayList;
public class slide16 {

    
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));   
        }       
    }  
}
