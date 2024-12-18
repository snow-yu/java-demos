package com.snow.util.mapstruct.mapper;

import com.snow.util.mapstruct.dto.CustomerAddress;
import com.snow.util.mapstruct.dto.CustomerAddressDto;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * 客户地址转换器
 *
 * @author jiaXue
 * @since 2024/1/28 14:31
 */
@Mapper
public interface CustomerAddressMapper {

    CustomerAddressMapper INSTANCE = Mappers.getMapper(CustomerAddressMapper.class);

    CustomerAddress dtoToEntity(CustomerAddressDto customerAddress);

    @Named("dtoTo2Entity")
    CustomerAddress dtoTo2Entity(CustomerAddressDto customerAddress);

    @IterableMapping(qualifiedByName = "dtoTo2Entity")
    List<CustomerAddress> entityToList(List<CustomerAddressDto> customerAddressList);


    @BeforeMapping
    default void beforeMapping(CustomerAddressDto customerAddressDto) {
        customerAddressDto.setName("你好："+customerAddressDto.getName());
    }

    @AfterMapping
    default void afterMapping(CustomerAddressDto customerAddressDto, @MappingTarget CustomerAddress customerAddress) {
        customerAddress.setFullAddress(customerAddressDto.getProvince() + customerAddressDto.getCity() + customerAddressDto.getCounty() + customerAddressDto.getAddress());
    }

}
