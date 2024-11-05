package homework_32.Layers.view;

import homework_32.Layers.model.User;
import homework_32.Layers.service.MainService;
import homework_32.Layers.utils.MyList;

import java.util.Scanner;

/**
 * Menu
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class Menu {
  private final MainService service;
  private final Scanner scanner = new Scanner(System.in);


  public Menu(MainService service) {
    this.service = service;
  }


  private void showMenu() {
    while (true) {
      System.out.printf(
          "\n" + Color.GREEN + "Добро пожаловать в меню:" + Color.RESET +

          "\n1. Меню автомобилей" +
          "\n2. Меню пользователей" +
          "\n3. Меню администратора" +

          "\n0. " + Color.RED + "⏻ Выход" + Color.RESET +

          Color.YELLOW + "\nВведите пункт меню: " + Color.RESET
      );

      int choice = this.scanner.nextInt();
      this.scanner.nextLine();

      this.showSubMenu(choice);
    }
  }


  private void showSubMenu(int choice) {
    switch (choice) {
      case 0:
        System.out.println("До свидания!");
        System.exit(0);
        break;

      case 1:
        this.showCarMenu();
        break;

      case 2:
        this.showUserMenu();
        break;

      case 3:
        this.showAdminMenu();
        break;

      default:
        System.out.println(Color.RED + "Сделайте корректный выбор!\n" + Color.RESET);
    }
  }


  private void showCarMenu() {
    while (true) {
      System.out.printf(
          "\n" + Color.GREEN + "Меню пользователя:" + Color.RESET +

          "\n1. Список всех машин" +
          "\n2. Список доступных машин" +
          "\n3. Список недоступных машин" +

          "\n9. " + Color.YELLOW + "❬ Назад" + Color.RESET +
          "\n0. " + Color.RED + "⏻ Выход" + Color.RESET +

          Color.YELLOW + "\nВведите пункт меню: " + Color.RESET
      );

      int choice = this.scanner.nextInt();
      this.scanner.nextLine();

      this.handleCarMenuChoice(choice);
    }
  }


  private void handleCarMenuChoice(int input) {
    switch (input) {
      // Выход
      case 0:
        this.service.logout();
        System.out.println("Вы вышли!");
        waitRead();
        break;

      // Список всех машин
      case 1:
        this.service.getCarRepository().print(this.service.getAllCars());
        break;

      // Список доступных машин
      case 2:
        this.service.getCarRepository().print(this.service.getFreeCars());
        break;

      // Список недоступных машин
      case 3:
        this.service.getCarRepository().print(this.service.getBusyCars());
        break;

      case 9:
        this.showMenu();
        break;

      default:
        System.out.println("\nНекорректный ввод!");
    }
  }


  private void showUserMenu() {
    while (true) {
      System.out.printf(
          "\n" + Color.GREEN + "Меню пользователя:" + Color.RESET +

          "\n1. Логин" +
          "\n2. Регистрация" +

          "\n3. Взять машину" +
          "\n4. Вернуть машину" +

          "\n9. " + Color.YELLOW + "❬ Назад" + Color.RESET +
          "\n0. " + Color.RED + "⏻ Выход" + Color.RESET +

          Color.YELLOW + "\nВведите пункт меню: " + Color.RESET
      );

      int choice = this.scanner.nextInt();
      this.scanner.nextLine();

      this.handleUserMenuChoice(choice);
    }
  }


  private void handleUserMenuChoice(int input) {
    switch (input) {
      // Выход
      case 0:
        this.service.logout();
        System.out.println("Вы вышли!");
        waitRead();
        break;

      // Авторизация
      case 1: {
        System.out.println("Авторизация ...");
        System.out.println("Введите email:");
        String email = this.scanner.nextLine();

        System.out.println("Введите пароль:");
        String password = this.scanner.nextLine();

        boolean status = this.service.loginUser(email, password);

        if (status) {
          System.out.println("Вы успешно авторизовались в системе!");
        } else {
          System.out.println("Авторизация провалена!");
        }

        waitRead();
      }
      break;

      // Регистрация
      case 2: {
        System.out.println("Регистрация нового пользователя ...");
        System.out.println("Введите email:");
        String email = this.scanner.nextLine();

        System.out.println("Введите пароль:");
        String password = this.scanner.nextLine();

        User user = this.service.registerUser(email, password);

        if (user != null) {
          System.out.println("Вы успешно зарегистрировались в системе!");
        } else {
          System.out.println("Регистрация провалена!");
        }

        waitRead();
      }
      break;

      // TODO: Взять машину
      case 3:
        break;

      // TODO: Вернуть машину
      case 4:
        break;

      case 9:
        this.showMenu();
        break;

      default:
        System.out.println("\nНекорректный ввод!");
    }
  }


  private void showAdminMenu() {
    while (true) {
      System.out.printf(
          "\n" + Color.GREEN + "Меню администратора:" + Color.RESET +
          "\n1. Логин" +
          "\n2. Регистрация" +

          "\n3. Создать машину" +
          "\n4. Удалить машину" +

          "\n5. Заблокировать пользователя" +
          "\n6. Разблокировать пользователя" +

          "\n11. Список всех машин" +
          "\n12. Список доступных машин" +
          "\n13. Список недоступных машин" +

          "\n21. Список всех пользователей" +
          "\n22. Список заблокированных пользователей" +

          "\n9. " + Color.YELLOW + "❬ Назад" + Color.RESET +
          "\n0. " + Color.RED + "⏻ Выход" + Color.RESET +
          Color.YELLOW + "\nВведите пункт меню: " + Color.RESET
      );

      int choice = this.scanner.nextInt();
      this.scanner.nextLine();

      this.handleAdminMenuChoice(choice);
    }
  }


  private void handleAdminMenuChoice(int input) {
    switch (input) {
      // Выход
      case 0:
        this.service.logout();
        System.out.println("Вы вышли!");
        waitRead();
        break;

      // Авторизация
      case 1: {
        System.out.println("Авторизация ...");
        System.out.println("Введите email:");
        String email = this.scanner.nextLine();

        System.out.println("Введите пароль:");
        String password = this.scanner.nextLine();

        boolean status = this.service.loginUser(email, password);

        if (status) {
          System.out.println("Вы успешно авторизовались в системе!");
        } else {
          System.out.println("Авторизация провалена!");
        }

        waitRead();
      }
      break;

      // Регистрация
      case 2: {
        System.out.println("Регистрация нового пользователя ...");
        System.out.println("Введите email:");
        String email = this.scanner.nextLine();

        System.out.println("Введите пароль:");
        String password = this.scanner.nextLine();

        User user = this.service.registerUser(email, password);

        if (user != null) {
          System.out.println("Вы успешно зарегистрировались в системе!");
        } else {
          System.out.println("Регистрация провалена!");
        }

        waitRead();
      }
      break;


      // TODO: Создать машину
      case 3:
        break;


      // TODO: Удалить машину
      case 4:
        break;


      // TODO: Заблокировать пользователя
      case 5:
        break;


      // TODO: Разблокировать пользователя
      case 6:
        break;


      // Список всех машин
      case 11:
        this.service.getCarRepository().print(this.service.getAllCars());
        break;

      // Список доступных машин
      case 12:
        this.service.getCarRepository().print(this.service.getFreeCars());
        break;

      // Список недоступных машин
      case 13:
        this.service.getCarRepository().print(this.service.getBusyCars());
        break;

      // Список всех пользователей
      case 21: {
        MyList<User> users = this.service.getAllUsers();

        this.service.getUserRepository().print(users);
      }
      break;

      // Список заблокированных пользователей
      case 22: {
        MyList<User> users = this.service.getBlockedUsers();
        this.service.getUserRepository().print(users);
      }
      break;

      case 9:
        this.showMenu();
        break;

      default:
        System.out.println("\nНекорректный ввод!");
    }
  }


  private void waitRead() {
    System.out.println(Color.YELLOW + "\nДля продолжения нажмите Enter..." + Color.RESET);
    this.scanner.nextLine();
  }


  public void run() {
    this.showMenu();
  }

}
