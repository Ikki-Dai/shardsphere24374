package com.example.shardsphere24374;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.time.Instant;
import java.util.List;

@Mapper
@Repository
public interface OrderDao {

    Order selectByPrimaryKey(Integer id);

    List<Order> selectByDate(Instant start, Instant end);
}