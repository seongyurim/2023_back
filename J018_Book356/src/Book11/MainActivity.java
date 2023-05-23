package Book11;

public class MainActivity extends Activity {
    
    @Override
    public void onCreate() {
        super.onCreate();
        System.out.println("추가적인 실행 내용");
    }

    // 현재 클래스에서 onCreate()를 실행할 때 부모클래스의 onCreate()도 실행시키고 싶다면?
    // 해당 메소드 안에 super.onCreate()를 작성해서 부모클래스의 메소드를 소환한다.
    
}
