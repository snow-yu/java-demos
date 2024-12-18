package com.snow.util.mapstruct.dto;

/**
 * 订单状态
 *
 * @author jiaXue
 * @since 2024/1/29 15:46
 */

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum OrderStatus {

    /**
     * 订单状态
     */
    INIT(0, "未付款"),
    PAID(1, "已付款"),
    DELIVERED(2, "已发货"),
    FINISHED(3, "交易完成"),
    CANCELLED(4, "已取消"),
    CLOSED(5, "交易关闭");


    private final int code;

    private final String name;

}
