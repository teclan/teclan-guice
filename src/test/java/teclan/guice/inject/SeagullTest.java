package teclan.guice.inject;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.google.inject.Guice;
import com.google.inject.Injector;

import teclan.guice.Module.DefaultFlyModule;
import teclan.guice.Module.DefaultFlyServiceModuleWithProvider;
import teclan.guice.Module.TestFlyModule;
import teclan.guice.Module.TestFlyServiceModuleWithProvider;
import teclan.guice.model.Seagull;
import teclan.guice.service.spi.DefaultFlyService;
import teclan.guice.service.spi.TestFlyService;

public class SeagullTest {

    @Test
    public void defaultFlyTest() {
        Injector injector = Guice.createInjector(new DefaultFlyModule());
        Seagull seagull = injector.getInstance(Seagull.class);
        System.out.print("defaultFlyTest:");
        seagull.fly();

        assertTrue(DefaultFlyService.class
                .equals(seagull.getFlyService().getClass()));
    }

    @Test
    public void testFlyTest() {
        Injector injector = Guice.createInjector(new TestFlyModule());
        Seagull seagull = injector.getInstance(Seagull.class);
        System.out.print("testFlyTest:");
        seagull.fly();

        assertTrue(TestFlyService.class
                .equals(seagull.getFlyService().getClass()));
    }

    @Test
    public void bindDefaultFlyServiceWithProviderTest() {

        Injector injector = Guice
                .createInjector(new DefaultFlyServiceModuleWithProvider());

        Seagull seagull = injector.getInstance(Seagull.class);

        System.out.print("bindDefaultFlyServiceWithProviderTest:");
        seagull.fly();
        assertTrue(DefaultFlyService.class
                .equals(seagull.getFlyService().getClass()));
    }

    @Test
    public void bindTestFlyServiceWithProviderTest() {

        Injector injector = Guice
                .createInjector(new TestFlyServiceModuleWithProvider());
        Seagull seagull = injector.getInstance(Seagull.class);
        System.out.print("bindTestFlyServiceWithProviderTest:");
        seagull.fly();
        assertTrue(TestFlyService.class
                .equals(seagull.getFlyService().getClass()));
    }

}
