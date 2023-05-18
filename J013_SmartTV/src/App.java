public class App {
    public static void main(String[] args) throws Exception {
        
        TV tv1 = new TV(55);
        tv1.powerOn();
        tv1.powerOff();

        SmartTV stv = new SmartTV();
        stv.powerOn();
        stv.startNetflix();

        // 이렇게 구현하라고 배운 것이 아니다. 알고만 있자.
        // SmartTV가 필요하면 TV가 아니라 SmartTV에 넣는 것이 지극히 알맞다.
        TV tv2 = new SmartTV();
        tv2.powerOn();
        tv2.changeChannel(11);
        // tv2.startNetflix(); // error
        System.out.println(tv2.getChannel());
    }
}
