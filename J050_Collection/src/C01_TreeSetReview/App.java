package C01_TreeSetReview;

import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
        
        // TreeSet = 유니크, 정렬, 찾기 등을 하기 위한 자료구조
        TreeSet<Person> tSet = new TreeSet<>();
        
        tSet.add(new Person(60, "박파랑"));
        tSet.add(new Person(20, "김빨강"));
        tSet.add(new Person(40, "이노랑"));

        for (Person p : tSet) {
            System.out.println(p);
        }
    }
}
