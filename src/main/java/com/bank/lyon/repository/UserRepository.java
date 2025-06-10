package com.bank.lyon.repository;

import com.bank.lyon.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Integer> {

    void deleteById(String id);

    User findById(String id);
}
