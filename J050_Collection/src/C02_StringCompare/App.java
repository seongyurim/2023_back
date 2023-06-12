package C02_StringCompare;

import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
        
        // TreeSet = 유니크, 정렬, 찾기 등을 하기 위한 자료구조
        TreeSet<Person> tSet = new TreeSet<>(new StringCompare());
        
        tSet.add(new Person(60, "박가을"));
        tSet.add(new Person(20, "김봄"));
        tSet.add(new Person(40, "이여름"));

        for (Person p : tSet) {
            System.out.println(p);
        }
    }
}
