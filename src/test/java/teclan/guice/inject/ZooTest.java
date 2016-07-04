package teclan.guice.inject;

import org.junit.Test;

import com.google.inject.Guice;
import com.google.inject.Injector;

import teclan.guice.Module.ZooModule;
import teclan.guice.model.Zoo;

public class ZooTest {

    @Test
    public void zooTest() {
        Injector injector = Guice.createInjector(new ZooModule());
        Zoo zoo = injector.getInstance(Zoo.class);

        zoo.fly();

        zoo.getSeagull().getCountor().show();
        zoo.getSeagull().getCountor().add(100).show();
        zoo.getSeagull().getCountor().show();
        zoo.getEagle().getCountor().show();

        zoo.getSeagull().getMoney().show();
        zoo.getSeagull().getMoney().add(55).show();
        zoo.getSeagull().getMoney().show();
        zoo.getEagle().getMoney().show();
    }

}
