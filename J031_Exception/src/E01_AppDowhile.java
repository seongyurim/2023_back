// import java.util.InputMismatchException;
import java.util.Scanner;

public class E01_AppDowhile {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        int value1 = 0;
        int value2 = 0;
        boolean bSuccess = false;
        
        do {
            try {
                System.out.printf("숫자1: ");
                value1 = scan.nextInt();
                System.out.printf("숫자2: ");
                value2 = scan.nextInt();
                bSuccess = true;
                
            }  catch (java.util.InputMismatchException excp) {  
                scan.nextLine(); // 스캔 버퍼 비우기
                System.out.println("[ERROR] 숫자만 입력해주세요.");
            }
        } while(bSuccess == false);
        scan.close();

        System.out.println("------------");
        System.out.println("숫자1 : " + value1);
        System.out.println("숫자2 : " + value2);
        System.out.println("결 과 : " + (value1 / value2));
        System.out.println("------------");

    }
}
