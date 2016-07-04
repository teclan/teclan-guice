package teclan.guice.Module;

import com.google.inject.AbstractModule;

import teclan.guice.model.Money;
import teclan.guice.provider.MoneyProvider;

public class MoneyModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(Money.class).toProvider(MoneyProvider.class);
    }

}
