package teclan.guice.model;

public class Money {

    private int money;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Money add() {
        this.money++;
        return this;
    }

    public Money add(int money) {
        this.money += money;
        return this;
    }

    public void show() {
        System.out.println("money = " + money);
    }

}
