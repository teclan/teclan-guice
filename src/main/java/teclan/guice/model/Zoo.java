package teclan.guice.model;

import com.google.inject.Inject;

public class Zoo {

    @Inject
    private Seagull seagull;
    @Inject
    private Eagle   eagle;

    public void fly() {

        System.out.print("seagull:");
        seagull.fly();
        System.out.print("eagle:");
        eagle.fly();
    }

    public Seagull getSeagull() {
        return seagull;
    }

    public Eagle getEagle() {
        return eagle;
    }
}
