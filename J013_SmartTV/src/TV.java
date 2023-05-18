public class TV {

    protected int screenInch;
    protected int channel;

    public TV() {
        screenInch = 0;
        channel = 0;
    }

    public TV(int inch) {
        screenInch = inch;
        channel = 0;
    }

    public void powerOn() {
        System.out.println("TV - Power On");
    }

    public void powerOff() {
        System.out.println("TV - Power Off");
    }

    public void changeChannel(int channel) {
        this.channel = channel;
    }

    public int getChannel() {
        return channel;
    }

}
