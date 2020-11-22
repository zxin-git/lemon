package com.zxin.java.spring.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author zxin
 */
@Data
@AllArgsConstructor
public class Person {
    private String name;
    private Integer age;
//    private String[] addresses;
//    private Date birthDate;
//    private LocalDate graduateLocalDate;
//    private LocalDateTime marry;
}
