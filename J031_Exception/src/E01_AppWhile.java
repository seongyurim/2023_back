// import java.util.InputMismatchException;
import java.util.Scanner;

public class E01_AppWhile {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        int value1 = 0;
        int value2 = 0;
        
        while (true) {
            try {
                // 예외가 발생될 가능성이 있는 코드
                System.out.printf("숫자1: ");
                value1 = scan.nextInt();

                System.out.printf("숫자2: ");
                value2 = scan.nextInt();

                System.out.println("result = " + (value1 / value2));
                break;
    
            } catch(ArithmeticException excp) {
                System.out.println("[ERROR] 0이 아닌 숫자를 다시 입력해주세요.");
    
            }  catch (java.util.InputMismatchException excp) {  
                scan.nextLine(); // 스캔 버퍼 비우기
                System.out.println("[ERROR] 숫자만 입력해주세요.");
            }
        }
        // 예외처리를 하는 가장 기본적인 문법
        // System.out.println("bye!");
    }
}
