package lessons.lesson_45;

import lessons.lesson_38.Color;
import lessons.lesson_38.TextStyle;

/**
 * TEst
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


    String password = "test@Domain.com";

    try {
      PasswordValidator.isValidPassword(password);
      System.out.println(TextStyle.BOLD + "Password: " + Color.RESET + Color.GREEN + "OK" + Color.RESET);
    } catch (PasswordValidateException error) {
      System.out.println(TextStyle.BOLD + "Password: " + Color.RESET + Color.RED + error.getMessage() + Color.RESET);
    }
  }
}
