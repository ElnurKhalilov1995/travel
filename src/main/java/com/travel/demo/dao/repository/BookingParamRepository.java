package com.travel.demo.dao.repository;

import com.travel.demo.dao.entity.BookingParamEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingParamRepository extends CrudRepository<BookingParamEntity, Integer> {
    List<BookingParamEntity> findAll();
}
