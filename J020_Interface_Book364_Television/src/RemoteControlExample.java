public class RemoteControlExample {
    public static void main(String[] args) throws Exception {
        
        RemoteControl rc;

        // rc 변수에 Television 객체를 대입
        rc = new Television();
        rc.turnOn();

        // rc 변수에 Audio 객체를 대입(교체시킴)
        rc = new Audio();
        rc.turnOn(); // 이 경우 실제 실행되는 것은 Audio에서 재정의된 turnOn() 메소드

        // 인터페이스의 상수
        // 구현 객체와 관련이 없는 인터페이스 소속 멤버이므로 바로 접근해서 읽을 수 있다.
        System.out.println("리모콘 최대 볼륨: " + RemoteControl.MAX_VOLUME);
        System.out.println("리모콘 최저 볼륨: " + RemoteControl.MIN_VOLUME);

    }
}
