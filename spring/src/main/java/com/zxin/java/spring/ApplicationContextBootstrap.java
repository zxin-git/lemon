package com.zxin.java.spring;

import com.zxin.java.spring.bean.BeansConfig;
import com.zxin.java.spring.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zxin
 */
public class ApplicationContextBootstrap {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(BeansConfig.class);
        Person person = ctx.getBean("pe2", Person.class);
        System.out.println(person.getAge());
    }
}
