package homeworks.homework_41.Task4;

import java.util.*;

/**
 * Task4
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class Task4 {
    public static void main(String[] args) {
        Map<String, String> directFlights = new HashMap<>();
        directFlights.put("New York", "Chicago");
        directFlights.put("Chicago", "Denver");
        directFlights.put("Denver", "Las Vegas");
        directFlights.put("Boston", "Miami");
        directFlights.put("Miami", "New York");
        directFlights.put("Los Angeles", "San Francisco");
        directFlights.put("San Francisco", "New York");

        List<String> route = findRoute(directFlights, "Boston", "Las Vegas");
        System.out.println(route);

        List<String> noRoute = findRoute(directFlights, "Los Angeles", "Boston");
        System.out.println(noRoute); // Ожидается: []
    }


    public static List<String> findRoute(Map<String, String> directFlights, String start, String destination) {
        List<String> route = new ArrayList<>();
        Set<String> visited = new HashSet<>();

        String current = start;

        while (current != null) {
            route.add(current);
            visited.add(current);

            if (current.equals(destination)) {
                return route;
            }

            current = directFlights.get(current);

            if (current != null && visited.contains(current)) {
                break;
            }
        }

        return Collections.emptyList();
    }

}
