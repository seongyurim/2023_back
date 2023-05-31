package Q08;

public class App {
    public static void main(String[] args) {
        
        // 시간 측정 시작
        long start = System.currentTimeMillis();

        int[] scores = new int[1000];
        for (int i = 0; i < scores.length; i++) {
            scores[i] = i;
        }

        int sum = 0;
        for (int score : scores) {
            sum += score;
        }

        double avg = sum / scores.length;
        System.out.println(avg); // 499.0

        // 시간 측정 종료
        long end = System.currentTimeMillis();

        // 코드 실행에 걸린 시간
        System.out.println((end - start) + " 나노초 소요됨"); // 0 나노초

    }
}
