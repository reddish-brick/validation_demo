package com.tw.validation_demo.models;

import com.xom.validation.annotation.MethodValidate;
import com.xom.validation.annotation.NotNull;
import com.xom.validation.annotation.ValidString;
import lombok.Data;

import static com.tw.validation_demo.validator.AccountMethodValidator.HAS_EMAIL_OR_TELEPHONE;

@Data
@MethodValidate(method = HAS_EMAIL_OR_TELEPHONE, code = "empty_value", message = "User must have value for either email or telephone.")
public class User {

  @NotNull(code = "missing_value", message = "the value is required")
  private String name;

  @NotNull(code = "missing_value", message = "the value is required")
  private String age;

  @ValidString(isEmail = true, code = "format_error", message = "the value must be email format")
  private String email;

  @ValidString(pattern = "\\d{11}", code = "format_error", message = "the value must be numbers with length of 11")
  private String telephone;
}
