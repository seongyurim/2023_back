package Account1920;

import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {

        Account newAcc = new Account();

        
        // 스캐너를 위한 속성
        Scanner scan = new Scanner(System.in);
        String userInput = null;

        // 엔티티 도출
        Account[] accountArray = new Account[100];
        int menu = 0;
    
        do {
    
            System.out.println("-----------------------------------------------------------");
            System.out.println("| 1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료 |");
            System.out.println("-----------------------------------------------------------");
            System.out.printf("선택> ");
            userInput = scan.nextLine();

            menu = Integer.parseInt(userInput);
    
            switch(menu) {

                case 1: // 계좌생성
                    System.out.println("---------------");
                    System.out.println("| 1. 계좌생성 |");
                    System.out.println("---------------");

                    System.out.printf("계좌번호: ");
                    String accountNum =  scan.nextLine();

                    System.out.printf("계좌주: ");
                    String accountOwner =  scan.nextLine();

                    System.out.printf("초기입금액: ");
                    int accountBal =  Integer.parseInt(scan.nextLine());

                    Account newAccount = new Account(accountNum, accountOwner, accountBal);
                    System.out.println("결과: 계좌가 생성되었습니다.");

                    for (int i = 0; i < accountArray.length; i++) {
                        if (accountArray[i] == null) {
                            accountArray[i] = newAccount;
                            break;
                        }
                    }
                break;

                case 2: // 계좌목록
                    System.out.println("---------------");
                    System.out.println("| 2. 계좌목록 |");
                    System.out.println("---------------");

                    for (int i = 0; i < accountArray.length; i++) {
                        if (accountArray[i] != null) {
                            System.out.printf(accountArray[i].getAccountNum() + "\t" +
                                              accountArray[i].getName() + "\t" +
                                              accountArray[i].getBalance() + "\n");
                        }
                    }
                break;

                case 3: // 예금
                System.out.println("---------------");
                System.out.println("| 3. 예금하기 |");
                System.out.println("---------------");

                System.out.printf("계좌번호: ");
                accountNum =  scan.nextLine();

                System.out.printf("예금액: ");
                int deposit =  Integer.parseInt(scan.nextLine());

                for(int i = 0; i < accountArray.length; i++) {
                    if (accountArray[i] != null) {
                        if (accountArray[i].getAccountNum().equals(accountNum)) {
                            accountArray[i].setBalance(accountArray[i].getBalance() + deposit);
                        }
                    }
                }
                break;

                case 4: // 출금
                System.out.println("---------------");
                System.out.println("| 4. 출금하기 |");
                System.out.println("---------------");

                System.out.printf("계좌번호: ");
                accountNum =  scan.nextLine();

                System.out.printf("출금액: ");
                int withdraw =  Integer.parseInt(scan.nextLine());

                for(int i = 0; i < accountArray.length; i++) {
                    if (accountArray[i] != null) {
                        if (accountArray[i].getAccountNum().equals(accountNum)) {
                            accountArray[i].setBalance(accountArray[i].getBalance() - withdraw);
                        }
                    }
                }
                break;

                default:
                System.out.println("[ERROR] BankApplication Class");
                break;
            }
    
        } while(menu != 5);
        System.out.println("프로그램을 종료합니다.");
    }
    


}
