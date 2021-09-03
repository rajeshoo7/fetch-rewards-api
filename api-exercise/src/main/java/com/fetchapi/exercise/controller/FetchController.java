package com.fetchapi.exercise.controller;

import com.fetchapi.exercise.entities.Balance;
import com.fetchapi.exercise.entities.DeductedBalance;
import com.fetchapi.exercise.entities.Points;
import com.fetchapi.exercise.entities.Transaction;
import com.fetchapi.exercise.service.FetchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class FetchController {

    @Autowired
    private FetchService fetchservice;

    @PostMapping(value = "/spendPoints")
    public ResponseEntity<List<DeductedBalance>> spendPoints(@RequestBody Points points) {

        return fetchservice.spendPoints(points.getPoints());
    }

    @PostMapping(value = "/addTransaction")
    public ResponseEntity<String> addTransaction(@RequestBody Transaction transaction) {
        
        return fetchservice.addTransaction(transaction);
    }

    @GetMapping(value = "/getAllPayersBalance")
    public ResponseEntity<List<Balance>> getAllPayersBalance() {
        return fetchservice.getAllPayersBalance();
    }

}
