package homework_32.Layers.repository;

import homework_32.Layers.model.Car;
import homework_32.Layers.view.Color;
import homework_32.Layers.view.TextStyle;
import homework_32.Layers.utils.MyArrayList;
import homework_32.Layers.utils.MyList;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * CarRepositoryImpl
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class CarRepositoryImpl implements CarRepository {
  private final MyList<Car> cars;
  private final AtomicInteger currentId = new AtomicInteger(1);


  public CarRepositoryImpl() {
    this.cars = new MyArrayList<>();
    this.addCars();
  }


  private void addCars() {
    this.cars.addAll(
        new Car(currentId.getAndIncrement(), "CarModel1", 1990, 1_000_000.00),
        new Car(currentId.getAndIncrement(), "CarModel2", 2000, 100_000.00),
        new Car(currentId.getAndIncrement(), "CarModel3", 2010, 10_000.00)
    );
  }


  /**
   * Добавляет машину.
   *
   * @param model
   * @param year
   * @param price
   */
  @Override
  public void addCar(String model, int year, double price) {
    Car car = new Car(this.currentId.getAndIncrement(), model, year, price);

    this.cars.add(car);
  }


  /**
   * Возвращает авто по id.
   *
   * @param id
   * @return Car
   */
  @Override
  public Car getById(int id) {
    for (Car car : this.cars) {
      if (car.getId() == id) {
        return car;
      }
    }

    return null;
  }


  /**
   * Возвращает список всех машин.
   *
   * @return MyList
   */
  @Override
  public MyList<Car> getAllCars() {
    return this.cars;
  }


  /**
   * Возвращает список машин по модели.
   *
   * @param model
   * @return MyList
   */
  @Override
  public MyList<Car> getCarsByModel(String model) {
    MyList<Car> result = new MyArrayList<>();

    for (Car car : this.cars) {
      if (car.getModel().equals(model)) {
        result.add(car);
      }
    }

    return result;
  }


  /**
   * Возвращает список свободных машин.
   *
   * @return MyList
   */
  @Override
  public MyList<Car> getFreeCars() {
    MyList<Car> result = new MyArrayList<>();

    for (Car car : this.cars) {
      if (!car.isBusy()) {
        result.add(car);
      }
    }

    return result;
  }


  /**
   * Возвращает список всех занятых машин.
   *
   * @return MyList
   */
  public MyList<Car> getBusyCars() {
    MyList<Car> result = new MyArrayList<>();

    for (Car car : this.cars) {
      if (car.isBusy()) {
        result.add(car);
      }
    }

    return result;
  }


  /**
   * Удаляет машину.
   *
   * @param car
   */
  @Override
  public void deleteCar(Car car) {
    this.cars.remove(car);
  }


  /**
   * Печатает список машин в табличном формате.
   *
   * @param cars
   */
  public void print(MyList<Car> cars) {
    System.out.printf(
        "\n" + Color.CYAN + TextStyle.BOLD + "%-20s %-35s %-10s %-25s" + Color.RESET,
        "ID",
        "Model",
        "Year",
        "Price"
    );

    for (Car car : cars) {
      System.out.printf(
          "\n%-20s %-35s %-10d %-25s",
          car.getId(),
          car.getModel(),
          car.getYear(),
          car.getPrice()
      );
    }

    System.out.println("\n");
  }

}
