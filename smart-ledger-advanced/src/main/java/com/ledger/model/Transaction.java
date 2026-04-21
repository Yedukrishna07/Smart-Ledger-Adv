
package com.ledger.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Data
public class Transaction {
 @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 private String type;
 private Double amount;
 private String category;
 private LocalDate date;

 @ManyToOne
 private User user;
}
