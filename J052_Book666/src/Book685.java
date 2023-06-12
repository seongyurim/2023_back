import java.util.*;

public class Book685 {
    public static void main(String[] args) {
        
        TreeMap<String, Integer> map = new TreeMap<>();

        map.put("apple",       10);
        map.put("forever",     60);
        map.put("description", 40);
        map.put("ever",        50);
        map.put("zoo",         80);
        map.put("base",        20);
        map.put("guess",       70);
        map.put("cherry",      30);

        Iterator<String> iter = map.keySet().iterator();

        while(iter.hasNext()) {
            String key = iter.next();
            System.out.printf("Key: %s, Value: %d\n", key, map.get(key));
        }
    }
}
