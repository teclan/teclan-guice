package teclan.guice.provider;

import com.google.inject.Provider;
import com.google.inject.Singleton;

import teclan.guice.model.Money;

// 此处直接使用 @Singleton 注释并不会达到单例效果,要想达到单例效果,除了添加 @Singleton注释之外,
// 必须使用方法二加 Modulel里面的绑定方式一 ,或者在Module里面 使用 asEagerSingleton();

@Singleton
public class MoneyProvider implements Provider<Money> {

    private Money money = null;

    // public Money get() {
    // return new Money();
    // }

    // 方式 二
    public Money get() {
        return money == null ? money = new Money() : money;
    }

}
