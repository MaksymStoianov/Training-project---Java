package lessons.lesson_45;

/**
 * PasswordValidator
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class PasswordValidator {

  /**
   * Проверяет, является ли строка валидным паролем.
   *
   * @param password Строка.
   * @return {@code true}, если строка является валидным паролем; иначе {@code false}.
   */
  public static boolean isValidPassword(String password) throws PasswordValidateException {
    if (password == null || password.length() < 8) {
      throw new PasswordValidateException("Пароль должен содержать минимум 8 символов.");
    }

    boolean hasDigit = false;
    boolean hasLower = false;
    boolean hasUpper = false;
    boolean hasSpecial = false;

    String symbols = "!%$@&*()[].,-";

    for (int i = 0; i < password.length(); i++) {
      char ch = password.charAt(i);

      if (Character.isDigit(ch)) {
        hasDigit = true;
      } else if (Character.isLowerCase(ch)) {
        hasLower = true;
      } else if (Character.isUpperCase(ch)) {
        hasUpper = true;
      } else if (symbols.indexOf(ch) >= 0) {
        hasSpecial = true;
      }
    }

    if (!hasDigit) {
      throw new PasswordValidateException("Пароль должен содержать минимум одну цифру.");
    }
    
    if (!hasLower) {
      throw new PasswordValidateException("Пароль должен содержать минимум одну маленькую букву.");
    }
    
    if (!hasUpper) {
      throw new PasswordValidateException("Пароль должен содержать минимум одну большую букву.");
    }
    
    if (!hasSpecial) {
      throw new PasswordValidateException("Пароль должен содержать минимум один специальный символ (" + symbols + ")");
    }

    return true;
  }

}
