
package arraylist;

import java.util.ArrayList;
import java.util.ListIterator;


public class slide19 {
   
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        ListIterator<Integer> numm = arr.listIterator();
        while (numm.hasNext()) {
            System.out.print(numm.next() + "\t");
            
        }
        
    }  
}
