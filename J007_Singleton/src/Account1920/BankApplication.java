package Account1920;

import java.util.Scanner;

public class BankApplication {
    
    // Attribute
    Scanner scan = new Scanner(System.in);
    String userInput = null;
    int[] Account = null;
    int menu = 0;

    do {

        System.out.println("-----------------------------------------------------------");
        System.out.println("| 1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료 |");
        System.out.println("-----------------------------------------------------------");
        System.out.printf("선택> ");
        userInput = scan.nextLine();    
        menu = Integer.parseInt(userInput);

    } while (menu != 5);
    System.out.println("프로그램을 종료합니다.");


}
