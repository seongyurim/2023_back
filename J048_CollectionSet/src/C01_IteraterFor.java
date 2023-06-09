import java.util.Iterator;
import java.util.LinkedList;

public class C01_IteraterFor {
    public static void main(String[] args) throws Exception {
        
        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        int val;
        for (Iterator<Integer> iter = list.iterator(); iter.hasNext();) {
            val = iter.next();
            System.out.println(val);
        }
    }
}
