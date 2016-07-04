package teclan.guice.Module;

import com.google.inject.AbstractModule;

import teclan.guice.model.Countor;
import teclan.guice.service.FlyService;
import teclan.guice.service.spi.DefaultFlyService;

public class CountorModule extends AbstractModule {

    @Override
    protected void configure() {
        // 将 Countor 绑定为单例,也可以在声明类的时候加上 @Singleton 注释,形如:
        // @Singleton
        // class Countor { ...}
        // 使用的时候只要 @Inject 此类型的一个对象就可以.
        // 参考 declean.guice.inject.zooTest()
        bind(Countor.class).asEagerSingleton();

        bind(FlyService.class).to(DefaultFlyService.class);

    }

}
