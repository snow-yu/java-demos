package com.snow.util.mapstruct.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * 商品dto
 *
 * @author jiaXue
 * @since 2024/1/28 14:20
 */
@Setter
@Getter
public class GoodsDto {

    private String code;

    private String name;

    private int num;

    private BigDecimal price;
}
