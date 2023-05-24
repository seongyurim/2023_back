public class AExample {
    public static void main(String[] args) {

        // B 객체를 A 클래스 외부에 생성하려면
        // default 혹은 public이어야 하고,

        // A 객체를 먼저 생성해야
        A a = new A();

        // B 객체를 생성할 수 있다.
        // A.B b = a.new B();

        a.useB();

    }
}
