package homeworks.homework_24.Task3;

/**
 * TEst
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class Test {
  public static void main(String[] args) {
    BankAccount bank1 = new BankAccount("Bank1", 100_000_000);
    System.out.println(bank1);

    BankAccount bank2 = new BankAccount("Bank2", 200_000_000);
    System.out.println(bank2);

    ElectronicWallet wallet1 = new ElectronicWallet("ElectronicWallet1", 100_000);
    System.out.println(wallet1);

    ElectronicWallet wallet2 = new ElectronicWallet("ElectronicWallet2", 200_000);
    System.out.println(wallet2);


    System.out.println("\n\nПеревод между банками (bank1 > bank2):");
    bank1.transferMoney(1000, bank2);
    System.out.println(bank1);
    System.out.println(bank2);


    System.out.println("\n\nПеревод между банками (bank2 > bank1):");
    bank2.transferMoney(1000, bank1);
    System.out.println(bank1);
    System.out.println(bank2);


    System.out.println("\n\nПеревод между кошельками (wallet1 > wallet2):");
    wallet1.transferMoney(1000, wallet2);
    System.out.println(wallet1);
    System.out.println(wallet2);


    System.out.println("\n\nПеревод между кошельками (wallet2 > wallet1):");
    wallet2.transferMoney(1000, wallet1);
    System.out.println(wallet1);
    System.out.println(wallet2);


    System.out.println("\n\nПеревод между кошельком и банком (wallet1 > bank1):");
    wallet1.transferMoney(1000, bank1);
    System.out.println(wallet1);
    System.out.println(bank1);
  }
}
