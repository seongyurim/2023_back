package Login;

public class SamsungLogin implements Login {
    
    @Override
    public void login(String id, String pw) {
        System.out.println("삼성전자 로그인 기능");
    }
}
