import java.util.InputMismatchException;
import java.util.Scanner;

public class E03_Finally {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int val1;
        int val2;
        int result;

        try {
            val1 = scan.nextInt();
            val2 = scan.nextInt();
            result = val1 / val2;
        }
        catch (ArithmeticException e) { // error
            System.out.println("0이 아닌 숫자를 입력하세요.");
            return;
        }
        catch (InputMismatchException e) { // error
            System.out.println("문자가 아닌 숫자를 입력하세요.");
            return;
        }
        finally {
            System.out.println("Scan Clo");
            scan.close();
        }

    }
}
