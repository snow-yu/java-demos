package com.snow.util.mapstruct.mapper;

import com.snow.util.mapstruct.dto.Goods;
import com.snow.util.mapstruct.dto.GoodsDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import java.math.BigDecimal;

/**
 * 商品转换类
 *
 * @author jiaXue
 * @since 2024/1/29 15:49
 */
@Mapper
public interface GoodsMapper {

    GoodsMapper INSTANCE = Mappers.getMapper(GoodsMapper.class);

    Goods dtoToEntity(GoodsDto goodsDto);

    @Mapping(target = "price", source = "price", qualifiedByName = "goodsPrice")
    Goods dtoToEntity2(GoodsDto goodsDto);


    @Named("goodsPrice")
    default BigDecimal goodsPrice(BigDecimal price) {
        return price.add(BigDecimal.valueOf(10));
    }
}
