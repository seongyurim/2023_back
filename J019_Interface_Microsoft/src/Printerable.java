// 1. 강제성이 있는 추상 자료구조
// 2. 규약만 존재
// 3. 객체화 불가능
// 4. 기본적으로 상속 매커니즘을 사용 (내부적으로 상속구조)
// 5. 규약(메소드)은 public이 기본 (규약인데 private인 것은 말이 안됨)

public interface Printerable {
    
    // 규약만 존재
    // private int a; // 이것은 규약이 아니라 구현용이므로 사용이 불가하다.

    // 369p의 상수 선언
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;
    // 이는 앞에 (public static final)이 생략되어 있기 때문에 가능한 것이다.
    // 일반적인 구현용이 아니라는 의미이다.
    // 상수명 규칙: 대문자로 작성. 서로 다른 단어는 언더바로 연결하는 것이 관례

    int func(String str); // <== public int func(String str);와 같음. public이 기본이기 때문
}
