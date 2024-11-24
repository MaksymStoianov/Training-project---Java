package homeworks.homework_24.Task3;

/**
 * PaymentSystemImpl
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class PaymentSystemImpl implements PaymentSystem {
  private String title;
  private double balance;
  private final String currency;
  private double course;


  public PaymentSystemImpl(String title, double balance, String currency) {
    this.title = title;
    this.balance = balance;
    this.currency = currency;
    setCourse();
  }


  public void setCourse() {
    this.course = 1.20;
  }


  public void setCourse(double course) {
    this.course = course;
  }


  public double getCourse() {
    return this.course;
  }


  @Override
  public void withdrawMoney(double amount) {
    if (amount < 0 || amount > balance) {
      System.out.println("Денег не достаточно для снятия со счета!");
      return;
    }

    this.balance -= amount;
    System.out.println(this.title + ": Снято со счета " + amount + " " + this.currency);
  }


  @Override
  public void depositTransfer(double amount) {
    if (amount < 0) {
      System.out.println(title + ": Недопустимая сумма к зачислению на счет!");
      return;
    }

    this.balance += amount;
    System.out.println(title + ": Зачислено на счет: " + amount + " " + this.currency);
  }


  @Override
  public double checkBalance() {
    return this.balance;
  }


  @Override
  public String getCurrency() {
    return this.currency;
  }


  @Override
  public String getTitle() {
    return this.title;
  }


  public void transferMoney(double amount, PaymentSystem recipient) {
    if (amount > this.checkBalance()) {
      System.out.printf(
          "Недостаточно средств!\n- Amount: %.2f\n Balance: %.2f)\n",
          amount,
          this.checkBalance()
      );

      return;
    }

    if (recipient.getCurrency().equals("EUR")) {
      // Без конвертирования.
      recipient.depositTransfer(amount);
      this.withdrawMoney(amount);

      System.out.printf(
          "Перевод: %.2f EUR (%s)  ->  %s.\n",
          amount,
          this.getTitle(),
          recipient.getTitle()
      );
    } else if (recipient.getCurrency().equals("USD")) {
      // Конвертируем EUR в USD.
      double newAmount = amount / this.getCourse();

      recipient.depositTransfer(newAmount);
      this.withdrawMoney(amount);

      System.out.printf(
          "Перевод: %.2f EUR (%s)  ->  %.2f USD (%s), Курс: %.2f.\n",
          amount,
          this.getTitle(),
          newAmount,
          recipient.getTitle(),
          this.getCourse()
      );
    } else {
      System.out.println("Валюта не поддерживается!");
    }
  }


  @Override
  public String toString() {
    return "PaymentSystemImpl{" +
           "title='" + this.title + '\'' +
           ", balance=" + this.balance +
           ", currency='" + this.currency + '\'' +
           ", course=" + this.course +
           '}';
  }
}
