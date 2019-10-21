package com.tw.validation_demo.exception;

import com.xom.errors.exceptions.ResourceNotFoundException;

public class AccountNotFoundException extends ResourceNotFoundException {

  public AccountNotFoundException() {
    super("No account was found.", "ACCOUNT_NOT_FOUND");
  }

}