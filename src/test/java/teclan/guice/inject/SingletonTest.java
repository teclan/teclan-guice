package teclan.guice.inject;

import org.junit.Test;

import com.google.inject.Guice;
import com.google.inject.Injector;

import teclan.guice.Module.CountorModule;
import teclan.guice.model.Countor;

public class SingletonTest {

    @Test
    public void singletonTest() {

        Injector injector = Guice.createInjector(new CountorModule());

        Countor countor = injector.getInstance(Countor.class);

        // Countor countor = new Countor();

        new MyThread1(countor).start();
        new MyThread2(countor).start();

    }

    class MyThread1 extends Thread {

        Countor countor;

        public MyThread1(Countor countor) {
            this.countor = countor;
        }

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                countor.add(1);
                countor.show();
            }
        }
    }

    class MyThread2 extends Thread {

        Countor countor;

        public MyThread2(Countor countor) {
            this.countor = countor;
        }

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                countor.add(2);
                countor.show();
            }
        }
    }

}
