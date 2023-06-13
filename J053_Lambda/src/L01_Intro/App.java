package L01_Intro;
public class App {

    public static void printDocument(Printable p, String s) {
        p.print(s);
    }
    
    public static void main(String[] args) throws Exception {

        Printer prn1 = new Printer(); // Printer 참조변수는 Printer의 모든 기능을 사용
        Printable prn2 = new Printer(); // Printable 참조변수는 Printer의 모든 기능 중 인터페이스 구현 기능만 사용   
        
        printDocument(new Printer(), "abcaa"); // well-printed

        // Printable prn3 = new Printable(); // 불가능. 인터페이스는 인스턴스화할 수 없으므로
        
        // 아래 prn3, prn4는 익명 객체(정석은 아님)
        // 예를 들어 사람을 부를 때
        // 일반 객체: 홍길동씨!
        // 익명 객체: 자네!(홍길동의 손을 잡으며) ==> 클래스 이름을 생략할 수 있다.

        // 익명객체: 인터페이스 구현의 의미
        // 위에서 했던 것처럼 Printable 인터페이스를 따로 생성하지 않아도 되어 간편하다.
        // Printable prn3 = new Printable() { // 이제는 new Printable()도 필요 없다. 뒤에 구현부가 바로 와있기 때문이다. 아래처럼 없애자.
        // Printable prn3 = { 
        Printable prn3 = new Printable() {
            @Override
            public void print(String str) {
                System.out.println("익명 객체 Printable을 통한 출력: " + str);
            }
        };
        
        // 익명객체: 기존의 Printer 클래스 전체를 아예 재정의한다는 의미
        // 사실상 Printer 이름만 가져다 쓴 것이다. 이전의 Printer는 아예 사라지는 것
        // 따라서 잘 쓰지 않는 방식
        Printable prn4 = new Printer() {
            @Override
            public void print(String str) {
                System.out.println("익명 객체 Printer를 통한 출력: " + str);
            }
        };

        // prn3에서 줄여오던 것을 이렇게까지 줄였다 = 람다식이 되었다.
        Printable prn5 = (str) -> {System.out.println("람다식: " + str);}; // 우항은 메소드가 아니라 객체라는 점에 주의
        
        // 실제로는 객체인데, 표현은 마치 생략된 함수처럼 표현하는 방식을 '람다 표현식(Lambda Expression)'이라 한다.
        // 람다식은 클래스를 '편리하게 구현'하기 위한 목적을 가진다.
        // 람다식은 '메소드가 하나인 인터페이스'를 기반으로 하는 것이 일반적이다.
        
        printDocument(prn5, "abccc"); // well-printed
        printDocument((str) -> {System.out.println("람다식: " + str);}, "abcdd"); // well-printed

        // 함수형 프로그래밍
        // 함수를 기반으로 하는 프로그래밍
        // 하지만 사실 자바는 '함수 객체'를 지원하지 않는다.
        // 따라서 함수 객체를 만들려면 리스크가 너무나 크다.
        // 그래서 위처럼 기존 메소드를 계속 생략하는 과정을 거쳐버렸다.
        // 그래서 겉으로는 '함수처럼 보이는 객체'를 참조할 수 있게 되었다.
        // 이것이 함수형 프로그래밍이다.
        // 어떤 기능을 출력하기 위해서 객체를 왔다갔다 하는 것이 아니라

        // ex. 컬러프린트
        // 출력 함수에 파라미터로 스마트폰, 태블릿, 인터폰을 넣는 것이 아니라
        // 함수에 '스마트폰으로 출력', '태블릿으로 출력', '인터폰으로 출력'을 넣는 것이다.

        // 람다식 = 인터페이스 + 익명객체 + 컴파일러의 생략 기술

        prn1.print("Printer"); 
        prn2.print("Printable");
        prn3.print("Anonymous Printable");
        prn4.print("Anonymous Printer");
        // prn4.a = 10; // 불가능
        prn5.print("Lamda's Coming");

        ///////////////////////////////////////////////////////////////////

        // 16.2 매개변수가 없는 람다식

        // 실행문이 한 줄인 경우 객체의 중괄호 { } 생략 가능
        Printable prn6 = (str) -> System.out.println("람다식: " + str);

        // 파라미터가 하나이면 소괄호 ( ) 생략 가능
        Printable prn7 = str -> System.out.println("람다식: " + str); 

        // 파라미터가 여러개인 경우 연속해서 작성할 수 있다.
        Scannable scn2 = (dpi, bColor) -> System.out.println("해상도: " + dpi + " 컬러: " + bColor);

        // 파라미터가 없는 경우
        Terminatable tmt = () -> System.out.println("STOP");

        // 리턴값이 있는 경우
        Addable add1 = (a, b) -> {return a + b;};
        int c = add1.add(10, 20);

        // 리턴값이 있고 + 실행문이 한 줄인 경우: return도 생략 가능하다.
        Addable add2 = (a, b) -> a + b; // cf. 람다 대수
        c = add2.add(10, 40);
        // 현업에서는 아무도 add2 처럼 코딩하지 않으므로 알아만 두자.

    }
}
