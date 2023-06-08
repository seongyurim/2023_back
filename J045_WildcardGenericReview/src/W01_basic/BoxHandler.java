package W01_basic;
public class BoxHandler {
    
    // Box의 내용물을 확인하는 함수(Box - Reading Only)
    public static void popBox(Box<? extends Toy> box) {

        Toy t = box.get();
        System.out.println(t);

        // box.set(new Toy()); // error
        // 파라미터로 들어온 box가 이렇게 바뀌면 컴파일 에러가 발생된다.
    }

    // Box에 Toy를 넣는 함수(Box - Writing Only)
    public static void pushBox(Box<? super Toy> box, Toy t) {

        box.set(t);

        // Toy obj = box.get(); // error
        // 안돌아갈 가능성이 있으므로 컴파일 에러가 발생된다.
    }
}
