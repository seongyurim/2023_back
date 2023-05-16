package L03_Sam;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String temp;
        int inputCount = 0;
        int[] lottoNumber;

        System.out.printf("게임 횟수> ");
        temp = scan.nextLine();
        inputCount = Integer.parseInt(temp);

        Lotto lotto = Lotto.getInstance();

        for (int i = 0; i < inputCount; i++) {

            // 로또 번호를 얻어온다.
            lottoNumber = lotto.getLottoNumber();

            // 로또 번호를 출력한다.
            System.out.println(Arrays.toString(lottoNumber));
            // System.out.printf("%d, %d, %d, %d, %d, %d\n", lottoNumber[0],
            //                                               lottoNumber[1],
            //                                               lottoNumber[2],
            //                                               lottoNumber[3],
            //                                               lottoNumber[4],
            //                                               lottoNumber[5]);
        }
    }
}
