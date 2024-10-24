package homework_24.Task3;

/**
 * ElectronicWallet
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class ElectronicWallet extends PaymentSystemImpl {

  public ElectronicWallet(String title, double balance) {
    super(title, balance, "USD");
  }


  @Override
  public String toString() {
    return "ElectronicWallet{" +
           "balance=" + this.checkBalance() + " " + this.getCurrency() +
           ", title='" + this.getTitle() + '\'' +
           '}';
  }

}
