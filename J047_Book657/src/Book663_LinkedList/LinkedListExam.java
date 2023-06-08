package Book663_LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExam {
    public static void main(String[] args) {
        
        // ArrayList, LinkedList 컬렉션 객체 생성
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new LinkedList<>();

        // 시작과 끝 시간을 저장하는 변수
        long startTime;
        long endTime;

        // ArrayList 컬렉션에 저장하는 시간 측정
        startTime = System.nanoTime();
        
        for(int i = 0; i < 10000; i++) {
            list1.add(0, String.valueOf(i));
        }

        endTime = System.nanoTime();
        System.out.printf("%-18s %8d ns \n", "ArrayList 걸린 시간: ", (endTime - startTime));

        // LinkedList 컬렉션에 저장하는 시간 측정
        startTime = System.nanoTime();

        for (int i = 0; i < 10000; i++) {
            list2.add(0, String.valueOf(i));
        }

        endTime = System.nanoTime();
        System.out.printf("%-18s %8d ns \n", "LinkedList 걸린 시간: ", (endTime - startTime));

        // 결과
        // ArrayList 걸린 시간:  13729900 ns
        // LinkedList 걸린 시간:  2578001 ns

        // LinkedList가 훨씬 빠른 성능을 보인다.
        // ArrayList가 느린 이유는 0번 인덱스에 객체가 추가되면서 기존 인덱스들이 뒤로 밀려나는 과정이 생기기 때문이다.
    }
}
