package com.travel.demo.mapper;

import com.travel.demo.dao.entity.BookingParamEntity;
import com.travel.demo.model.dto.BookingParamDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BookingParamMapper {
    BookingParamMapper INSTANCE = Mappers.getMapper( BookingParamMapper.class );

    BookingParamDto mapToDto(BookingParamEntity bookingParamEntity);
}
