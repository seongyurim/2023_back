import java.util.HashMap;
import java.util.Set;

public class C03_HashMapTour {
    public static void main(String[] args) {

        HashMap<String, String> user = new HashMap<>();

        user.put("mushroom", "주황버섯");
        user.put("ribbonPig", "리본돼지");
        user.put("greenSnail", "초록달팽이");

        // 'key는 유니크하다'는 특성을 활용하는 것
        Set<String> keySet = user.keySet();

        for (String key : keySet) {
            System.out.println(key); // key 순회
            System.out.println(user.get(key)); // value 순회
        }
    }
}
