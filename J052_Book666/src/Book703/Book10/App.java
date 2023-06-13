package Book10;

import java.util.*;

public class App {
    public static void main(String[] args) {
        
        TreeSet<Student> set = new TreeSet<>();

        set.add(new Student("blue", 96));
        set.add(new Student("yellow", 86));
        set.add(new Student("while", 92));

        System.out.println("최고 점수: " + set.last().score);             // 96
        System.out.println("최고 점수를 받은 아이디: " + set.last().id);  // blue
        System.out.println("최저 점수: " + set.first().score);            // 86
        System.out.println("최저 점수를 받은 아이디: " + set.first().id); // yellow
    }
}