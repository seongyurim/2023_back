import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class C05_TreeMap {
    public static void main(String[] args) {
        
        TreeMap<Integer, String> tMap = new TreeMap<>(); // 정렬O
        // HashMap<Integer, String> tMap = new HashMap<>(); // 정렬X


        tMap.put(12, "빨강");
        tMap.put(4, "파랑");
        tMap.put(434, "분홍");
        tMap.put(85, "연두");
        tMap.put(32, "보라");
        tMap.put(3, "갈색");
        tMap.put(55, "회색");
        tMap.put(61, "검정");

        Set<Integer> kSet = tMap.keySet();

        Iterator<Integer> iter = kSet.iterator();

        int key;
        while(iter.hasNext()) {
            key = iter.next();
            System.out.printf("%d, %s\n", key, tMap.get(key));
        }
    }
}
