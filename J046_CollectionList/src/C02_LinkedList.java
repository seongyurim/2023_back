import java.util.List;
import java.util.LinkedList;

public class C02_LinkedList {
    public static void main(String[] args) throws Exception {

        List<String> list = new LinkedList<>();
        // ArrayList<String> list = new ArrayList<>(); // well-printed // 위와 동일한 코드
        // LinkedList<String> list = new LinkedList<>(); // well-printed

        list.add("김철수");
        list.add("김영희");
        list.add("이수지");

        // Enhanced for문 활용
        // 컬렉션에서 많이 쓰이므로 잘 알아두자
        for (String name : list) {
            System.out.println(name);
        }

        list.remove(0);

        for (String name : list) {
            System.out.println(name);
        }

    }
}
