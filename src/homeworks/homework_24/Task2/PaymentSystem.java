package homeworks.homework_24.Task2;

/**
 * PaymentSystem
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public interface PaymentSystem {

  /**
   * Снимает средства со счета.
   *
   * @param amount Сумма.
   */
  void withdrawMoney(double amount);


  /**
   * Зачисляет средства на счет.
   *
   * @param amount Сумма.
   */
  void depositTransfer(double amount);


  /**
   * Возвращает баланс.
   *
   * @return Баланс.
   */
  double checkBalance();


  /**
   * Переводит средства с одного счета на другой.
   * @param amount
   * @param recipient
   */
  void transferMoney(double amount, PaymentSystem recipient);


  /**
   * Возвращает валюту платежной системы.
   *
   * @return Валюта.
   */
  String getCurrency();


  /**
   * Возвращает название счета.
   *
   * @return Валюта.
   */
  String getTitle();

}
