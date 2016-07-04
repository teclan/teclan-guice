package teclan.guice.inject;

import org.junit.Test;

import com.google.inject.Guice;
import com.google.inject.Injector;

import teclan.guice.Module.MoneyModule;

public class MoneyTest {

    @Test
    public void moneyTest() {

        Injector injector = Guice.createInjector(new MoneyModule());

    }

}
