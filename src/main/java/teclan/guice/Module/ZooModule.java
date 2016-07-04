package teclan.guice.Module;

import com.google.inject.AbstractModule;

import teclan.guice.model.Countor;
import teclan.guice.model.Money;
import teclan.guice.provider.MoneyProvider;
import teclan.guice.service.FlyService;
import teclan.guice.service.spi.DefaultFlyService;

public class ZooModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(Countor.class).asEagerSingleton();

        bind(FlyService.class).to(DefaultFlyService.class);

        // 绑定方式 一,使用 MoneyProvider 的方式二 才达到单例效果
        bind(Money.class).toProvider(MoneyProvider.class);

        // 绑定方式 二
        // bind(Money.class).toProvider(MoneyProvider.class).asEagerSingleton();
    }

}
