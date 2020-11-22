package com.zxin.java.mapstruct.example;

import lombok.Data;

@Data
public class TaskInfoVo {

    private Integer id;

    private String taskCode;

    private String taskTitle;

    private Integer points;

    private Integer remainingCountInDay;

    private String redirectUrl;

    private Boolean showFirstReward;

    private Boolean showRemainingCount;

    private Boolean once;
}