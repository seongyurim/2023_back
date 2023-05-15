package Account1920Answer;

import java.util.Scanner;

public class App {

    // 메뉴 이름을 가지는 정적 변수 생성(리터빌리티 향상)
    // switch문의 case에 대입하여 사용
    public static final int CREATE_ACCOUNT   = 1;
    public static final int DELETE_ACCOUNT   = 2;
    public static final int INQUIRY_ACCOUNT  = 3;
    public static final int DEPOSIT_ACCOUNT  = 4;
    public static final int WITHDRAW_ACCOUNT = 5;

    public static boolean createAccount(BankApplication bank, String number, String name, int balance) {
        return bank.createAccount(number, name, balance);
    }
    
    public static void main(String[] args) throws Exception{
        
        Scanner scan = new Scanner(System.in);
        String temp;
        int userInput;

        BankApplication bankApp = new BankApplication(100);
        String number = "";
        String name = "";
        int balance = 0;

        do {
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("| 1. 계좌생성 | 2. 계좌삭제 | 3. 계좌목록 | 4. 입금 | 5. 출금 | 6. 종료 |");
            System.out.println("-------------------------------------------------------------------------");
            System.out.printf("선택> ");
            temp = scan.nextLine();
            userInput = Integer.parseInt(temp);

            switch(userInput) {

                case CREATE_ACCOUNT :
                    System.out.println("---------------");
                    System.out.println("| 1. 계좌생성 |");
                    System.out.println("---------------");
                
                    System.out.printf("계좌번호: ");
                    temp = scan.nextLine();
                    number = temp;

                    System.out.printf("예금주: ");
                    temp = scan.nextLine();
                    name = temp;

                    System.out.printf("초기입금액: ");
                    temp = scan.nextLine();
                    balance = Integer.parseInt(temp);

                    if (true == createAccount(bankApp, number, name, balance)) {
                        System.out.println("결과: 계좌가 정상적으로 생성되었습니다.");
                    } 
                    else {
                        System.out.println("결과: 계좌 생성에 실패하였습니다.");
                    }
                break;


                case DELETE_ACCOUNT :
                    System.out.println("---------------");
                    System.out.println("| 2. 계좌삭제 |");
                    System.out.println("---------------");

                    System.out.printf("계좌번호: ");
                    temp = scan.nextLine();
                    number = temp;

                    if (true == bankApp.deleteAccount(number)) {
                        System.out.println("결과: 계좌가 정상적으로 삭제되었습니다.");
                    } else {
                        System.out.println("결과: 계좌가 삭제되지 않았습니다.");
                    }
                break;


                case INQUIRY_ACCOUNT :
                    System.out.println("---------------");
                    System.out.println("| 3. 계좌목록 |");
                    System.out.println("---------------");

                    int maxCount = bankApp.getMax();
                    Account ac = null;

                    for (int i = 0; i < maxCount; i++) {
                        ac = bankApp.getAccount(i);
                        if (ac != null) {
                            System.out.printf("%s\t %s\t %d\n", ac.getNumber(), ac.getName(), ac.getBalance());
                        }
                    }
                break;


                case DEPOSIT_ACCOUNT :
                number = "";                
                balance = 0;

                System.out.println("---------------");
                System.out.println("| 4. 입금하기 |");
                System.out.println("---------------");

                System.out.printf("계좌번호: ");
                temp = scan.nextLine();
                number = temp;

                System.out.printf("입금액: ");
                temp = scan.nextLine();
                balance = Integer.parseInt(temp);

                if (true == bankApp.deposit(number, balance)) {
                    System.out.println("결과: 입금에 성공하였습니다.");
                } else {
                    System.out.println("결과: 입금에 실패하였습니다.");
                }
                break;


                case WITHDRAW_ACCOUNT :
                number = "";                
                balance = 0;

                System.out.println("---------------");
                System.out.println("| 5. 출금하기 |");
                System.out.println("---------------");

                System.out.printf("계좌번호: ");
                temp = scan.nextLine();
                number = temp;

                System.out.printf("출금액: ");
                temp = scan.nextLine();
                balance = Integer.parseInt(temp);

                if (true == bankApp.withdraw(number, balance)) {
                    System.out.println("결과: 예금에 성공하였습니다.");
                } else {
                    System.out.println("결과: 예금에 실패하였습니다.");
                }
                break;

                default:
                break;
            }

        } while(userInput != 6);
        System.out.println("Bye");
    }
}
