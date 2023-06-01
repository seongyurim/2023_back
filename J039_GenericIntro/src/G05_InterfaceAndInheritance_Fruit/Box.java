package G05_InterfaceAndInheritance_Fruit;

// public class Box<T extends Eatable> { // 인터페이스: 먹을 수 있는 것들만 들어오렴
// public class Box<T extends java.lang.Number> { // 상속: Number에게 상속받은 애들만 들어오렴
public class Box<T extends Number & Eatable> { // 인터+상속

    private T fruit;

    public Box() {
        fruit = null;
    }

    public Box(T fruit) {
        this.fruit = fruit;
    }

    public void set(T fruit) {
        this.fruit = fruit;
    }

    public T get() {
        return fruit;
    }

    @Override
    public String toString() {
        return fruit.toString();
    }

    // 인터페이스: <T extends Eatable>
    public void eatFruit() {
        // fruit.eat(); // error. 왜일까?
        // 템플릿 클래스는 초기 컴파일 시에 최소한으로 가능한 커맨드만 검사한다.
        // 아직 타입이 정해지지 않은 상태인 것이다. (템플릿 상태)
        // "이 박스는 과일박스로만 쓸거야"는 현재 나의 생각일 뿐이고, 컴퓨터는 아직 알지 못한다.
        // 따라서 이 템플릿에는 오만가지 객체가 들어올 수 있는 상황인 것이다.

        // 이를 특정하려면? 클래스명 옆에 extends Eatable을 작성한다. (인터페이스 사용)
        // extends 이지만 상속 개념이 아니다. '제한'의 개념이다.
        // Eatable을 구현한 클래스만 들어올 수 있다고 '제한'하는 것이다.
        // 즉, 현재는 바나나와 사과만 들어올 수 있는 상태이다.

        // 이렇게 T를 제한하면 생기는 이점
        // 소스 코딩이 자유로워진다. T에 아무거나 올 수 있다는 가능성을 제한하는 것
        // 제한을 하지 않으면 오브젝트의 콜링 빼고는 쓸 수 있는 메소드가 없다.

        // 템플릿을 제한 없이 그냥 쓰는 경우는 거의 없다.

        // 제한을 거는 방법은 인터페이스 외에 상속도 있다.
        // 아래 <T extends java.lang.Number> 가 상속으로 제한하는 예시
    }

    // 상속: <T extends java.lang.Number>
    public int getIntValue() {
        return fruit.intValue();
    }

    // 마지막 세번째 방법이 있다. 무엇일까?
    // 인터페이스+상속을 합쳐서 제한하는 방법도 있다.
    // <T extends Number & Eatable>
    // 상위 클래스가 과일 + 하위 클래스가 사과와 바나나 + Eatable 인터페이스가 존재하는 경우
}
