package com.mall.order.vo;

import lombok.Data;

@Data
public class SkuHasStockVo {
    private Long skuId;
    private Boolean isHas;
}