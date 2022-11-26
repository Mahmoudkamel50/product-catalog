package com.fawry.demo.repository;

import com.fawry.demo.entity.OrderItems;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface OrderDetailsRepository extends CrudRepository<OrderItems, Long> {
}
