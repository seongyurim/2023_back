import java.util.Scanner;
public class Operator {
    public static void main(String[] args) {

        // 사용자에게 숫자를 하나 입력받아서
        // 그 숫자의 구구단을 출력하는 프로그램을 만들어보세요.

        Scanner scan = new Scanner(System.in);
        int dan = scan.nextInt();
        int m = 1;

        for (int i = 0; i < 9; i++) {
            // System.out.println(dan + " * " + m + " = " + (dan * m));
            System.out.printf("%d * %d = %d\n", dan, m, (dan*m));
            m++;
        }

    }
}
