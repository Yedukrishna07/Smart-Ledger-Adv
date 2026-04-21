
package com.ledger.service;

import com.ledger.model.Transaction;
import com.ledger.repository.TransactionRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TransactionService {
 private final TransactionRepository repo;

 public TransactionService(TransactionRepository repo){
   this.repo=repo;
 }

 public Transaction add(Transaction t){
   return repo.save(t);
 }

 public List<Transaction> getByUser(Long id){
   return repo.findByUserId(id);
 }
}
