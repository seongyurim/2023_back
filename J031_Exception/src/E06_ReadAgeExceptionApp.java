import java.util.Scanner;

public class E06_ReadAgeExceptionApp {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.printf("나이를 입력하세요 > ");
        int age = -1;
        
        
        // if ((age < 0) || (age >= 150)) {
            //     System.out.println("ERROR");
            //     return;
            // }
            // 이렇게 말고 '예외처리'로 하고 싶다면
            
            
            try {
                age = scan.nextInt();
                
                if ((age < 0) || (age >= 150)) {
                    throw new E06_ReadAgeException();
                }
            }
            catch(E06_ReadAgeException e) {
                System.out.println(e.getMessage());
            }
            // 이렇게 예외처리를 하는 것이 맞을까?
            // 이 상황보다는 주로 '생성자'에서 사용한다.
            // 예를 들어 student 객체를 생성한다.
            // 이름, 학년, 나이가 필요하다.
            // 누군가가 나이에 150을 입력하면 객체를 생성시켜주고 싶지 않다.
            // 이는 if문으로 만들 수 없다. 이때 예외처리를 하면 알맞다.
            // 집에 가서 한번 해보자!
            
    }
}
