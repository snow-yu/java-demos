package com.snow.util.mapstruct.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 订单收货地址
 *
 * @author jiaXue
 * @since 2024/1/29 15:45
 */
@Data
public class OrderAddressDto {

    private String name;

    private String phone;

    private String province;

    private String city;

    private String county;

    private String address;

}
