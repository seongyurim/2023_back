package Step4_InstanceMemberClass;

public class App {
    public static void main(String[] args) {

        // 암호화된 데이터
        String encData = "";
        String decData = "";

        // 암호 테스트용
        encData = "J BN B CPZA"; // I AM A BOYZ
        encData = "j bn b cpza"; // i am a boyz
        encData = "J MJLF QJAAB"; // I LIKE PIZZA
        encData = "j mjlf qjaab"; // i like pizza
        encData = "J Mjlf Qjaab"; // I Like Pizza

        
        // 애플리케이션 운영하기
        // enc데이터의 대문자 & 소문자 식별 후 메소드 실행
        Decryptable decryptor = null;
        for (int i = 0; i < encData.length(); i++) {
            if ((encData.charAt(i) >= 'A') && (encData.charAt(i) <= 'Z')) {        // 데이터가 대문자인 경우
                decryptor = new UppercaseDecryptor();
                decData = decryptor.decrypt(encData);
                
            } else if ((encData.charAt(i) >= 'a') && (encData.charAt(i) <= 'z')) { // 데이터가 소문자인 경우
                decryptor = new LowercaseDecryptor();
                decData = decryptor.decrypt(encData);
            }
            decryptor = new MixedcaseDecryptor();                                  // 데이터가 대소문자 섞여있을 경우
            decData = decryptor.decrypt(encData);
        }

        // 결과 출력
        System.out.printf("복호화된 데이터는 [ %s ] 입니다.\n", decData);
    }
}
