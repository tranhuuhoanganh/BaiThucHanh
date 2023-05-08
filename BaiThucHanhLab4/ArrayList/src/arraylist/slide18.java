
package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class slide18 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        Iterator<Integer> numm = arr.iterator();
        while (numm.hasNext()) {
            System.out.print(numm.next() + "\t");
            
        }
        
    }  
}
