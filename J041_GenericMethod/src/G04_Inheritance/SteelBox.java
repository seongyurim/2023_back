package G04_Inheritance;

// public class SteelBox<T> extends Box<T> { // 컴파일 에러
public class SteelBox<T extends Number> extends Box<T> { // 컴파일 통과
    // 상위클래스의 데이터타입에 제한이 걸리면 당연히 하위클래스도 제한되는 것이 당연하다. 그래서 오류 발생
    // 따라서 상위클래스의 제한조건을 그대로 받아야 한다.
    // extends Number는 앞의 SteelBox에만 선언해주면 된다.
    // SteelBox "부모의 extends Number 제한을 상속받은 것이 바로 나다!"
        
    public SteelBox() {}
    public SteelBox(T obj) {
        super(obj);
    }
}
