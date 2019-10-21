package com.tw.validation_demo.validator;

import com.tw.validation_demo.models.User;
import com.xom.validation.annotation.ValidationMethod;
import java.util.Objects;
import java.util.stream.Stream;
import lombok.experimental.UtilityClass;

@UtilityClass
public class AccountMethodValidator {

  public static final String HAS_MALE_OR_FEMALE = "gender must be male or female";
  public static final String HAS_EMAIL_OR_TELEPHONE = "user details has email or telephone";


  @ValidationMethod(HAS_MALE_OR_FEMALE)
  public static boolean hasMaleOrFemale(String gender) {
    return Stream.of("male", "female").anyMatch(sex -> sex.equals(gender));
  }

  @ValidationMethod(HAS_EMAIL_OR_TELEPHONE)
  public static boolean hasEmailOrTelephone(User user) {
    return Objects.nonNull(user.getEmail()) || Objects.nonNull(user.getTelephone());
  }
}
