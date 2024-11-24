package homeworks.homework_24.Task2;

/**
 * ElectronicWallet
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class ElectronicWallet implements PaymentSystem {
  private String title;
  private double balance;
  private String currency;


  public ElectronicWallet(double balance, String title) {
    this.title = title;
    this.balance = balance;
    this.currency = "USD";
  }


  @Override
  public void withdrawMoney(double amount) {
    if (amount < 0 || amount > this.balance) {
      System.out.println("Insufficient balance");
      return;
    }

    System.out.println("Withdrawing " + amount + " from bank " + this.title);
    this.balance -= amount;
  }


  @Override
  public void depositTransfer(double amount) {
    if (amount < 0) {
      System.out.println("Недопустимая сумма");
      return;
    }

    System.out.println("Deposit " + amount + " to " + this.title);
    this.balance += amount;
  }


  @Override
  public double checkBalance() {
    return this.balance;
  }


  @Override
  public void transferMoney(double amount, PaymentSystem recipient) {
    // TODO:
  }


  @Override
  public String getCurrency() {
    return this.currency;
  }


  @Override
  public String getTitle() {
    return this.title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  @Override
  public String toString() {
    return "ElectronicWallet{" +
           "balance=" + this.balance +
           ", title='" + this.title + '\'' +
           ", currency='" + this.currency + '\'' +
           '}';
  }

}
