public class Array {
    public static void main(String[] args) {
        
        // int[] ar = {11, 22, 33, 44, 55};       // 동일한 코드. 아래 코드를 간단하게 표현한 것(슈가코드이므로 비정상적이라고 여김)
        int[] ar1 = new int[]{11, 22, 33, 44, 55}; // 이것이 정석 코드!

        // for (int i = 0; i < ar1.length; i++) {
        //     System.out.println(ar1[i]);
        // }




        int[] ar2 = new int[]{11, 22, 33, 44, 55};




        int[] ar3 = new int[5]; // 빈 배열 만들기. 초기화가 안되어 있으므로 아래처럼 초기화해주어야 함
        ar3[0] = 10;
        ar3[1] = 20;
        ar3[2] = 30;
        ar3[3] = 40;
        ar3[4] = 50;




        // int[] ar4 = new int[5]{11, 22, 33, 44, 55}; // 에러발생. [5] 때문임



    }
}
