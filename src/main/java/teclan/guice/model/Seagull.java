package teclan.guice.model;

import com.google.inject.Inject;

import teclan.guice.service.FlyService;

public class Seagull {

    @Inject
    private FlyService flyService;

    @Inject
    private Countor countor;

    @Inject
    private Money money;

    public void fly() {
        flyService.fly();
    }

    public FlyService getFlyService() {
        return flyService;
    }

    public Countor getCountor() {
        return countor;
    }

    public Money getMoney() {
        return money;
    }

}
