package teclan.guice.model;

// 可以使用 @Singleton 注释声明此类是一个单例,
// 使用的时候,只要 @Inject 此类型的一个对象就可以
// 同样也可以使用绑定的方式,参见 
// declean.guice.Module.CountorModule

//@Singleton 
public class Countor {

    private int count = 0;

    public Countor add() {
        this.count++;
        return this;
    }

    public Countor add(int count) {
        this.count += count;
        return this;
    }

    public void show() {
        System.out.println("count = " + count);
    }

}
