package com.snow.util.mapstruct.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 订单dto
 *
 * @author jiaXue
 * @since 2024/1/29 15:45
 */
@Data
public class OrderDto {


    private String code;

    private OrderStatus orderStatus;

    private BigDecimal totalPrice;

    private LocalDateTime createTime;

    private OrderAddress address;

    private List<GoodsDto> goodsList;


}
