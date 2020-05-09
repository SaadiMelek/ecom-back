package com.ecom.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ecom.app.entities.OrderItem;

@CrossOrigin("*")
@RepositoryRestResource
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}