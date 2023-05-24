package FirstThought;
public class Test {

    public boolean decoding(String encoded) {

        return true;
    }

    public static void main(String[] args) {
        
        String encoded = "J BN B CPZ";
        String decoded;

        // 암호화된 문장을 분리
        String[] encodedSplit = encoded.split("");

        // 잘 분리되었는지 반복문으로 확인
        for (int i = 0; i < encodedSplit.length; i++) {
            System.out.println(encodedSplit[i]);
        }

        //
        // for (int i= 0; i < encodedSplit.length; i++) {
        //     if (true == (encodedSplit[0] = encodedArray[i])) {
                
        //     }
        // }
    






        // 암호문 기준 알파벳 배열 생성 /////////////////////////////////////
        char[] encodedArray = new char[26];
    
        for (int i = 0; i < encodedArray.length; i++) {
            encodedArray[i] = (char)(65 + i);
        }

        // 배열 요소 출력해보기
        for (int i = 0; i < encodedArray.length; i++) {
            System.out.print(encodedArray[i] + " ");
        }
        System.out.println();



        // 복호문 기준 알파벳 배열 생성 ////////////////////////////////////
        char[] decodedArray = new char[26];
        decodedArray[0] = (char)(90);

        for (int i = 0; i < decodedArray.length - 1; i++) {
            decodedArray[i+1] = (char)(65 + i);
        }

        // 배열 요소 출력해보기
        for (int i = 0; i < decodedArray.length; i++) {
            System.out.print(decodedArray[i] + " ");
        }
        System.out.println();




    }
}
