package teclan.guice.Module;

import com.google.inject.AbstractModule;

import teclan.guice.provider.DefaultFlyServiceProvider;
import teclan.guice.service.FlyService;

public class DefaultFlyServiceModuleWithProvider extends AbstractModule {

    @Override
    protected void configure() {

        // 使用 Provider 绑定数据
        bind(FlyService.class).toProvider(DefaultFlyServiceProvider.class);
    }

}
