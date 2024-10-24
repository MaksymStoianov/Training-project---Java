package homework_21.Task2;

/**
 * Computer
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class Computer {
  private String brand;
  private String model;

  private Processor processor;
  private Memory memory;
  private Storage storage;


  public Computer(String brand, String model) {
    this.brand = brand;
    this.model = model;
    this.processor = new Processor("ProcessorBrand1", "ProcessorModel1");
    this.memory = new Memory("MemoryBrand1", "MemoryModel1");
    this.storage = new Storage("StorageBrand1", "StorageModel1");
  }


  /**
   * Возвращает строковое представление текущего класса.
   *
   * @return Данные о {@code Computer}.
   */
  public String toString() {
    return String.format(
        "Computer:\n- Brand: %s\n- Model: %s\n- Processor: %s\n- Memory: %s\n- Storage: %s",
        this.brand,
        this.model,
        this.processor.toString(),
        this.memory.toString(),
        this.storage.toString()
    );
  }

}
