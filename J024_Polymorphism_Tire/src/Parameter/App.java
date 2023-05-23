package Parameter;

public class App {
    public static void main(String[] args) {
        

        Car myCar = new Car();
        myCar.Run(100); // '시속 100km로 달립니다.'
        myCar.Run(); // '시속 100km로 크루징합니다.' 세팅되어 있는 값으로 츨력? // 다형성

        // 다형성
        // 1. Overloading - 파라미터
        // 2. Overriding - 재정의
    }
}
