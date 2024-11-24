package homeworks.homework_44.Task4;

/**
 * User
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class User {
    private int id;
    private String name;


    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "User{id=" + id + ", name='" + name + "'}";
    }
}
