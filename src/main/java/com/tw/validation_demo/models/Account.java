package com.tw.validation_demo.models;

import com.tw.validation_demo.exception.AccountNotFoundException;
import com.tw.validation_demo.validator.AccountMethodValidator;
import com.xom.validation.annotation.MethodValidate;
import com.xom.validation.annotation.NotNull;
import com.xom.validation.annotation.Valid;
import com.xom.validation.annotation.ValidCollection;
import com.xom.validation.annotation.ValidString;
import java.util.List;
import lombok.Data;

@Data
public class Account {

  private long id;

  @Valid("accountName")
  @NotNull(code = "missing_value", message = "the value is required")
  private String name;

  @ValidString(pattern = "\\w{1,5}", code = "length_limit", message = "the length of the value is required between 1 to 5")
  private String address;

  @MethodValidate(method = AccountMethodValidator.HAS_MALE_OR_FEMALE, code = "gender", message = "gender must be male or female")
  private String gender;

  @ValidString(minLength = 1, maxLength = 3, exceptionClass = AccountNotFoundException.class)
  private String age;

  @NotNull(code = "missing_value", message = "the value is required")
  @ValidCollection(allowEmpty = false, code = "missing_value", message = "the users can't be empty")
  private List<@Valid User> users;
}
