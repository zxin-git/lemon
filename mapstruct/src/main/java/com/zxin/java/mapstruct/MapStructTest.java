package com.zxin.java.mapstruct;

import java.util.Date;

/**
 * @author zxin
 */
public class MapStructTest {

    public static void main(String[] args) {
        BO bo = new BO();
        bo.setDate(new Date());
        CommonMapper commonMapper = CommonMapper.INSTANCE;
        DTO dto = commonMapper.toDTO(bo);
        System.out.println(dto);
    }
}
