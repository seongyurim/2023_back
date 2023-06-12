import java.util.*;
import java.util.Map.Entry;

public class Book673 {
    public static void main(String[] args) {
        
        Map<String, Integer> map = new HashMap<>();

        // 객체 저장하기
        map.put("김봄", 85);
        map.put("이여름", 90);
        map.put("박가을", 80);
        map.put("이여름", 90); // 키가 같으므로 마지막에 입력한 값만 저장
        System.out.println("총 Entry 수: " + map.size());
        System.out.println();

        // key를 통해 value 얻기
        String key = "이여름";
        int value = map.get(key);
        System.out.println(key + ": " + value); // 4
        System.out.println();

        // 키 Set 컬렉션을 얻고, 키와 값을 반복해서 얻기
        Iterator<String> keyIter = map.keySet().iterator();
        while(keyIter.hasNext()) {
            String k = keyIter.next();
            Integer v = map.get(k);
            System.out.println(k + ": " + v);
        }
        System.out.println();

        // 엔트리 Set 컬렉션을 얻고, 키와 값을 반복해서 얻기
        Iterator<Entry<String, Integer>> entryIter = map.entrySet().iterator();
        while(entryIter.hasNext()) {
            Entry<String, Integer> entry = entryIter.next();
            String k = entry.getKey();
            Integer v = entry.getValue();
            System.out.println(k + ": " + v);

        }
        System.out.println();

        // 키로 엔트리 삭제
        map.remove("박가을");
        System.out.println("총 Entry 수: " + map.size()); // 3
    }
}
