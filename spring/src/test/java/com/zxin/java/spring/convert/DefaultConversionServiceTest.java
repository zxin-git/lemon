package com.zxin.java.spring.convert;

import org.junit.Test;
import org.springframework.cglib.core.Local;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.support.DefaultConversionService;

import java.time.LocalDate;

/**
 * @author zxin
 */
public class DefaultConversionServiceTest {
    
    private ConversionService conversionService = DefaultConversionService.getSharedInstance();

    @Test
    public void convert() {
        LocalDate localDate = conversionService.convert("2020-03-27", LocalDate.class);
        System.out.println(localDate);
    }
}
