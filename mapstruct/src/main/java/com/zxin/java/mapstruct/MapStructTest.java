package com.zxin.java.mapstruct;

import java.math.BigDecimal;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author zxin
 */
public class MapStructTest {

    public static void main(String[] args) {
        toDTOTest();
        toDTOListTest();
//        toBOTest();
    }

    public static void toDTOTest(){
        BO bo = BO.builder().boName("name")
                .date(new Date())
                .localDateTime(LocalDateTime.now())
                .localDate(LocalDate.now())
                .dayOfWeek(DayOfWeek.FRIDAY)
                .price(new BigDecimal("69.998"))
                .high(175)
                .build();
        CommonMapper commonMapper = CommonMapper.INSTANCE;
        DTO dto = commonMapper.toDTO(bo);
        System.out.println(dto);
    }

    public static void toDTOListTest(){
        BO bo = BO.builder().boName("name")
                .date(new Date())
                .localDateTime(LocalDateTime.now())
                .localDate(LocalDate.now())
                .dayOfWeek(DayOfWeek.FRIDAY)
                .price(new BigDecimal("69.998"))
                .high(175)
                .build();
        List<BO> bos = Arrays.asList(bo, bo, bo);
        CommonMapper commonMapper = CommonMapper.INSTANCE;
        List<DTO> dtos = commonMapper.toDTOList(bos);
        System.out.println(dtos);
    }

    public static void toBOTest(){
        DTO dto = DTO.builder().dtoName("name")
                .date("2020-11-22")
                .localDateTime("2020-11-22T18:03:28")
                .localDate("2020-11-22")
                .dayOfWeek("FRIDAY")
                .build();
        CommonMapper commonMapper = CommonMapper.INSTANCE;
        BO bo = commonMapper.toBO(dto);
        System.out.println(bo);
    }
}
