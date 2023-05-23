public interface RemoteControl {

    // 상수 선언
    // 인터페이스에 선언된 필드는 모두 public static final 성격을 갖는다. (따라서 생략 가능)
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;
    
    // public 추상 메소드
    public void turnOn();
}
