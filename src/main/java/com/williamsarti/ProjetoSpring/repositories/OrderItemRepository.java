package com.williamsarti.ProjetoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.williamsarti.ProjetoSpring.entities.OrderItem;



public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
