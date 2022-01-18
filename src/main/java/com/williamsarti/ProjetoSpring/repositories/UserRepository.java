package com.williamsarti.ProjetoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.williamsarti.ProjetoSpring.entities.User;



public interface UserRepository extends JpaRepository<User, Long> {

}
