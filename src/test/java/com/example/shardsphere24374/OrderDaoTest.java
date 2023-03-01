package com.example.shardsphere24374;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.Instant;
import java.util.List;

@SpringBootTest
public class OrderDaoTest {

    @Autowired
    OrderDao orderDao;

    @Test
    public void test() {
        Instant start = Instant.parse("2023-02-08T16:00:00Z");
        Instant end = Instant.parse("2023-02-09T16:00:00Z");
        List<Order> list = orderDao.selectByDate(start, end);
        Assertions.assertEquals(3, list.size());
    }
}
