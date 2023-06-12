import java.util.*;

public class Book681 {
    public static void main(String[] args) {
        
        TreeSet<Integer> scores = new TreeSet<>();
        
        scores.add(87);
        scores.add(98);
        scores.add(75);
        scores.add(95);
        scores.add(80);

        // 저장된 객체들을 하나씩 가져오기
        for (Integer s : scores) {
            System.out.print(s + " ");
        }
        System.out.println();

        // 특정 객체 가져오기
        System.out.println("가장 낮은 점수: " + scores.first());
        System.out.println("가장 높은 점수: " + scores.last());
        System.out.println("95점 미만 점수: " + scores.lower(95));
        System.out.println("95점 초과 점수: " + scores.higher(95));
        System.out.println("95점이거나 바로 아래 점수: " + scores.floor(95));
        System.out.println("85점이거나 바로 위의 점수: " + scores.ceiling(85) + "\n");            
    }
}
