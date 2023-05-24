package Step3_LowerAdded;

public class MappingTable {
    
    public static final int ALPHA = 26;
    private char[] upperEncode;
    private char[] upperDecode;
    private char[] lowerEncode;
    private char[] lowerDecode;


    // 매핑테이블 생성
    public MappingTable() {
        char upperChar = 'A';
        char lowerChar = 'a';

        // char 26개가 들어가는 배열의 메모리 할당
        upperEncode = new char[ALPHA];
        upperDecode = new char[ALPHA];
        lowerEncode = new char[ALPHA];
        lowerDecode = new char[ALPHA];

        // Encode 배열 초기화
        for (int i = 0; i < ALPHA; i++) {
            upperEncode[i] = upperChar;
            lowerEncode[i] = lowerChar;
            upperChar++;
            lowerChar++;
        }

        // Decode 배열 초기화
        upperDecode[0] = 'Z';
        lowerDecode[0] = 'z';
        upperChar = 'A';
        lowerChar = 'a';

        for (int i = 1; i < ALPHA; i++) {
            upperDecode[i] = upperChar;
            lowerDecode[i] = lowerChar;
            upperChar++;
            lowerChar++;
        }
    }

    // 들어오는 char의 암호화 알파벳 배열 인덱스를 복호화 알파벳 배열 인덱스로 변환하여 복호화
    public char decoding(char encChar) {

        char decChar = ' ';
        int upperIndex = -1;
        int lowerIndex = -1;

        for (int i = 0; i < ALPHA; i++) {
            if (upperEncode[i] == encChar) {
                upperIndex = i;
                break;
            }
            else if (lowerEncode[i] == encChar) {
                lowerIndex = i;
                break;
            }
        }

        if (upperIndex != -1) {
            decChar = upperDecode[upperIndex];
        }
        else if (lowerIndex != -1) {
            decChar = lowerDecode[lowerIndex];
        }
        return decChar;
    }
}
