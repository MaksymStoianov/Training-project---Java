package homework_27;

/**
 * Person
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class Person {
  private String email;
  private String password;


  /**
   * Проверяет, является ли строка валидным доменом.
   *
   * @param domain Строка.
   * @return {@code true}, если строка является валидным доменом; иначе {@code false}.
   */
  private static boolean isValidDomain(String domain) {
    if (domain == null || domain.isEmpty()) {
      return false;
    }

    String[] parts = domain.split("\\.");

    if (parts.length < 2) {
      return false;
    }

    for (int i = parts.length - 1; i >= 0; i--) {
      String part = parts[i];

      if (part == null || part.isEmpty()) {
        return false;
      }

      if (i == 0) {
        if (part.length() == 1) {
          return false;
        }

        for (char ch : part.toCharArray()) {
          if (!Character.isLetterOrDigit(ch)) {
            return false;
          }
        }
      } else {
        if (part.startsWith("-") || part.endsWith("-")) {
          return false;
        }

        for (char ch : part.toCharArray()) {
          if (!Character.isLetterOrDigit(ch) && ch != '-') {
            return false;
          }
        }
      }
    }

    return (parts[parts.length - 1].length() >= 2);
  }


  /**
   * Проверяет, является ли строка валидным email.
   *
   * @param email Строка.
   * @return {@code true}, если строка является валидным email; иначе {@code false}.
   */
  private static boolean isValidEmail(String email) {
    if (email == null || email.isEmpty()) {
      return false;
    }

    String[] parts = email.split("@");

    if (parts.length != 2) {
      return false;
    }

    String username = parts[0];

    if (username == null || username.isEmpty() || !Character.isAlphabetic(username.charAt(0))) {
      return false;
    }

    for (int i = 0; i < username.length(); i++) {
      char ch = username.charAt(i);

      if (!(
          Character.isAlphabetic(ch) ||
          Character.isDigit(ch) ||
          ch == '-' ||
          ch == '_' ||
          ch == '.'
      )) {
        return false;
      }
    }

    return isValidDomain(parts[1]);
  }


  /**
   * Проверяет, является ли строка валидным паролем.
   *
   * @param password Строка.
   * @return {@code true}, если строка является валидным паролем; иначе {@code false}.
   */
  private static boolean isValidPassword(String password) {
    /*
     * `0` - длина `>= 8`.
     * `1` - Должна быть мин 1 цифра
     * `2` - Должна быть мин 1 маленькая буква
     * `3` - Должна быть мин 1 большая буква
     * `4` - Должна быть мин 1 спец. символ (`!%$@&*()[].,-`)
     */
    boolean[] result = new boolean[5];

    if (!(password == null || password.length() < 8)) {
      result[0] = true;

      String symbols = "!%$@&*()[].,-";

      for (int i = 0; i < password.length(); i++) {
        char ch = password.charAt(i);

        if (Character.isDigit(ch)) {
          result[1] = true;
        }

        if (Character.isLowerCase(ch)) {
          result[2] = true;
        }

        if (Character.isUpperCase(ch)) {
          result[3] = true;
        }

        if (symbols.indexOf(ch) >= 0) {
          result[4] = true;
        }
      }
    }

    // NOTE: Можно вернуть массив, если требуется указать, какие именно проверки не выполнены.

    for (boolean item : result) {
      if (!item) {
        return false;
      }
    }

    return true;
  }


  public Person(String email, String password) {
    this.setEmail(email);
    this.setPassword(password);
  }


  public String getEmail() {
    return this.email;
  }


  public boolean setEmail(String email) {
    if (isValidEmail(email)) {
      this.email = email;
      return true;
    } else {
      return false;
    }
  }


  public String getPassword() {
    return this.password;
  }


  public boolean setPassword(String password) {
    if (isValidPassword(password)) {
      this.password = password;
      return true;
    } else {
      return false;
    }
  }


  @Override
  public String toString() {
    return "Person{" +
           "email='" + this.email + '\'' +
           ", password='" + this.password + '\'' +
           '}';
  }
}
