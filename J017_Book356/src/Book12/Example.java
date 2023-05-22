package Book12;

public class Example {

    public static void action(A a) { // 파라미터를 상위클래스의 참조값으로 받음
        a.method1();
        if (a instanceof C c) { // a의 참조객체가 c 객체냐?
            c.method2();
        }
    }

    public static void main(String[] args) {
        action(new A());
        action(new B());
        action(new C());
    }

}
