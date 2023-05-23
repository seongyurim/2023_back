package Book08;

public class Example {
    
    public static void action(A a) {
        a.method1();
        if (a instanceof C) { // -
            C c = (C)a;      // - 이 두줄을 if (a instanceof C c)로 줄이는 것은 슈가코드
            c.method2();
        }
    }

    public static void main(String[] args) {
        action(new B());
        action(new C());
    }
}
