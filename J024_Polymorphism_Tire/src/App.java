public class App {
    public static void main(String[] args) throws Exception {
        
        // 자동차 객체 생성
        Car myCar = new Car();

        // run 메소드 실행
        System.out.println("1. run 메소드 실행 ------------");
        myCar.run(); // 한국 타이어가 굴러갑니다.

        // 타이어 객체 교체
        myCar.tire = new KumhoTire();
        // 이 코드의 의미: 외부에서 객체를 만들어 클래스의 속성으로 집어넣고 있다.
        // 좋은 코드는 아님

        // run 메소드 재실행(다형성으로 인해 다른 결과가 출력됨)
        System.out.println("2. run 메소드 재실행 ----------");
        myCar.run(); // 금호 타이어가 굴러갑니다.
    }
}
