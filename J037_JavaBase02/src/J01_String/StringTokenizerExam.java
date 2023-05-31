package J01_String;
import java.util.StringTokenizer;

public class StringTokenizerExam {
    
    public static void stringTokenTest() {
        
        String data = "강아지&고양이,렛서판다";
        String[] dataTokens = data.split("&|,");

        StringTokenizer st = new StringTokenizer(data, "&|,");

        while(st.hasMoreTokens()) {
            String token = st.nextToken();
            System.out.println(token);
        }
    }

}
