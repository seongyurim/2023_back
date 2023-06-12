import java.util.*;

public class Book669 {
    public static void main(String[] args) throws Exception {
        
        Set<String> set = new HashSet<>();

        set.add("Java");
        set.add("JDBC");
        set.add("JSP");
        set.add("Spring");

        Iterator<String> iter = set.iterator();

        while(iter.hasNext()) {
            String element = iter.next();
            System.out.println(element);

            if(element.equals("JSP")) {
                // 가져온 객체를 컬렉션에서 제거
                iter.remove();
            }
        }
        System.out.println();

        // 객체 제거
        set.remove("JDBC");

        // 객체를 하나씩 가져와서 처리
        for (String element : set) {
            System.out.println(element);
        }                
    }
}
