package J02_HashCode;
import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        
        HashSet hashSet = new HashSet(); // HashSet 컬렉션 생성

        Student s1 = new Student(1, "김수지");
        hashSet.add(s1); // HashSet에 Student 객체 저장
        System.out.println("저장된 객체 수: " + hashSet.size()); // 1

        Student s2 = new Student(1, "김수지");
        hashSet.add(s2); // HashSet에 Student 객체 저장
        System.out.println("저장된 객체 수: " + hashSet.size()); // 1 중복 객체이므로 저장되지 않음

        Student s3 = new Student(2, "김철수");
        hashSet.add(s3); // HashSet에 Student 객체 저장
        System.out.println("저장된 객체 수: " + hashSet.size()); // 1       

    }
}
