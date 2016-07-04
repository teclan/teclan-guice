package teclan.guice.Module;

import com.google.inject.AbstractModule;

import teclan.guice.provider.TestFlyServiceProvider;
import teclan.guice.service.FlyService;

public class TestFlyServiceModuleWithProvider extends AbstractModule {

    @Override
    protected void configure() {
        // 使用 Provider 绑定数据
        bind(FlyService.class).toProvider(TestFlyServiceProvider.class);

    }

}
