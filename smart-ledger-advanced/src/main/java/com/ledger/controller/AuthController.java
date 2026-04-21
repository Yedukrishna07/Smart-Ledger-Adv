
package com.ledger.controller;

import com.ledger.model.User;
import com.ledger.repository.UserRepository;
import com.ledger.config.JwtUtil;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

 private final UserRepository repo;
 private final JwtUtil jwt;

 public AuthController(UserRepository repo, JwtUtil jwt){
   this.repo=repo;
   this.jwt=jwt;
 }

 @PostMapping("/register")
 public User register(@RequestBody User u){
   return repo.save(u);
 }

 @PostMapping("/login")
 public String login(@RequestBody User u){
   User db = repo.findByUsername(u.getUsername());
   if(db!=null && db.getPassword().equals(u.getPassword())){
     return jwt.generateToken(u.getUsername());
   }
   return "Invalid";
 }
}
