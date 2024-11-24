package homeworks.homework_32.Layers.service;

import homeworks.homework_32.Layers.model.User;
import homeworks.homework_32.Layers.model.Car;
import homeworks.homework_32.Layers.repository.CarRepositoryImpl;
import homeworks.homework_32.Layers.repository.UserRepositoryImpl;
import homeworks.homework_32.Layers.utils.MyList;

/**
 * MainService
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public interface MainService {

  /**
   * Добавляет машину.
   *
   * @param model
   * @param year
   * @param price
   * @return boolean
   */
  boolean addCar(String model, int year, double price);


  /**
   * Возвращает авто по id.
   *
   * @param id
   * @return Car
   */
  Car getCarById(int id);


  /**
   * Возвращает список всех машин.
   *
   * @return MyList
   */
  MyList<Car> getAllCars();


  /**
   * Возвращает список машин по модели.
   *
   * @param model
   * @return MyList
   */
  MyList<Car> getCarsByModel(String model);


  /**
   * Возвращает список свободных машин.
   *
   * @return MyList
   */
  MyList<Car> getFreeCars();


  /**
   * Возвращает список взятых машин.
   *
   * @return MyList
   */
  MyList<Car> getBusyCars();


  /**
   * Обновляет цену машины.
   *
   * @param id
   * @param price
   * @return boolean
   */
  boolean updateCarPrice(int id, double price);


  /**
   * Берет машину.
   *
   * @param id
   * @return boolean
   */
  boolean takeCar(int id);


  /**
   * Удаляет машину.
   *
   * @return Car
   */
  Car deleteCar(int id);


  /**
   * Регистрирует пользователя.
   *
   * @param email
   * @param password
   * @return User
   */
  User registerUser(String email, String password);


  MyList<User> getAllUsers();

  MyList<User> getBlockedUsers();


  /**
   * login
   *
   * @param email
   * @param password
   * @return boolean
   */
  boolean loginUser(String email, String password);


  /**
   * logout
   */
  void logout();


  CarRepositoryImpl getCarRepository();

  UserRepositoryImpl getUserRepository();
}
