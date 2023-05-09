public class StringArray {
    public static void main(String[] args) {
        
        // 문자열을 생성하는 정석코드
        String str = new String("abc");

        // 문자열이 5개인 배열 생성
        String[] strArray1 = new String[5];
        strArray1[0] = new String("빨강");
        strArray1[1] = new String("주황");
        strArray1[2] = new String("노란색");
        strArray1[3] = new String("초록색");
        strArray1[4] = new String("파란색");

        for (int i = 0; i < strArray1.length; i++) {
            System.out.println("배열1: " + strArray1[i]);
        }


        // 위 코드를 초기화(정석코드)하는 버전으로 생성
        String[] strArray2 = new String[] {
            new String("빨강"),
            new String("주황"),
            new String("노란색"),
            new String("초록색"),
            new String("파란색")
        };

        for (int i = 0; i < strArray2.length; i++) {
            System.out.println("배열2: " + strArray2[i]);
        }



        // 개인정보
        String[] myInfo = new String[] {
            new String("김영희"),
            new String("서울"),
            new String("19990909")
        };

        for (int i = 0; i < myInfo.length; i++) {
            System.out.println("배열3: " + myInfo[i]);
        }



        ////////////////// 슈가코딩 /////////////////////////////////////////////////////////////////

        String a = new String("aaa"); // Original
        String b = "bbb"; // R-Value Sugar Coding


        // R-Value Sugar Coding
        String[] strArray4 = new String[] {
            "김영희",
            "서울",
            "19990909"
        };

        for (int i = 0; i < strArray4.length; i++) {
            System.out.println("배열4: " + strArray4[i]);
        }


        // L-Value Sugar Coding
        // 요즘 개발자들은 중괄호를 이렇게 변수명 다음으로 보내는 경우는 거의 없다. 이렇게는 쓰지 말자.
        String strArray5[] = new String[] {
            "김영희",
            "서울",
            "19990909"
        };

        for (int i = 0; i < strArray5.length; i++) {
            System.out.println("배열5: " + strArray5[i]);
        }




        // 어떤 코드를 사용하는 게 좋은 것인지를 물을 게 아니라,
        // 어떤 형식으로 사용되어도 이해할 수 있는 능력을 갖추면 된다.

    }
}
