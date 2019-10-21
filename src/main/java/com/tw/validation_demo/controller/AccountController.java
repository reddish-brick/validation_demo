package com.tw.validation_demo.controller;

import com.tw.validation_demo.models.Account;
import com.xom.validation.annotation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
public class AccountController {

  @PutMapping
  public ResponseEntity<String> update(@RequestBody @Valid Account account) {
    return ResponseEntity.ok().body(String.format("update %s success", account));
  }

  @PostMapping
  public ResponseEntity<String> save(@RequestBody Account account) {
    return ResponseEntity.ok().body(String.format("save %s success", account));
  }

  @GetMapping("/{Id}")
  public ResponseEntity<String> findById(@PathVariable String Id) {
    return ResponseEntity.ok().body(String.format("find %s success", Id));
  }
}
