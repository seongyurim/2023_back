public class Bus implements Vehicle {
    
    // 추상메소드 재정의
    @Override
    public void run() {
        System.out.println("버스가 달립니다.");
    }

    public void busLamp() {
        System.out.println("[버스] 비상등을 켭니다.");
    }
}
