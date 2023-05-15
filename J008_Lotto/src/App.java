import java.util.Scanner;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        
        // 스캔하기
        Scanner scan = new Scanner(System.in);
        int quantity = 0;

        while (true) {   
            System.out.println("---------------------------------");
            System.out.println("| 로또를 몇개 구매하시겠습니까? |");
            System.out.println("---------------------------------");
            System.out.printf("수량> ");
            quantity = scan.nextInt();
            
            // 수량만큼 배열세트 생성
            for(int i = 0; i < quantity; i++) {
                
                // 로또배열 1세트 생성
                int[] lottoArray = new int[6];
                for (int j = 0; j < 6; j++) {
                    int rn = (int)(Math.random() * 45 + 1);
                    lottoArray[j] = rn;

                    // 중복숫자 제거
                    for (int k = 0; k < j; k++) {
                        if (lottoArray[j] == lottoArray[k]) {
                            j--;
                        }
                    }
                }

                Arrays.sort(lottoArray);
                System.out.println("로또번호: " + Arrays.toString(lottoArray));
            }
            System.out.printf("*감사합니다. 로또 %d개 구매가 완료되었습니다.\n", quantity);
        }

    }
}
