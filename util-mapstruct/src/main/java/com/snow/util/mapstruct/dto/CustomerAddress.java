package com.snow.util.mapstruct.dto;

import lombok.Data;

/**
 * 客户地址
 *
 * @author jiaXue
 * @since 2024/1/28 14:29
 */
@Data
public class CustomerAddress {

    private String name;

    private String phone;

    private String province;

    private String city;

    private String county;

    private String address;

    private String fullAddress;

}
