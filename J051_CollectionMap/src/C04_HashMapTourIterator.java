import java.util.HashMap;
import java.util.Iterator;

public class C04_HashMapTourIterator {
    public static void main(String[] args) {
        
        // 번호(int), 이름(String)으로 구성된 key-value가 있다고 치자.
        // 이를 map 자료구조에 5개 넣고
        // 이를 iterator로 순회하는 코드를 작성해보세요.

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "빨강");
        map.put(2, "주황");
        map.put(3, "노랑");
        map.put(4, "초록");
        map.put(5, "파랑");

        // keySet --> Set(순서가 없음)이므로 작성 순서대로 출력되는 것은 아니다.
        Iterator<Integer> iter = map.keySet().iterator();

        while(iter.hasNext()) {
            int key = iter.next();
            System.out.printf("Key: %d, Value: %s\n", key, map.get(key));
        }
    }
}
