public class Array5_exam {
    public static void main(String[] args) {

        // n이 몇이지? T가 몇이지? 생각하면서 배열을 하나씩 만들어보자.

        
        // 1. 로또 번호를 저장해야 한다.
        // (랜덤번호 6개가 필요함)
        int [] lotto = new int[6];


        // 2. 중학교 국어, 영어, 수학 성적을 저장해야 한다.
        int [][][] score = new int[3][2][3]; // [학년][학기][과목]


        // 3. 날씨(맑음, 흐림, 비, 눈) 1년 날씨를 저장해야 한다.
        String [] weather1 = new String[365];
        int [] weather2 = new int[365]; // 날씨요소를 심볼링하면 int 이렇게 생성해도 된다.



        /////////////////////////////////////////////////////////////////

        // 2번 문제 자세히 공부하기
        // int [][][] score = new int[3][2][3];

        // 입력 ------------------------------------------
        // 1학년 국영수 성적입력
        // 1-1학기
        score[0][0][0] = 80;
        score[0][0][1] = 81;
        score[0][0][2] = 82;

        // 1-2학기
        score[0][1][0] = 90;
        score[0][1][1] = 91;
        score[0][1][2] = 92;

        // 2학년 국영수 성적입력
        // 2-1학기
        score[1][0][0] = 85;
        score[1][0][1] = 90;
        score[1][0][2] = 82;

        // 2-2학기
        score[1][1][0] = 88;
        score[1][1][1] = 78;
        score[1][1][2] = 96;

        // 3학년 국영수 성적입력
        // 3-1학기
        score[2][0][0] = 94;
        score[2][0][1] = 91;
        score[2][0][2] = 94;

        // 3-2학기
        score[2][1][0] = 98;
        score[2][1][1] = 95;
        score[2][1][2] = 96;




        // 출력 ------------------------------------------

        // 강사님
        for (int y = 0; y < score.length; y++) {

            for (int k =0; k < score[y].length; k++) {
                System.out.printf("국어 : %d, 영어 %d, 수학 : %d\n",
                    score[y][k][0],
                    score[y][k][1],
                    score[y][k][2]
                );
            }
        }
        

        // 김성현님
        // int grade = 1;

        // for (int i = 0; i < score.length; i++) {
        //     System.out.printf("%d학년\n", grade);

        //     for (int j = 0; j < score[i].length; j++) {

        //         for (int k = 0; k < score.length; k++) {
        //             System.out.println(score[i][j][k]);
        //         }
        //     }
        //     grade++;
        // }



        // 반드시 이해하고 넘어가기 ------------------------
        
        System.out.println(score.length);       // 3
        System.out.println(score[0].length);    // 2 // int[2][3]
        System.out.println(score[0][0].length); // 3 // int[3]

    }
}
