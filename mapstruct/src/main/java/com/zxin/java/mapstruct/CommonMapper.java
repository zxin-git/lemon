package com.zxin.java.mapstruct;

import lombok.Builder;
import lombok.Data;
import org.mapstruct.BeanMapping;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import java.util.Date;
import java.util.List;

@Mapper
public interface CommonMapper {

    CommonMapper INSTANCE = Mappers.getMapper(CommonMapper.class);

    String TO_DTO = "toDTO";

//    @BeanMapping(ignoreByDefault = true) //声明显式转换
    @Named(TO_DTO)
    @Mapping(source = "boName", target = "dtoName")
    @Mapping(target = "date", dateFormat = "yyyy-MM-dd")
    @Mapping(target = "localDateTime", dateFormat = "yyyy-MM-dd hh:mm:ss")
    @Mapping(target = "dayOfWeek", expression = "java(com.zxin.java.mapstruct.Converter.toString(bo.getDayOfWeek()))")
    DTO toDTO(BO bo);

    @BeanMapping(ignoreByDefault = true)
    BO toBO(DTO dto);

    @IterableMapping(qualifiedByName = TO_DTO)
    List<DTO> toDTOList(List<BO> boList);

    default String priceToString(Integer integer){
        return integer.toString() + ".00";
    }

}

