package com.projetos.springbootmongo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetos.springbootmongo.domain.User;


public interface UserRepository extends JpaRepository<User, Long> {

}
