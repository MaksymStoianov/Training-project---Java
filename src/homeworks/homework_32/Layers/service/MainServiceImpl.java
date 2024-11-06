package homeworks.homework_32.Layers.service;

import homeworks.homework_32.Layers.model.Car;
import homeworks.homework_32.Layers.model.Role;
import homeworks.homework_32.Layers.model.User;
import homeworks.homework_32.Layers.repository.CarRepository;
import homeworks.homework_32.Layers.repository.CarRepositoryImpl;
import homeworks.homework_32.Layers.repository.UserRepository;
import homeworks.homework_32.Layers.repository.UserRepositoryImpl;
import homeworks.homework_32.Layers.utils.MyList;
import homeworks.homework_32.Layers.utils.Utils;

/**
 * MainServiceImpl
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class MainServiceImpl implements MainService {
  private final CarRepository repCar;
  private final UserRepository repUser;
  private User activeUser;


  public MainServiceImpl(CarRepository carRep, UserRepository userRep) {
    this.repCar = carRep;
    this.repUser = userRep;
  }

  public CarRepositoryImpl getCarRepository() {
    return (CarRepositoryImpl) repCar;
  }

  public UserRepositoryImpl getUserRepository() {
    return (UserRepositoryImpl) repUser;
  }

  /**
   * Возвращает активного пользователя.
   *
   * @return User
   */
  public User getActiveUser() {
    return this.activeUser;
  }


  /**
   * Добавляет машину.
   *
   * @param model
   * @param year
   * @param price
   * @return boolean
   */
  @Override
  public boolean addCar(String model, int year, double price) {
    if (this.activeUser == null) {
      System.out.println("Выполните вход!");
      return false;
    }

    if (this.activeUser.getRole() != Role.ADMIN) {
      System.out.println("У вас недостаточно прав!");
      return false;
    }

    // TODO: Проверка входящих значений и добавление автомобиля в БД

    return true;
  }


  /**
   * Возвращает авто по id.
   *
   * @param id
   * @return Car
   */
  @Override
  public Car getCarById(int id) {
    return null;
  }


  /**
   * Возвращает список всех машин.
   *
   * @return MyList
   */
  @Override
  public MyList<Car> getAllCars() {
    return this.repCar.getAllCars();
  }


  /**
   * Возвращает список машин по модели.
   *
   * @param model
   * @return MyList
   */
  @Override
  public MyList<Car> getCarsByModel(String model) {
    return this.repCar.getCarsByModel(model);
  }


  /**
   * Возвращает список свободных машин.
   *
   * @return MyList
   */
  @Override
  public MyList<Car> getFreeCars() {
    return this.repCar.getFreeCars();
  }

  @Override
  public MyList<Car> getBusyCars() {
    return this.repCar.getBusyCars();
  }


  /**
   * Обновляет цену машины.
   *
   * @param id
   * @param price
   * @return boolean
   */
  @Override
  public boolean updateCarPrice(int id, double price) {
    if (this.activeUser == null) {
      System.out.println("Выполните вход!");
      return false;
    }

    if (this.activeUser.getRole() != Role.ADMIN) {
      System.out.println("У вас недостаточно прав!");
      return false;
    }

    Car car = repCar.getById(id);

    if (car == null || price < 0) {
      return false;
    }

    car.setPrice(price);

    return true;
  }


  /**
   * Берет машину.
   *
   * @param id
   * @return boolean
   */
  @Override
  public boolean takeCar(int id) {
    if (this.activeUser == null) {
      System.out.println("Выполните вход!");
      return false;
    }

    if (this.activeUser.getRole() == Role.BLOCKED) {
      System.out.println("Ваш аккаунт заблокирован!");
      return false;
    }

    Car car = this.repCar.getById(id);

    if (car == null) {
      return false;
    }

    if (car.isBusy()) {
      System.out.println("Машина недоступна!");
      return false;
    }

    car.setBusy(true);

    this.activeUser.getUserCars().add(car);

    return true;
  }


  /**
   * Удаляет машину.
   *
   * @return Car
   */
  @Override
  public Car deleteCar(int id) {
    if (this.activeUser == null) {
      System.out.println("Выполните вход!");
      return null;
    }

    if (this.activeUser.getRole() != Role.ADMIN) {
      System.out.println("У вас недостаточно прав!");
      return null;
    }

    Car car = this.repCar.getById(id);

    if (car == null) {
      return null;
    }

    this.repCar.deleteCar(car);

    return car;
  }


  /**
   * Регистрирует пользователя.
   *
   * @param email
   * @param password
   * @return User
   */
  @Override
  public User registerUser(String email, String password) {
    if (!Utils.isValidEmail(email) || !Utils.isValidPassword(password)) {
      System.out.println("Неверный email или password!");
      return null;
    }

    if (repUser.isEmailExists(email)) {
      System.out.println("Пользователь уже существует!");
      return null;
    }

    User user = this.repUser.addUser(email, password);

    return user;
  }


  @Override
  public MyList<User> getAllUsers() {
    return this.repUser.getAllUsers();
  }

  @Override
  public MyList<User> getBlockedUsers() {
    return this.repUser.getBlockedUsers();
  }


  /**
   * login
   *
   * @param email
   * @param password
   * @return boolean
   */
  @Override
  public boolean loginUser(String email, String password) {
    User user = this.repUser.getUserByEmail(email);

    if (user == null) {
      System.out.println("Неверный email или password!");
      return false;
    }

    if (!user.getPassword().equals(password)) {
      System.out.println("Неверный email или password!");
      return false;
    }

    this.activeUser = user;

    return true;
  }


  /**
   * logout
   */
  @Override
  public void logout() {
    this.activeUser = null;
  }

}
