import java.util.*;

public class Book666 {
    public static void main(String[] args) throws Exception {
        
        Set<String> set = new HashSet<>();

        set.add("Java");
        set.add("JDBC");
        set.add("JSP");
        set.add("Java"); // 중복객체여서 저장안됨
        set.add("Spring");

        int size = set.size();
        System.out.println("총 객체 수: " + size);
        
    }
}
