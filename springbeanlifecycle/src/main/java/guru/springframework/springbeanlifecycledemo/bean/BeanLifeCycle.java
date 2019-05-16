package guru.springframework.springbeanlifecycledemo.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanLifeCycle implements InitializingBean,DisposableBean {



    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("In afterPropertiesSet");
    }

   @Override
   public void destroy() throws Exception {
        System.out.println("In destroy");
    }

    @PostConstruct
    public void customInit(){
        System.out.println("In customInit ");
    }

    @PreDestroy
    public void customDestroy(){
        System.out.println("In customDestroy");
    }
}

