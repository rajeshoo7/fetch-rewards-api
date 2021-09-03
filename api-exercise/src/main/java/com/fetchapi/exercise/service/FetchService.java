package com.fetchapi.exercise.service;

import com.fetchapi.exercise.entities.Balance;
import com.fetchapi.exercise.entities.DeductedBalance;
import com.fetchapi.exercise.entities.Transaction;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface FetchService {

    public ResponseEntity<String> addTransaction(Transaction transaction);

    public ResponseEntity<List<DeductedBalance>> spendPoints(int points);

    public ResponseEntity<List<Balance>> getAllPayersBalance();
}
