package Example;
public class E02_StringBuilderExam {
    public static void main(String[] args) {
        
        // 메소드 체이닝 패턴
        String data = new StringBuilder()
            .append("DEF")    // 문자열을 끝에 추가
            .insert(0, "ABC") // 문자열을 지정 위치에 추가
            .delete(3, 4)     // 문자열 일부를 삭제
            .toString();      // 완성된 문자열을 리턴

        System.out.println(data); // ABCEF

    }
}
