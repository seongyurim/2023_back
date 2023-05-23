public class Driver {
    
    public void drive(Vehicle vehicle) {
        if (vehicle instanceof Bus) {
            Bus bus = (Bus)vehicle;
            bus.busLamp();
        }
        else if (vehicle instanceof Taxi) {
            Taxi taxi = (Taxi)vehicle;
            taxi.check();
        }
        vehicle.run();
    }

    // 지금 이 코드를 실무에서 만들라고 하면 굉장히 어려운 난이도이다.
    // 확장성 활용, 코드를 줄이는 것 = 매우 어렵기 때문이다.
    // 이렇게 계속 만들어봐야지 생각하지 않아도 된다.
    // 이론적인 내용만 잘 파악해두자.

}
