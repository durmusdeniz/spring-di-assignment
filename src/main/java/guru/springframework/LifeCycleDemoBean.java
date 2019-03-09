package guru.springframework;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {


    public LifeCycleDemoBean(){
        System.out.println("== LifeCycleDemoBean Constructor");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("== LifeCycleDemoBean BeanFactory set");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("== LifeCycleDemoBean Name is " + s);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("== LifeCycleDemoBean Termnated");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("== LifeCycleDemoBean's Properties are set");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("== LifeCycleDemoBean ApplicationContext is set");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("== LifeCycleDemoBean PostConstruct Called");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("== LifeCycleDemoBean PreDestroy Called");
    }

    public void beforeInit(){
        System.out.println("== LifeCycleDemoBean  - Before Init called by Bean Post Processor");
    }

    public void afterInit(){
        System.out.println("== LifeCycleDemoBean - After Init callled by Bean Post Processor");
    }
}
