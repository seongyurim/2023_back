

import java.util.LinkedList;
import java.util.Queue;

public class C03_Queue {
    public static void main(String[] args) {
        
        Queue<String> queue = new LinkedList<>(); // 가능
        // Queue<String> queue = new ArrayList<>(); // 불가능

        // Insert
        queue.add("김봄");
        queue.add("이여름");
        queue.add("박가을");

        // Examine & Remove
        // peek: 다음에 뭐가 나올지 그냥 확인해보는 것
        System.out.println("다음 데이터: " + queue.element()); // 김봄
        System.out.println("POP 데이터: " + queue.remove()); // 김봄

        System.out.println("다음 데이터: " + queue.element()); // 이여름
        System.out.println("POP 데이터: " + queue.remove()); // 이여름

        System.out.println("다음 데이터: " + queue.element()); // 박가을
        System.out.println("POP 데이터: " + queue.remove()); // 박가을

        System.out.println("다음 데이터: " + queue.element()); // NoSuchElementException
        System.out.println("POP 데이터: " + queue.remove()); // NoSuchElementException
    }
}
