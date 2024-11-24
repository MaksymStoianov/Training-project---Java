package homeworks.homework_24.Task3;

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
