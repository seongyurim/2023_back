import java.util.*;

public class Book09 {
    public static void main(String[] args) {
        
        Map<String, Integer> map = new HashMap<>();

        map.put("blue", 96);
        map.put("yellow", 86);
        map.put("white", 92);

        String name = "";   // 최고 점수를 받은 아이디를 저장하는 변수
        int maxScore = 0;   // 최고 점수를 저장하는 변수
        int totalScore = 0; // 점수 합계를 저장하는 변수
        int avgScore = 0;   // 평균 점수를 저장하는 변수

        Iterator<String> iter = map.keySet().iterator();
        
        while (iter.hasNext()) {
            String key = iter.next(); // key: 아이디
            int value = map.get(key); // value: 점수

            if (value > maxScore) {
                maxScore = value;
                name = key;
            }
            totalScore = totalScore + value;
        }
        avgScore = totalScore / map.size();

        System.out.println("점수 합계: " + totalScore);         // 274
        System.out.println("평균 점수: " + avgScore);           // 91
        System.out.println("최고 점수: " + maxScore);           // 96
        System.out.println("최고 점수를 받은 아이디: " + name); // blue
    }
}
