package homework_24.Task3;

/**
 * BankAccount
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class BankAccount extends PaymentSystemImpl {

  public BankAccount(String title, double balance) {
    super(title, balance, "EUR");
  }


  @Override
  public String toString() {
    return "BankAccount{" +
           "balance=" + this.checkBalance() + " " + this.getCurrency() +
           ", title='" + this.getTitle() + '\'' +
           '}';
  }

}
