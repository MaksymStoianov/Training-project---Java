package homeworks.homework_38.Task1;

import java.util.Comparator;

/**
 * SportsmanScoreComparator
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class SportsmanScoreComparator implements Comparator<Sportsman> {

  @Override
  public int compare(Sportsman o1, Sportsman o2) {
    return Double.compare(o1.getScore(), o2.getScore());
  }
}
