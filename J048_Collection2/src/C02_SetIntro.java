import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C02_SetIntro {
    public static void main(String[] args) {
        
        Set<String> set = new HashSet<>();
        
        set.add("red");
        set.add("orange");
        set.add("yellow");

        System.out.println(set.size()); // 3

        set.add("orange"); // 중복되는 값이므로 추가되지 않을 것으로 예상

        System.out.println(set.size()); // 3 // 역시 추가되지 않음

        Iterator<String> iter = set.iterator();

        // Set: 1번부터 나와(X) 한번씩 다나와(O)
        while(iter.hasNext()) {
            System.out.printf("%s ", iter.next());
        }


    }
}