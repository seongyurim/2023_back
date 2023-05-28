import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        Lotto lotto = new Lotto();

        System.out.printf("로또 수량> ");
        int quantity = scan.nextInt();
        int[] lottoSet;

        for (int i = 0; i < quantity; i++) {
            lottoSet = lotto.getlottoSet();
            System.out.println(Arrays.toString(lottoSet));
        }

    }
}
