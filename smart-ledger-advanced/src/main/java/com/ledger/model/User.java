
package com.ledger.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
public class User {
 @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 private String username;
 private String password;
}
