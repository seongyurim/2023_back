package Example;
import java.util.StringTokenizer;

public class E03_StringTokenizerExam {
    public static void main(String[] args) {
        
        // split 사용 ///////////////////////////////////////////////
        String data1 = "홍길동&이수홍,박연수";
        String[] arr = data1.split("&|,");

        for (String token : arr) {
            System.out.println(token);
        }
        System.out.println();


        // StringTokenizer 사용 /////////////////////////////////////
        String data2 = "홍길동/이수홍/박연수";
        StringTokenizer st = new StringTokenizer(data2, "/");

        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            System.out.println(token);
        }
    }
}
