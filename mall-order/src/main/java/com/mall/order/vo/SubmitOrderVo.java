package com.mall.order.vo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class SubmitOrderVo {
    private Long addrId;
    private Integer payType;
    private String orderToken;
    private BigDecimal payPrice;
    private String note;
}
