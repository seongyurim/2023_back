package Step2_SamTable;

public class App {
    public static void main(String[] args) throws Exception {
        String upperData = "J BN B CPZA";
        String decodedData = "";

        // 디크립션(복호화) 객체를 생성한다.
        Decryptor decryptor = new Decryptor();

        // 암호문을 복호화 한다.
        decodedData = decryptor.decrypt2(upperData);

        // 결과를 출력한다.
        System.out.println(decodedData);

    }
}
