package com.zxin.java.mapstruct;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author zxin
 */
@Data
@Builder
class BO {
    private String boName;
    private Date date;
    private LocalDateTime localDateTime;
    private LocalDate localDate;
    private DayOfWeek dayOfWeek;

    private BigDecimal price;
    private Integer high;
}
