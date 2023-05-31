package Q10;

public class StringBuilderExam {
    public static void main(String[] args) {
        
        // 이 코드의 비효율성 개선하기
        String str1 = "";    
        for (int i = 1; i <= 100; i++) {
            str1 += i;
        }
        System.out.println("*** String += 연산으로 인해 비효율적인 코드 ***");
        System.out.println(str1);

        
        // StringBuilder로 코드 개선
        String str2 = "";
        StringBuilder sb = new StringBuilder();
        int num = 1;

        for (int i = 0; i < 100; i++) {
            sb.append(num);
            num++;
        }
        str2 = sb.toString();
        System.out.println("*** StringBuilder를 사용하여 코드 개선 ***");
        System.out.println(str2);
    }
}
