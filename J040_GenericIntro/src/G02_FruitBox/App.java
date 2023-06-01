package G02_FruitBox;
public class App {
    public static void main(String[] args) throws Exception {
        
        // 과일별 상자 객체 생성
        AppleBox aBox1 = new AppleBox();
        BananaBox bBox1 = new BananaBox();

        // 박스에 집어 넣는다.
        aBox1.set(new Apple());
        bBox1.set(new Banana());

        // 박스에서 꺼낸다.
        Apple apple1 = aBox1.get();
        Banana banana1 = bBox1.get();

        System.out.println(apple1);
        System.out.println(banana1);



        ////// Box Class를 만든 후... ////////////////////////////////////////////////////////////////

        Box aBox2 = new Box();
        Box bBox2 = new Box();

        // 박스에 집어 넣는다.
        aBox2.set(new Apple());
        bBox2.set(new Banana());

        // 박스에서 꺼낸다.
        Apple apple2 = (Apple)aBox2.get();
        Banana banana2 = (Banana)bBox2.get();
        // 강제로 타입캐스팅을 해야 하게 되었다.
        // 원래 타입캐스팅은 안하는 상황을 만드는 것이 좋은 것이다.
        // 오브젝트를 이렇게 캐스팅하는 것은 좋은 코드가 아니다. 불안한 코드.
        // aBox2.set(new String("김철수")); // 이런 객체까지 가능해지기 때문이다.

        System.out.println(apple2);
        System.out.println(banana2);

        

        ////// 제네릭 사용 후... /////////////////////////////////////////////////////////////////////

        Box<Apple> aBox3 = new Box<Apple>();
        Box<Banana> bBox3 = new Box<Banana>();

        // 박스에 집어 넣는다.
        aBox3.set(new Apple());
        bBox3.set(new Banana());
        // bBox3.set(new String("김철수")); // 드디어 컴파일 에러 발생~!

        // 박스에서 꺼낸다.
        Apple apple3 = aBox3.get();
        Banana banana3 = bBox3.get();

        System.out.println(apple3);
        System.out.println(banana3);

    }
}
