public class App {
    public static void main(String[] args) throws Exception {
        
        // Dummy.java
        Dummy dm = new Dummy();
        dm.setA(10);

        System.out.println(dm.getA());

        // Dummy는 클래스(empty)이므로 이렇게 사용할 수 없음
        // Dummy.setA(10);

        // static 변수이므로 가능
        System.out.println(Dummy.g);




        /////////////////////////////////////////////////////////////////////////////////////////////

        // Circle.java
        Circle c1 = new Circle();
        c1.radius = 10;

        Circle c2 = new Circle();
        c2.radius = 5;

        // pi가 c2 객체에 있지 않고 Global에 있는데 코드가 돈다니..?! Sugar-code!
        // Pre-processor가 코드정리를 하면서 Circle.pi = 3.0;으로 바꿔버렸기 때문에 돈 것이다.
        // c2.pi = 3.0;

        System.out.println(c1.getSize());
        System.out.println(c2.getSize());


        System.out.println(c1.getCircum(5));


    }
}
