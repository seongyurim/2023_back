package Step3_LowerAdded;

public class App {
    public static void main(String[] args) {

        // String upperData = "J BN B CPZA";
        String lowerData = "j bn b cpza";
        String decodedData = "";

        // 디크립션(복호화) 객체를 생성한다.
        Decryptor decryptor = new Decryptor();

        // 암호문을 복호화한다.
        // decodedData = decryptor.decrypt2(upperData);
        decodedData = decryptor.decrypt2(lowerData);

        // 결과를 출력한다.
        System.out.println(decodedData);
    }
}
