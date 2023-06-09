package C03_HashSet;
import java.util.HashSet;

public class App {
    public static void main(String[] args) {
    
        HashSet<Num> set = new HashSet<>();

        set.add(new Num(45));
        set.add(new Num(23));
        set.add(new Num(634));
        set.add(new Num(3));

        set.add(new Num(45)); // 중복값이므로 추가되지 않을 것이라고 예상

        System.out.println("Set 요소의 개수: " + set.size()); // 4 예상

        // Iterator<Num> iter = set.iterator();
        // while(iter.hasNext()) {
        //     System.out.println(iter.next());
        // }

        // 위의 이터레이터를 사용한 출력을 향상된 For문으로 해보았음
        for (Num n : set) {
            System.out.println(n);
        }

    }
}
