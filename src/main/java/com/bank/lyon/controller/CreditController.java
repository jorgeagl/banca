package com.bank.lyon.controller;

import com.bank.lyon.model.Credit;
import com.bank.lyon.repository.CreditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CreditController {
    @Autowired
    CreditRepository creditRepository;

    @PostMapping("/credit")
    public ResponseEntity<Void> addCredit (@RequestBody Credit credit) {
        creditRepository.save(credit);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/credit")
    public List<Credit> getAllCredits() {
        return creditRepository.findAll();
    }
}
