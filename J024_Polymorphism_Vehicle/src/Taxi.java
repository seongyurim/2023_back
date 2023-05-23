public class Taxi implements Vehicle {
    
    // 추상메소드 재정의
    @Override
    public void run() {
        System.out.println("택시가 달립니다.");
    }

    public void check() {
        System.out.println("[택시] 손님이 내렸는지 확인합니다.");
    }

}
