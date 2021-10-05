package com.travel.demo.service;

import com.travel.demo.dao.repository.BookingParamRepository;
import com.travel.demo.mapper.BookingParamMapper;
import com.travel.demo.model.dto.BookingParamDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookingParamService {
    private final BookingParamRepository bookingParamRepository;

    public BookingParamService(BookingParamRepository bookingParamRepository) {
        this.bookingParamRepository = bookingParamRepository;
    }

    public List<BookingParamDto> getBookingParams() {
        return bookingParamRepository.findAll()
                .stream()
                .map(BookingParamMapper.INSTANCE::mapToDto)
                .collect(Collectors.toList());
    }
}
