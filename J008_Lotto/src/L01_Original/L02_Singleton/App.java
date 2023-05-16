package L02_Singleton;
import java.util.Scanner;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        
        // SCAN
        Scanner scan = new Scanner(System.in);
        int quantity = 0; // 사용자 입력값(로또 수량)
        

        System.out.println("---------------------------------");
        System.out.println("| 로또를 몇개 구매하시겠습니까? |");
        System.out.println("---------------------------------");
        System.out.printf("수량> ");
        quantity = scan.nextInt();
        

        // SINGLETON
        Lotto lottoApp = Lotto.getInstance(quantity);


        // // PRINT
        // for (int i = 0; i < quantity; i++) {
        //     System.out.println("로또번호: " + Arrays.toString(lottoApp.getLottoSet()));
        // }
        System.out.printf("*감사합니다. 로또 %d개 구매가 완료되었습니다.\n", quantity);

    }
}
