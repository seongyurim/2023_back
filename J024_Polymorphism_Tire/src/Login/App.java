package Login;

public class App {
    public static void main(String[] args) {
        
        WebServer webServer = new WebServer();

        webServer.setLogin(new SamsungLogin());
        webServer.setLogin(new NaverLogin());
    }
}
