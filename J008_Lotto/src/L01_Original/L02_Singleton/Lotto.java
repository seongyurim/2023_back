package L02_Singleton;
import java.util.Arrays;

public class Lotto {

    // ATTRIBUTE
    private int[] lottoSet;     // 로또 1세트
    private int randomNum;      // 로또 내부의 랜덤숫자 1개
    private int quantity;       // 로또 세트 수량(사용자 입력값)


    // SINGLETON
    private static Lotto lotto;

    public static Lotto getInstance(int quantity) {
        return lotto = new Lotto(quantity);
    }

    public static Lotto getInstance() {
        return lotto;
    }


    // DEFAULT CONSTRUCTOR
    private Lotto() {
        lottoSet = null;
        randomNum = 0;
    }
    

    // OVERLOADED CONSTRUCTOR
    private Lotto(int quantity) {
        lottoSet = new int[quantity];
        randomNum = 0;
    }

    // GETTER
    public int[] getLottoSet() { return this.lottoSet; }
    public int getRandomNum()  { return this.randomNum; }
    



    //////////////////////////// METHOD ///////////////////////////////////////////////////////

    // 로또세트 만들기
    public int[] getLottoSet(int quantity) {
        for(int i = 0; i < quantity; i++) {
            
            // 로또배열 1세트 생성
            for (int j = 0; j < 6; j++) {
                this.randomNum = (int)(Math.random() * 45 + 1);
                lottoSet[j] = randomNum;

                // 중복숫자 제거
                for (int k = 0; k < j; k++) {
                    if (lottoSet[j] == lottoSet[k]) {
                        j--;
                    }
                }
            }

            // Arrays.sort(lottoSet);
            System.out.println("로또번호: " + Arrays.toString(lottoSet));
        }
    }



}
