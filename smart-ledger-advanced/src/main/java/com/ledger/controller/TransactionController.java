
package com.ledger.controller;

import com.ledger.model.Transaction;
import com.ledger.service.TransactionService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

 private final TransactionService service;

 public TransactionController(TransactionService service){
   this.service=service;
 }

 @PostMapping
 public Transaction add(@RequestBody Transaction t){
   return service.add(t);
 }

 @GetMapping("/{userId}")
 public List<Transaction> get(@PathVariable Long userId){
   return service.getByUser(userId);
 }
}
