package SingletonBasic;
public class SingleBungleApp {
    public static void main(String[] args) throws Exception {
        
        // 외부에서 SingleBunble 클래스를 가져올 수 없다.
        // SingleBungle obj = new SingleBungle();

        SingleBungle obj1 = SingleBungle.getInstance();
        SingleBungle obj2 = SingleBungle.getInstance();

        // 동일한 객체를 참조하는게 맞는지 확인해보자.
        if (obj1.equals(obj2)) {
            System.out.println("동일한 SingleBungle 객체입니다."); // printed
        } else {
            System.out.println("서로 다른 SingleBungle 객체입니다.");
        }

    }
}
