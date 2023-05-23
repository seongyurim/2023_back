public interface Printerable {

    // 인터페이스를 건들일 때에는 신중해야 한다.
    // 이를 구현해야 하는 클래스들 전체의 공통분모가 맞는지 신중히 생각해봐야 한다.
    void print(String doc);

}