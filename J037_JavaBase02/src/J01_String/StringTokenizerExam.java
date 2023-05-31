package J01_String;
import java.util.StringTokenizer;

public class StringTokenizerExam {
    
    public static void stringTokenTest() {
        
        String data = "강아지&고양이,렛서판다";

        // split 사용
        String[] dataTokens = data.split("&|,");
        // 강아지, 고양이, 렛서판다가 배열에 저장되었다.

        // StringTokenizer 사용
        StringTokenizer st = new StringTokenizer(data, "&|,");
        while(st.hasMoreTokens()) {
            String token = st.nextToken();
            System.out.print(token);
        }
        // 강아지, 고양이, 렛서판다가 차례로 출력되었다.
    }
}
