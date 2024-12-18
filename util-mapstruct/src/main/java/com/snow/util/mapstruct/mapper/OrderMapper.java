package com.snow.util.mapstruct.mapper;

import com.snow.util.mapstruct.dto.Order;
import com.snow.util.mapstruct.dto.OrderDto;
import org.mapstruct.factory.Mappers;

/**
 * 订单转换类
 *
 * @author jiaXue
 * @since 2024/1/29 16:06
 */
public interface OrderMapper {

    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    Order dtoToEntity(OrderDto orderDto);

}
