package W03_WildGenericMix;

public class BoxHandler {

    // 문법 공부는 했군..
    // public static void checkBox(BoxToy box) {}
    // public static void inBox(BoxToy box) {}

    // 오 조금 하는걸..? 제네릭도 쓰고..?
    // public static <T> void checkBox(Box<T> box) {}
    // public static <T> void inBox(Box<T> box, T obj) {}
    
    // 월급을 더 줘야겠는걸..?! 제한까지 하다니.. 이건 팀을 위한 코드야..!
    // 실무에서 이 정도로 짜는 것은 정말 어려운 일이다. 미래지향적 코드
    public static <T> void checkBox(Box<? extends T> box) {
        // set을 못하게 하고 싶으므로 <? extends T>
        // 정해진 타입이 아니라 T라고만 해도 된다.
        // 와일드카드와 제네릭을 섞을 수 있다는 뜻이다.
        // 이것이 핵심이다!
        // 와일드카드는 템플릿 메소드와 많이 결합된다.

        T t = box.get();
        System.out.println(t);

        // box.set(new Toy()); // error
    }

    public static <T> void inBox(Box<? super T> box, T obj) {

        box.set(obj);
    }

}
