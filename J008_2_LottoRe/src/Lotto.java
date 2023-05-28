import java.util.Arrays;

public class Lotto {
    
    public static final int MAX = 6;
    // public static Lotto lotto = null;

    public Lotto() {}

    public boolean isExistNumber(int[] ar, int randomNum) {

        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == randomNum) {
                return true;
            }
        }
        return false;
    }


    public int[] getlottoSet() {

        int[] lottoSet = new int[MAX];
        int randomNum;

        for (int i = 0; i < MAX; i++) {
    
            // 랜덤숫자 구하기
            double rn = Math.random();
            randomNum = ((int)(rn * 45) + 1);

            // 랜덤숫자가 중복되지 않았다면 배열에 추가하기
            if (false == isExistNumber(lottoSet, randomNum)) {
                lottoSet[i] = randomNum;
            }    
        }
        Arrays.sort(lottoSet);

        return lottoSet;
    }




}
