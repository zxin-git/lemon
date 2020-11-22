package com.zxin.java.mapstruct.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
* <p>
    * 任务表
    * </p>
*
* @author mybatis-plus
* @since 2019-06-29
*/
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class UkeTask implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    /**
     * 任务名称
     */
    private String taskName;

    /**
     * 任务标题
     */
    private String taskTitle;

    /**
     * 任务子标题
     */
    private String taskSubTitle;

    /**
     * 跳转接连
     */
    private String redirectUrl;

    /**
     * 所属平台
     */
    private String platform;

    /**
     * 每次能获得积分次数
     */
    private Short countInCycle;

    /**
     * 是否只能获取一次
     */
    private Boolean once;

    /**
     * 是否首次特享
     */
    private Boolean firstTimeAward;

    /**
     * 首次特享首次获得积分数
     */
    private Integer firstTimeAwardPoints;

    /**
     * 首次特享正常获得积分数
     */
    private Integer firstTimeAwardNormalPoints;

    /**
     * 积分策略id
     */
    private Integer policyId;

    /**
     * 积分策略名称
     */
    private String policyName;

    /**
     * 任务展示顺序
     */
    private Short sortOrder;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 是否被删除
     */
    private Boolean deleted;

    /**
     * 任务类型，0 - 每日任务， 1 - 特殊任务
     */
    private Short taskType;

    /**
     * 任务有效开始时间
     */
    private Date startTime;

    /**
     * 任务有效结束时间
     */
    private Date endTime;
}