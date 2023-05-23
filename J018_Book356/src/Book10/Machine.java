package Book10;

public abstract class Machine {

    public void powerOn() { }
    public void powerOff() { }
    public abstract void work(); // 추상메소드(오류의 원인)
}
