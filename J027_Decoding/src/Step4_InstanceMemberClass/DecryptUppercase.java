package Step4_InstanceMemberClass;

public class DecryptUppercase implements Decryptable {
    
    public static final int ALPHA = 26;

    // 속성
    MappingTable mtable;
    
    // 기본생성자
    public DecryptUppercase() {
        mtable = new MappingTable();
    }
    
    // 인스턴트 멤버 클래스(매핑테이블)
    private class MappingTable {

        private char[] encode; // 암호화 알파벳 배열(A~B~~Z)
        private char[] decode; // 복호화 알파벳 배열(Z~A~~Y)
    
        // 매핑테이블 생성
        public MappingTable() {
            char c = 'A';
    
            // 알파벳 26개가 들어가는 배열의 메모리 공간 할당
            encode = new char[ALPHA];
            decode = new char[ALPHA];
    
            // Encode 배열 초기화
            for (int i = 0; i < ALPHA; i++) {
                encode[i] = c;
                c++;
            }
    
            // Decode 배열 초기화
            decode[0] = 'Z';
            c = 'A';
            for (int i = 1; i < ALPHA; i++) {
                decode[i] = c;
                c++;
            }
        }
    
        // 암호화되어 있는 캐릭터를 복호화 캐릭터로 변환
        public char decoding(char encChar) {
    
            char decChar = ' ';
            int index = -1;
    
            for (int i = 0; i < ALPHA; i++) {
                if (encode[i] == encChar) {
                    index = i;
                    break;
                }
            }
    
            if (index != -1) {
                decChar = decode[index];
            }
            return decChar;
        }
    }



    // 인터페이스 추상메소드 구현
    @Override
    public String decrypt(String encData) {

        String decData = "";
        char encChar = 0;

        for (int i = 0; i < encData.length(); i++) {

            encChar = encData.charAt(i);

            // 매핑테이블에서 찾는다.
            decData += mtable.decoding(encChar);
        }
        return decData;
    }
}
