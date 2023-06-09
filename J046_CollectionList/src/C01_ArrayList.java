import java.util.List;
import java.util.ArrayList;

public class C01_ArrayList {
    public static void main(String[] args) throws Exception {

        List<String> list = new ArrayList<>();
        // ArrayList<String> list = new ArrayList<>(); // well-printed // 위와 동일한 코드
        // LinkedList<String> list = new LinkedList<>(); // well-printed

        list.add("김철수");
        list.add("김영희");
        list.add("이수지");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        list.remove(0);
        
        System.out.println("--------------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
