package com.snow.util.mapstruct.mapper;

import com.snow.util.mapstruct.dto.OrderAddress;
import com.snow.util.mapstruct.dto.OrderAddressDto;
import org.mapstruct.Mapper;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

/**
 * 订单收货地址转换类
 *
 * @author jiaXue
 * @since 2024/1/29 16:10
 */
@Mapper
@Named("OrderAddressMapper")
public interface OrderAddressMapper {

    OrderAddressMapper INSTANCE = Mappers.getMapper(OrderAddressMapper.class);

    @Named("dtoToEntity")
    OrderAddress dtoToEntity(OrderAddressDto orderAddressDto);
}
