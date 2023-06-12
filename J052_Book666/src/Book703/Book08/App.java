package Book703.Book08;

import java.util.*;

public class App {
    public static void main(String[] args) {
        
        Set<Student> set = new HashSet<>();

        set.add(new Student(1, "김노랑"));
        set.add(new Student(2, "이파랑"));
        set.add(new Student(1, "김노랑")); // 저장되지 않아야 함

        System.out.println("저장된 객체 수: " + set.size());

        for (Student stu : set) {
            System.out.println(stu.studentNum + "번 " + stu.name);
        }
    }
}
