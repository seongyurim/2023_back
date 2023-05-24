package Step4_Interfacing_Notyet;

public class Decryptor implements Decryptable{

    DecryptLowercase lowerTable;
    DecryptUppercase upperTable;
    
    public Decryptor() {
        lowerTable = new DecryptLowercase();
        upperTable = new DecryptUppercase();
    }

    @Override
    public String decrypt(String encData) {

        char encChar = 0;
        String decData = "";

        for (int i = 0; i < encData.length(); i++) {

            encChar = encData.charAt(i);

            // 매핑테이블에서 찾는다.
            decData += upperTable.decoding(encChar);
        }
        return decData;
    }
}
