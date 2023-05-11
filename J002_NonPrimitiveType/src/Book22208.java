public class Book22208 {
    public static void main(String[] args) {
        
        // 배열 항목의 전체 합과 평균을 구하는 코드 출력

        int[][] array = {
            {95, 86},
            {83, 92, 96},
            {78, 83, 93, 87, 88}
        };

        // 합계 구하기
        int sum = 0;        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum = sum + array[i][j];
            }
        }
        System.out.println(sum); // 881


        // 평균 구하기
        double avg = 0.0;
        int avgCount = 0;
        for (int i = 0; i < array.length; i++) {
            avgCount = avgCount + array[i].length;
        }
        System.out.println(avgCount); // 10

        avg = sum / avgCount;
        System.out.println(avg); // 88.0
    }
}
