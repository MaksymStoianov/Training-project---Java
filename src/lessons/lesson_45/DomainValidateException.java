package lessons.lesson_45;

/**
 * DomainValidateException
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class DomainValidateException extends RuntimeException {

  public DomainValidateException(String message) {
    super(message);
  }

}
