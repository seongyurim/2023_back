package Step4_Interfacing_Notyet;

public class DecryptLowercase {
    
    public static final int ALPHA = 26;
    private char[] lowerEncode; // 암호화된 알파벳 코드(A~Z)
    private char[] lowerDecode; // 복호화된 알파벳 코드(Z~Y)

    // 매핑테이블 생성
    public DecryptLowercase() {
        char lowerChar = 'a';

        // char 26개가 들어가는 배열의 메모리 할당
        lowerEncode = new char[ALPHA];
        lowerDecode = new char[ALPHA];

        // Encode 배열 초기화
        for (int i = 0; i < ALPHA; i++) {
            lowerEncode[i] = lowerChar;
            lowerChar++;
        }

        // Decode 배열 초기화
        lowerDecode[0] = 'z';
        lowerChar = 'a';

        for (int i = 1; i < ALPHA; i++) {
            lowerDecode[i] = lowerChar;
            lowerChar++;
        }
    }

    // 들어오는 char의 암호화 알파벳 배열 인덱스를 복호화 알파벳 배열 인덱스로 변환하여 복호화
    public char decoding(char encChar) {

        char decChar = ' ';
        int lowerIndex = -1;

        for (int i = 0; i < ALPHA; i++) {
            if (lowerEncode[i] == encChar) {
                lowerIndex = i;
                break;
            }
        }

        if (lowerIndex != -1) {
            decChar = lowerDecode[lowerIndex];
        }
        return decChar;
    }
}
