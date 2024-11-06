package homeworks.homework_06.old;

public class Main {
  public static void main(String[] args) {
    int houseNumber = 4;
    String recipient = "Иванов";
    String text = "Письмо доставлено ";

    switch (houseNumber) {
      case 1:
        text += "в первый дом";
        break;

      case 2:
        text += "во второй дом";
        break;

      case 3:
        text += "в третий дом";
        break;

      case 4:
        text += "в четвёртый дом семье ";

        switch (recipient) {
          case "Иванов":
            text += "Ивановых";
            break;

          case "Петров":
            text += "Петровых";
            break;

          default:
            text = "Строка адресата содержит " + ((recipient.length() % 2 == 0) ? "чётное" : "нечётное") + " количество символов";
            break;
        }
        break;

      case 5:
        text += "в пятый дом";
        break;

      default:
        text = "Письмо не доставлено!";
        break;
    }

    System.out.println(text);
  }
}

