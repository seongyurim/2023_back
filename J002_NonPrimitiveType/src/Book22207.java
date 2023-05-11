public class Book22207 {
    public static void main(String[] args) {
        
        // 배열의 최대값 출력
        int[] array = {1, 5, 3, 8, 2};
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
