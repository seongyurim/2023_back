package G05_InterfaceAndInheritance_Fruit;

public class Box<T extends Eatable> { // 인터페이스: 먹을 수 있는 것들만 들어오렴
// public class Box<T extends java.lang.Number> { // 상속: Number에게 상속받은 것들만 들어오렴
// public class Box<T extends Number & Eatable> { // 인터페이스 + 상속 함께 사용

    private T fruit;

    public Box() {
        fruit = null;
    }

    public Box(T fruit) {
        this.fruit = fruit;
    }

    public T get() { return fruit; }
    public void set(T fruit) { this.fruit = fruit; }

    @Override
    public String toString() {
        return fruit.toString();
    }

    // 인터페이스: <T extends Eatable>
    public void eatFruit() {
        // fruit.eat(); // 인터페이스 선언이 없으면 error
    }

    // 상속: <T extends java.lang.Number>
    // public int getIntValue() {
    //     return fruit.intValue();
    // }

    // 마지막 세번째 방법이 있다. 무엇일까?
    // 인터페이스+상속을 합쳐서 제한하는 방법도 있다.
    // <T extends Number & Eatable>
}
