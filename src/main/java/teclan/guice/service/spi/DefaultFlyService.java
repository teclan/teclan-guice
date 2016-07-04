package teclan.guice.service.spi;

import teclan.guice.service.FlyService;

public class DefaultFlyService implements FlyService {

    public void fly() {
        System.out.println("This is DefaultFlyService !");
    }

}
