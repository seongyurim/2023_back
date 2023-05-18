
public class App {
    public static void main(String[] args) throws Exception {

        // 서로 동일한 객체에 넣는 경우
        Child c1 = new Child();
        Parent p1 = new Parent();

        // 서로 다른 객체에 넣는 경우(자동 타입 변환, 327p)
        Parent p2 = new Child(); // Child 객체를 만들어서 Parent 객체에 넣음
        // Child c2 = new Parent(); // error

    }
}
