public interface Friends {

    // 인터페이스의 필드X 상수O
    // static이 기본값이라 생략할 수 있지만 명시적으로 추가하고는 한다.
    static int MAX = 10;
    
    // 인터페이스는 public이 기본값이므로 생략가능
    void show();

    // 구현부도 정의할 수는 있다.(매우 예외적)
    // 하지만 사용하지 않는 편이 낫다.
    // 인터페이스의 사상과도 부합하지 않는다.
    // 그럴거면 차라리 클래스 상속이 더 낫다.
    default void f1() {

    }
    
}
