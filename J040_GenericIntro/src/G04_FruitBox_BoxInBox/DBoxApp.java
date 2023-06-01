package G04_FruitBox_BoxInBox;

public class DBoxApp {
    public static void main(String[] args) {
        
        // 커다란 상자 객체 생성
        DBox<Box<Apple>, Box<Banana>> dBox = new DBox<>();
        // DBox<Apple, Banana> dBox = new DBox<>();

        // 박스 세팅하기
        Box<Apple> aBox = new Box<>();
        Box<Banana> bBox = new Box<>();
        aBox.set(new Apple());
        bBox.set(new Banana());

        // 박스에 넣기
        dBox.set(aBox, bBox);
        // dBox.setLeft(new Apple());
        // dBox.setRight(new Banana());

        // 박스에서 꺼내기
        // Apple apple = dBox.getLeft();
        // Banana banana = dBox.getRight();

        // 출력하기
        System.out.println(dBox);
        // System.out.println(apple);
        // System.out.println(banana);

        /// 박스 세팅하기 단계의 코드 단축하기
        dBox.set(new Box<Apple>(new Apple()),
                 new Box<Banana>(new Banana()));
    }
}
