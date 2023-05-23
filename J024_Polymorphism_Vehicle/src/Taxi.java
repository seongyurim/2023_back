public class Taxi implements Vehicle, ThreadUnsafe {
    
    // 추상메소드 재정의
    @Override
    public void run() {
        System.out.println("택시가 달립니다.");
    }

    public void check() {
        System.out.println("[택시] 손님이 내렸는지 확인합니다.");
    }

    // 메소드를 단일스레드에서만 돌게끔 사용자에게 안내하고 싶다.(멀티스레드에서 호출되면 작동되지 않도록)
    // ThreadUnsafe 인터페이스를 만들었다. 이것이 마커 인터페이스이다.
    // 마커 인터페이스(Marker Interface)
    // - 인터페이스 자체는 비어 있음
    // - 사용자가 택시 클래스 맨위를 보면, '스레드에 안전하지 않구나'를 알려주려는 목적
    // - ex. Serializable(자바 기본 라이브러리에서 제공됨): 데이터를 직렬화하는 기능

}
