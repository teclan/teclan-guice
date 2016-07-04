package teclan.guice.inject;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.name.Named;
import com.typesafe.config.Config;

import teclan.guice.Module.ConfigModule;

public class ConfigTest {

    @Inject
    @Named("config.enable")
    private boolean enable;

    @Inject
    @Named("config.db")
    private Config dbConfig;

    public void start() {

        System.out.println("是否启用配置文件 : " + enable);
        System.out.println("数据库路径 : " + dbConfig.getString("jdbc.db-path"));
        System.out.println("用户 : " + dbConfig.getString("jdbc.user"));
        System.out.println("密码 : " + dbConfig.getString("jdbc.password"));
        System.out
                .println("是否迁移 : " + dbConfig.getBoolean("migration.migrate"));

    }

    public static void main(String[] args) {

        Injector injector = Guice
                .createInjector(new ConfigModule("config.conf", "config"));

        ConfigTest configTest = injector.getInstance(ConfigTest.class);
        configTest.start();
    }

}
