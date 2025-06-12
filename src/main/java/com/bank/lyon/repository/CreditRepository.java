package com.bank.lyon.repository;

import com.bank.lyon.model.Credit;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CreditRepository extends MongoRepository<Credit, Integer> {

    Credit findById(String id);
}
