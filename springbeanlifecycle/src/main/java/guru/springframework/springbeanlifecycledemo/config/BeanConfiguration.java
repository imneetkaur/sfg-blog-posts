package guru.springframework.springbeanlifecycledemo.config;


import guru.springframework.springbeanlifecycledemo.bean.BeanLifeCycle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean("beanlifecycle")
    public BeanLifeCycle getBeanLifeCycleBean(){
        return new BeanLifeCycle();
    }

}
