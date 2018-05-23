package com.commons.project.repository;

import com.commons.project.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long>{

    List<User> findAll();
}
