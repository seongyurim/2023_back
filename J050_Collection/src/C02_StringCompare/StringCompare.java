package C02_StringCompare;

import java.util.Comparator;

public class StringCompare implements Comparator<Person> {
    
    // 이름 정렬
    // 디폴트가 오름차순이므로
    @Override
    public int compare(Person p1, Person p2) {
        return p1.getName().compareTo(p2.getName());
    }
}
