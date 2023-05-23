public class Car {
    
    // 필드
    Tire tire;

    // 생성자
    public Car() {
        tire = new HankookTire();
    }

    // 메소드
    void run() {
        tire.roll();
    }

}
