package teclan.guice.service.spi;

import teclan.guice.service.FlyService;

public class TestFlyService implements FlyService {

    public void fly() {
        System.out.println("This is TestFlyService !");
    }

}
