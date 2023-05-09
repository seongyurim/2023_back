import java.util.Scanner;

public class Book22209 {
    public static void main(String[] args) {
        
        // 학생들의 점수를 분석하는 프로그램
        // 키보드로부터 학생 수와 각 학생들의 점수를 입력받고
        // 최고 점수 및 평균 점수를 출력하는 코드

        // 1. 메뉴가 뜬다.
        // 2. 메뉴를 고른다.
        // 3. 고른 메뉴의 기능이 수행된다.

        Scanner scan = new Scanner(System.in);
        String userInput = null;
        int stuNum = 0; // 학생수
        int[] scores = null; // 성적배열
        
        int highScore = 0;
        int total = 0;
        int menu = 0;


        do {

            System.out.println("---------------------------------------------------------------");
            System.out.println("| 1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료 |");
            System.out.println("---------------------------------------------------------------");
            System.out.printf("선택> ");
            userInput = scan.nextLine();

            menu = Integer.parseInt(userInput);

            switch(menu) {

                case 1 : // 학생수 입력
                    System.out.printf("학생수> ");
                    userInput = scan.nextLine();
                    stuNum = Integer.parseInt(userInput);
                    // System.out.printf("학생수: %d\n ", stuNum);
                break;


                case 2 : // 점수 입력
                    // 1) 배열을 만든다.
                    if (stuNum != 0) {
                        scores = new int[stuNum];
                    }

                    // 2) 점수를 입력받아 배열에 넣는다.
                    for (int i = 0; i < stuNum; i++) {
                        System.out.printf("score[%d]> ", i);
                        userInput = scan.nextLine();
                        scores[i] = Integer.parseInt(userInput);
                    }
                break;


                case 3 : // 점수 리스트
                    for (int i = 0; i < stuNum; i++) {
                        System.out.printf("score[%d]: %d\n", i, scores[i]);
                    }
                break;


                case 4 : // 분석
                    // 1) 최고 점수 구하기
                    if (scores != null) {
                        highScore = scores[0]; // 첫번째 점수가 최고점이라 치는 것

                        for (int i = 1; i < scores.length; i++) {
                            if (highScore < scores[i]) {
                                highScore = scores[i];
                            }
                        }
                        System.out.println("최고점수: " + highScore);
                    }

                    // 2) 평균 구하기
                    for (int i = 0; i < stuNum; i++) {
                        total += scores[i];
                    }
                    System.out.println("평균점수: " + (total/stuNum));
                break;


                default :
                break;
            }
        } while(menu != 5);
        System.out.println("Bye!");
    }
}
