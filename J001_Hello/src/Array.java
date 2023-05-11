public class Array {
    public static void main(String[] args) {
        
        // 보통 슈가코드는 이렇게 우변에 있다.
        int[] ar1 = new int[5];                 // 슈가코드
        int[] ar2 = new int[]{1, 2, 3, 4, 5};   // 가장 정상적인 코드
        int[] ar3 = {1, 2, 3, 4, 5};            // 슈가코드

        // 그런데 이렇게 좌변에도 슈가코드가 있는 경우가 있다.
        // C언어(켄 톰슨이 개발한 언어)가 이렇게 쓴다. C언어의 잔재인 것이다.
        // 이렇게 쓰지 말자! 이런 경우가 있다고만 알고 있자.
        int ar4[] = new int[]{1, 2, 3, 4, 5};
        for(int i = 0; i < ar4.length; i++) {
            System.out.println(ar4[i]);
        }

        // C++에서는 다시 이렇게 개선되었다.
        int[] ar5 = new int[]{1, 2, 3, 4, 5};
        
    }
}
