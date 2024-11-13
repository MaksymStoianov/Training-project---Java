package homeworks.homework_45.Task1;

import homeworks.homework_45.Color;
import homeworks.homework_45.TextStyle;

/**
 * Test
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class Test {
  public static void main(String[] args) {
    String email = "test@domain1.com";

    try {
      EmailValidator.isValidEmail(email);
      System.out.println(TextStyle.BOLD + "Email: " + Color.RESET + Color.GREEN + "OK" + Color.RESET);
    } catch (EmailValidateException error) {
      System.out.println(TextStyle.BOLD + "Email: " + Color.RESET + Color.RED + error.getMessage() + Color.RESET);
    }


    String password = "passWord!.com";

    try {
      PasswordValidator.isValidPassword(password);
      System.out.println(TextStyle.BOLD + "Password: " + Color.RESET + Color.GREEN + "OK" + Color.RESET);
    } catch (PasswordValidateException error) {
      System.out.println(TextStyle.BOLD + "Password: " + Color.RESET + Color.RED + error.getMessage() + Color.RESET);
    }
  }
}
