package SingletonBasic;
public class SingleBungle {
    
    // private 접근 권한을 갖는 정적필드 선언과 초기화
    private static SingleBungle sb = new SingleBungle();

    private int xSize;
    private int ySize;

    public void init() {
        xSize = 1920;
        ySize = 1080;
    }

    // private 접근 권한을 갖는 생성자 선언
    private SingleBungle(){
    }

    // 외부에서 불러오게 하는 메소드
    public static SingleBungle getInstance() {
        if (sb == null) {
            SingleBungle.sb = new SingleBungle();
        }
        return SingleBungle.sb;
    }
}
