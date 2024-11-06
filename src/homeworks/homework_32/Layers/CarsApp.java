package homeworks.homework_32.Layers;

import homeworks.homework_32.Layers.view.Menu;
import homeworks.homework_32.Layers.repository.CarRepository;
import homeworks.homework_32.Layers.repository.CarRepositoryImpl;
import homeworks.homework_32.Layers.repository.UserRepository;
import homeworks.homework_32.Layers.repository.UserRepositoryImpl;
import homeworks.homework_32.Layers.service.MainService;
import homeworks.homework_32.Layers.service.MainServiceImpl;

/**
 * CarsApp
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class CarsApp {
  public static void main(String[] args) {
    CarRepository carRep = new CarRepositoryImpl();
    UserRepository userRep = new UserRepositoryImpl();

    MainService service = new MainServiceImpl(carRep, userRep);

    Menu menu = new Menu(service);

    menu.run();
  }
}
