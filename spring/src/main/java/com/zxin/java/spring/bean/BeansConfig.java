package com.zxin.java.spring.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zxin
 */
@Configuration
public class BeansConfig {

    @Bean
    public Person pe(){
        return new Person("Sun Simiao", 140);
    }

    @Bean
    public Person pe2(){
        return new Person("Zhang Sanfeng", 320);
    }
}
