public class Unit {
    
    // 메소드 오버라이딩
    public void attack() {
        System.out.println("Unit Attack!");
    }

    // 이 클래스의 목적은 무엇일까?
    // 어제의 Patient.java 처럼 공통요소를 두려는 목적이 아니다.
    // 사실 attack 메소드도 여기에 있지 않아도 된다. 이미 오버라이딩되었기 때문이다.
    // 그렇다면 이 클래스는 왜 존재해야 하는걸까?
    // 실체가 있는 별도의 인스턴스를 만들려고 하는 것이 아니라
    // 하위클래스의 메소드(attack, move 등)를 재정의하기 위한 실체가 없는 클래스이다.
    // 인터페이스 용도
    // 이런 클래스를 '추상클래스(Abstract Class)'라고 한다.
}
