package C04_Student;

import java.util.HashSet;
import java.util.Iterator;

public class App {
    public static void main(String[] args) {

        Student stu1 = new Student(1, "김빨강", "서울", "leader");
        Student stu2 = new Student(2, "김주황", "경기", "staff");
        Student stu3 = new Student(3, "김노랑", "강원", "");
        Student stu4 = new Student(4, "김연두", "충북", "");
        Student stu5 = new Student(5, "김초록", "충남", "");
        Student stu6 = new Student(6, "김하늘", "전북", "");
        Student stu7 = new Student(7, "김파랑", "전남", "");
        Student stu8 = new Student(8, "김보라", "경북", "");
        Student stu9 = new Student(9, "김분홍", "경남", "");
        Student stu10 = new Student(10, "김검정", "제주", "");

        
        HashSet<Student> set = new HashSet<>();

        set.add(stu1);
        set.add(stu2);
        set.add(stu3);
        set.add(stu4);
        set.add(stu5);
        set.add(stu6);
        set.add(stu7);
        set.add(stu8);
        set.add(stu9);
        set.add(stu10);


        System.out.println("------- 1차 출력 시작 -------------------------------------------");

        System.out.printf("*총 %s명\n", set.size()); // 총 10명

        // Iterator로 Set 리스트 출력
        Iterator<Student> iter = set.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }


        System.out.println("------- 2차 출력 시작: 중복 객체 추가 ---------------------------");

        set.add(new Student(3, "김노랑")); // 중복 객체 추가 시도

        System.out.printf("*총 %s명\n", set.size()); // 추가 실패. 총 10명

        // Iterator로 Set 리스트 출력
        iter = set.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
