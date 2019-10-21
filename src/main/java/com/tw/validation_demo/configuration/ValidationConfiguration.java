package com.tw.validation_demo.configuration;

import com.tw.validation_demo.validator.AccountMethodValidator;
import com.xom.validation.config.ValidationConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ValidationConfiguration {

  @Bean
  public ValidationConfig validationConfig() {
    return new ValidationConfig()
        .registerValidationClass(AccountMethodValidator.class);
  }
}
