public class Book183 {
    public static void main(String[] args) {
        
        // 문자열 잘라내기 = substring()

        String ssn = "880815-1234567";

        // 0번째부터 6번째의 앞까지 잘라내기
        String firstNum = ssn.substring(0, 6);
        System.out.println(firstNum); // 880815

        // 7번째부터 잘라내기
        String secondNum = ssn.substring(7);
        System.out.println(secondNum); // 1234567
    }
}
