import java.util.Scanner;
import java.util.stream.StreamSupport;

public class Book22209Recoding {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    String userInput = null;
    int menu = 0;

    int stuCount = 0;
    int[] scoreArray = null;
    int bestScore = 0;
    int totalScore = 0;

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
          stuCount = Integer.parseInt(userInput);
        break;

        case 2 : // 점수 입력
          // 1) 점수를 저장할 배열을 만든다.
          if (stuCount != 0) {
            scoreArray = new int[stuCount];
          }
          System.out.println(scoreArray);
          // 2) 점수를 배열에 저장한다.
          for (int i = 0; i < stuCount; i++) {
            System.out.printf("score[%d]> ", i);
            userInput = scan.nextLine();
            scoreArray[i] = Integer.parseInt(userInput);
          }
        break;

        case 3 : // 점수리스트
          for (int i = 0; i < scoreArray.length; i++) {
            System.out.printf("score[%d]: %d\n", i, scoreArray[i]);
          }
        break;
        
        case 4 : // 최고점수, 평균점수
        // 1) 최고점수
        bestScore = scoreArray[0];
        for (int i = 1; i < scoreArray.length; i++) {
          if (bestScore < scoreArray[i]) {
            bestScore = scoreArray[i];
          }
        }
        System.out.println("최고점수: " + bestScore);

        // 2) 평균점수
        for (int i = 0; i < stuCount; i++) {
          totalScore += scoreArray[i];
        }
        System.out.println("평균점수: " + (totalScore/stuCount));
        break;

      }

    } while(menu != 5);
    System.out.println("프로그램을 종료합니다.");

  }
}
