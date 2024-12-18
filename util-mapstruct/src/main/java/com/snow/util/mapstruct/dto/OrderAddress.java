package com.snow.util.mapstruct.dto;

import lombok.Data;

/**
 * 订单收货地址
 *
 * @author jiaXue
 * @since 2024/1/29 15:45
 */
@Data
public class OrderAddress {

    private String name;

    private String phone;

    private String province;

    private String city;

    private String county;

    private String address;

}
