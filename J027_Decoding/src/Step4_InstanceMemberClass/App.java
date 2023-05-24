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
        // encData = "J Mjlf Qjaab"; // I Like Pizza // 실행안됨..

        Decryptable decryptor = null;

        decryptor = new MixedcaseDecryptor();
        decData = decryptor.decrypt(encData);

        // 대문자 & 소문자 판독 후 메소드 실행
        if ((encData.charAt(0) >= 'A') && (encData.charAt(0) <= 'Z')) { // 데이터가 대문자인 경우
            decryptor = new UppercaseDecryptor();
            decData = decryptor.decrypt(encData);
        } else if ((encData.charAt(0) >= 'a') && (encData.charAt(0) <= 'z')) {                                                        // 데이터가 소문자인 경우
            decryptor = new LowercaseDecryptor();
            decData = decryptor.decrypt(encData);
        }

        // 결과 출력
        System.out.printf("복호화된 데이터는 [ %s ] 입니다.\n", decData);


    }
}
