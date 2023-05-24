package Step4_InstanceMemberClass;

public class MixedcaseDecryptor implements Decryptable {
    
    public static final int ALPHA = 26;

    // 속성
    MappingTable mtable;
    String decData;
    
    // 기본생성자
    public MixedcaseDecryptor() {
        mtable = new MappingTable();
        decData = "";
    }
    
    // 인스턴트 멤버 클래스(매핑테이블)
    private class MappingTable {

        private char[] upperEncode; // 암호화 알파벳 배열(A~B~~Z)
        private char[] upperDecode; // 복호화 알파벳 배열(Z~A~~Y)
        private char[] lowerEncode; // 암호화 알파벳 배열(a~b~~z)
        private char[] lowerDecode; // 복호화 알파벳 배열(z~a~~y)
    
        // 매핑테이블 생성
        public MappingTable() {
            char upperChar = 'A';
            char lowerChar = 'a';
    
            // 알파벳 26개가 들어가는 배열의 메모리 공간 할당
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
    
        // 암호화되어 있는 캐릭터를 복호화 캐릭터로 변환
        public char decoding(char encChar) {
    
            char decChar = ' ';
            int upperIndex = -1;
            int lowerIndex = -1;
    
            for (int i = 0; i < ALPHA; i++) {
                if (upperEncode[i] == encChar) {
                    upperIndex = i;
                    break;
                } else if (lowerEncode[i] == encChar) {
                    lowerIndex = i;
                    break;
                }
            }
    
            if (upperIndex != -1) {
                decChar = upperDecode[upperIndex];
            } else if (lowerIndex != -1) {
                decChar = lowerDecode[lowerIndex];
            }
            return decChar;
        }
    }



    // 인터페이스 추상메소드 구현
    @Override
    public String decrypt(String encData) {

        char encChar = 0;

        for (int i = 0; i < encData.length(); i++) {

            encChar = encData.charAt(i);

            // 매핑테이블에서 찾는다.
            decData += mtable.decoding(encChar);
        }
        return decData;
    }
}
