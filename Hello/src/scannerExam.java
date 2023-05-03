import java.util.Scanner;
public class ScannerExam {
    public static void main(String[] args) {
        
        // 데이터를 사용자로부터 입력받는다.


        // a. 키보드를 스캔하는 객체를 만들어준다.
        Scanner scan = new Scanner(System.in); // 사용자에게 입력받는 코드(우선 이대로 이해하자)
                                               // 스캐너라는 객체를 Heap에 만들어서 참조값을 가져오는 것
                                               // System.in = 시스템의 input device이므로 키보드라고 생각하자

        // b. 키보드에서 엔터키입력까지 읽어온다.
        String inputStr = scan.nextLine();

        // c. 읽어온 문자열을 int로 변환한다.
        int val = Integer.parseInt(inputStr);

        // d. 100을 더한 후 출력해본다.
        val = val + 100;
        System.out.println(val);
    }
}
