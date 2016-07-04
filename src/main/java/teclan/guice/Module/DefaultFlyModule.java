package teclan.guice.Module;

import com.google.inject.AbstractModule;

import teclan.guice.service.FlyService;
import teclan.guice.service.spi.DefaultFlyService;

public class DefaultFlyModule extends AbstractModule {

    @Override
    protected void configure() {

        // 将 DefaultFlyService 类与 FlyService 接口绑定,之后 FlyService 指向的就是
        // DefaultFlyService 的实现,同样也可以指向其他的实现,请参考
        // declean.guice.Module.TestFlyModule
        bind(FlyService.class).to(DefaultFlyService.class);

    }

}
