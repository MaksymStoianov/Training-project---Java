package homeworks.homework_24.Task2;

/**
 * TEst
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class Test {
  public static void main(String[] args) {
    BankAccount bankAccount = new BankAccount(55, "BankAccount1");
    System.out.println(bankAccount);

    bankAccount.withdrawMoney(5);
    System.out.println(bankAccount.checkBalance());

    bankAccount.withdrawMoney(10);
    bankAccount.depositTransfer(15);
    System.out.println(bankAccount.checkBalance());

    ElectronicWallet wallet = new ElectronicWallet(2, "ElectronicWallet1");
    System.out.println(wallet);

    wallet.withdrawMoney(20);
    System.out.println(wallet.checkBalance());
  }
}
