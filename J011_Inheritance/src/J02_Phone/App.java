package J02_Phone;

public class App {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.bell();
        phone.sendVoice("안녕하세요");
        phone.receiveVoice("끊을게요");
        phone.hangUp();
    }
}
