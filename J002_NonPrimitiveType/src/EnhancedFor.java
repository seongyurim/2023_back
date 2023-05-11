public class EnhancedFor {
    public static void main(String[] args) {
        
        // 교재 212p
        
        int[] scores = {80, 90, 70, 70, 80};
        int total = 0;

        // for (int i = 0; i < scores.length; i++) {
        //     total = total + scores[i];
        // }

        // 위 코드와 당일
        // JAVA 8버전에 생긴 기능(이것도 오래된 것임)
        for (int sc : scores) {
            total = total + sc;
        }

        System.out.println(total);




        // 아까 StringArray에 작성했던 코드를 Enhanced For문으로 바꿔보기
        String[] strArray2 = new String[] {
            new String("빨강"),
            new String("주황"),
            new String("노란색"),
            new String("초록색"),
            new String("파란색")
        };

        for (String name : strArray2) {
            System.out.println(name);
        }

    }
}
