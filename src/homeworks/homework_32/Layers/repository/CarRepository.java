package homeworks.homework_32.Layers.repository;

import homeworks.homework_32.Layers.model.Car;
import homeworks.homework_32.Layers.utils.MyList;

/**
 * CarRepository
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public interface CarRepository {

  /**
   * Добавляет машину.
   *
   * @param model
   * @param year
   * @param price
   */
  void addCar(String model, int year, double price);


  /**
   * Возвращает авто по id.
   *
   * @param id
   * @return Car
   */
  Car getById(int id);


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
   * Возвращает список занятых машин.
   *
   * @return MyList
   */
  MyList<Car> getBusyCars();


  /**
   * Удаляет машину.
   *
   * @param car
   */
  void deleteCar(Car car);
}
