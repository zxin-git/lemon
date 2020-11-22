package com.zxin.java.mapstruct;

import lombok.Builder;
import lombok.Data;

/**
 * @author zxin
 */
@Data
@Builder
class DTO {
    private String dtoName;
    private String date;
    private String localDateTime;
    private String localDate;
    private String dayOfWeek;

    private String price;
    private String high;
}
