package J01_String;
public class StringTest {

    public static void stringTest() {
        
        String orgMessage = "JAVA";
        byte[] arr1 = orgMessage.getBytes();
        
        String copyMessage = new String(arr1);
        System.out.println(copyMessage);
    }

    public static void stringBuilderTest() {
     
        String data1 = new StringBuilder().append("DEF").toString();
        System.out.println(data1);
        
        String data2;
        StringBuilder sb = new StringBuilder();
        sb = sb.append("DEF");
        data2 = sb.toString();
        System.out.println(data2);
    }
}