package com.tw.validation_demo.models;

import com.xom.validation.annotation.NotNull;
import lombok.Data;

@Data
public class User {

  @NotNull(code = "missing_value", message = "the value is required")
//  @ValidString(minLength = 1, maxLength = 5, code = "length_limit", message = "the length of the value is required between 1 to 5")
  private String name;

  @NotNull(code = "missing_value", message = "the value is required")
//  @ValidString(minLength = 1, maxLength = 3, code = "length_limit", message = "the length of the value is required between 1 to 3")
  private String age;
}
