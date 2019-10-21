package com.tw.validation_demo.validator;

import com.xom.validation.annotation.ValidationMethod;
import java.util.stream.Stream;
import lombok.experimental.UtilityClass;

@UtilityClass
public class AccountMethodValidator {

  public static final String HAS_MALE_OR_FEMALE = "gender must be male or female";


  @ValidationMethod(HAS_MALE_OR_FEMALE)
  public static boolean hasMaleOrFemale(String gender) {
    return Stream.of("male", "female").anyMatch(sex -> sex.equals(gender));
  }

}
