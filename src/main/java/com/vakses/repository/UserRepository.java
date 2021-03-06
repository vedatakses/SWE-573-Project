package com.vakses.repository;

import com.vakses.model.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, String> {

    User findById(String userId);

    User findByEmail(String email);

    User findByUsername(String username);

    List<User> findAll();
}