package com.williamsarti.ProjetoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.williamsarti.ProjetoSpring.entities.Order;



public interface OrderRepository extends JpaRepository<Order, Long> {

}
