package com.zxin.java.mapstruct.example;

import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface TaskInfoVoMapper {
    TaskInfoVoMapper INSTANCE = Mappers.getMapper(TaskInfoVoMapper.class);

    String DO_TO_VO = "doToVo";

    @Mappings({
            @Mapping(source = "taskName", target = "taskCode")
    })
    @Named(DO_TO_VO)
    TaskInfoVo toVo(UkeTask item);

    @IterableMapping(qualifiedByName = DO_TO_VO)
    List<TaskInfoVo> toVos(List<UkeTask> items);
}