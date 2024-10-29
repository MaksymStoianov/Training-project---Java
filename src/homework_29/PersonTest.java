package homework_29;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

class PersonTest {

  @ParameterizedTest
  @ValueSource(strings = {
      "username@mail.com",
      "user.name@mail.com",
      ".user.name@mail.com",
      "user.name.@mail.com",
      "user.name@.mail.com",
      "user.name@mail..com",
      "user.name@mail.com.",
      "@username@mail.com"
  })
  public void testIsValidEmail(String email) {
    Assertions.assertTrue(Person.isValidEmail(email));
  }


  @ParameterizedTest
  @CsvFileSource(resources = "passwords_valid.csv")
  public void testIsValidPassword(String password) {
    Assertions.assertTrue(Person.isValidPassword(password));
  }


  @ParameterizedTest
  @CsvFileSource(resources = "passwords_invalid.csv")
  public void testIsNotValidPassword(String password) {
    Assertions.assertFalse(Person.isValidPassword(password));
  }

}