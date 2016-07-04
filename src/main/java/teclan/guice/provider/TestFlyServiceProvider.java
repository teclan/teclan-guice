package teclan.guice.provider;

import com.google.inject.Provider;

import teclan.guice.service.FlyService;
import teclan.guice.service.spi.TestFlyService;

public class TestFlyServiceProvider implements Provider<FlyService> {

    public FlyService get() {
        return new TestFlyService();
    }

}