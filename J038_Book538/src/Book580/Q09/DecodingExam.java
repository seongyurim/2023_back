package Q09;

public class DecodingExam {
    public static void main(String[] args) {
        
        byte[] bytes = { -20, -107, -120, -21, -123, -107 };
        String str = new String(bytes, "UTF-8");
        System.out.println("str : " + str);

    }
}
