package L03_Sam;

import java.util.Arrays;

public class Lotto {

    private static final int MAX = 6;

    private static Lotto lotto = null;

    public static Lotto getInstance() {
        // 로또가 null 이면 만들어서 리턴하고
        if (lotto == null) {
            lotto = new Lotto();
        }
        // 로또가 이미 만들어져 있으면 그것을 리턴
        return lotto;
    }
    
    // 1. 속성이 뭐가 있을까? 없네.. 우선 패스하자

    // 2. 그래도 기본생성자는 필수로 작성해야 해
    private Lotto() {}

    private int getRandomNumber() {
        double rn = Math.random(); // 0.0 ~ 0.9999
        return ((int)(rn * 45) + 1); // 1 ~ 45
    }

    private boolean isExistNumber(int[] ar, int num) {
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == num) {
                return true;
            }
        }
        return false;
    }


    public int[] getLottoNumber() {
        int[] numbers = new int[MAX];
        int pos = 0;
        int randomNumber;

        while(pos < MAX) {
            // 1) 랜덤값을 가지고 온다. (1~45)
            randomNumber = getRandomNumber();

            // 2) 이 랜덤값이 배열에 존재하니?
            if (false == isExistNumber(numbers, randomNumber)) {

                // 3) 존재하지 않는다면 추가하고 pos 증가
                numbers[pos] = randomNumber;
                pos++;
            }
        }

        // 정렬해서 리턴한다.
        Arrays.sort(numbers);

        return numbers;
    }
}
