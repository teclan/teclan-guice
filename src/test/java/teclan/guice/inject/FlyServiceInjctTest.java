package teclan.guice.inject;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.google.inject.Guice;
import com.google.inject.Injector;

import teclan.guice.Module.DefaultFlyModule;
import teclan.guice.Module.DefaultFlyServiceModuleWithProvider;
import teclan.guice.Module.TestFlyModule;
import teclan.guice.Module.TestFlyServiceModuleWithProvider;
import teclan.guice.service.FlyService;
import teclan.guice.service.spi.DefaultFlyService;
import teclan.guice.service.spi.TestFlyService;

public class FlyServiceInjctTest {

    @Test
    public void bindDefaultFlyServiceTest() {

        Injector injector = Guice.createInjector(new DefaultFlyModule());
        FlyService service = injector.getInstance(FlyService.class);
        System.out.print("bindDefaultFlyServiceTest:");
        service.fly();
        assertTrue(DefaultFlyService.class.equals(service.getClass()));
    }

    @Test
    public void bindTestFlyServiceTest() {

        Injector injector = Guice.createInjector(new TestFlyModule());
        FlyService service = injector.getInstance(FlyService.class);
        System.out.print("bindTestFlyServiceTest:");
        service.fly();
        assertTrue(TestFlyService.class.equals(service.getClass()));
    }

    @Test
    public void bindDefaultFlyServiceWithProviderTest() {

        Injector injector = Guice
                .createInjector(new DefaultFlyServiceModuleWithProvider());
        FlyService service = injector.getInstance(FlyService.class);
        System.out.print("bindDefaultFlyServiceWithProviderTest:");
        service.fly();
        assertTrue(DefaultFlyService.class.equals(service.getClass()));
    }

    @Test
    public void bindTestFlyServiceWithProviderTest() {

        Injector injector = Guice
                .createInjector(new TestFlyServiceModuleWithProvider());
        FlyService service = injector.getInstance(FlyService.class);
        System.out.print("bindTestFlyServiceWithProviderTest:");
        service.fly();
        assertTrue(TestFlyService.class.equals(service.getClass()));
    }

}
