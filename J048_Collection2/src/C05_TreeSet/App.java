package C05_TreeSet;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {
        
        // TreeSet<Student> tSet = new TreeSet<>();

        // tSet.add(new Student(1, "김빨강"));
        // tSet.add(new Student(2, "김주황", "서울", "leader"));
        // tSet.add(new Student(3, "김노랑", "서울", "staff"));
        // tSet.add(new Student(4, "김연두", "서울", ""));
        // tSet.add(new Student(5, "김초록", "서울", ""));

        // System.out.println("학생 수: " + tSet.size());

        // Iterator<Student> iter = tSet.iterator();
        
        // while (iter.hasNext()) {
        //     System.out.println(iter.next());
        // }


        ///////////////////////////////////////////////////////////////////////


        Student[] ar = new Student[] {
            new Student(3, "김노랑", "서울", "staff"),
            new Student(1, "김빨강"),
            new Student(5, "김초록", "서울", ""),
            new Student(4, "김연두", "서울", ""),
            new Student(2, "김주황", "서울", "leader"),
            new Student(6, "김하늘", "서울", ""),
            new Student(7, "김파랑", "서울", "staff"),
        };

        Arrays.sort(ar);

        for (int i = 0; i < ar.length; i++) {
            System.out.printf("%s %s\n", ar[i].getNumber(), ar[i].getName());
        }
    }
}
