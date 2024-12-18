## [mapstruct工具使用示例](https://mapstruct.org/documentation/stable/reference/html/)
> MapStruct是一个实体映射框架。我们经常需要在DO、DTO、VO等模型对象之间做转换，比较常见的就是我们写converter转换类。MapStruct可以简化转换操作，或者替代我们的converter转换类。

**[使用示例](https://github.com/mapstruct/mapstruct-examples)** 

## 高阶用法

### 集合映射
不需要单独写集合映射接口，只需要写对象映射即可，如出现多个一样的对应映射接口，使用`@@Named`和`@IterableMapping` 指定集合需要的使用的对象映射接口

```java
    CustomerAddress dtoToEntity(CustomerAddressDto customerAddress);

    @Named("dtoTo2Entity")
    CustomerAddress dtoTo2Entity(CustomerAddressDto customerAddress);

    @IterableMapping(qualifiedByName = "dtoTo2Entity")
    List<CustomerAddress> entityToList(List<CustomerAddressDto> customerAddressList);
```


### 前置后置操作

- `@BeforeMapping` 
- `@AfterMapping`



### 默认值
为空 赋值默认值
集合转换给公共默认值

### 



