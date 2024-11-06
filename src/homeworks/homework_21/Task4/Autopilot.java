package homeworks.homework_21.Task4;

/**
 * Autopilot
 *
 * @author Sergey Bugaenko
 */
public class Autopilot {
  private String softwareVersion;
  private Autobus autobus;

  public Autopilot(String softwareVersion) {
    this.softwareVersion = softwareVersion;
  }

  public Autobus getAutobus() {
    return autobus;
  }

  public void setAutobus(Autobus autobus) {
    this.autobus = autobus;
  }

  public String toString() {
    return "Autopilot: { SV: " + softwareVersion + "}";
  }

  public String getSoftwareVersion() {
    return softwareVersion;
  }

  public void setSoftwareVersion(String softwareVersion) {
    this.softwareVersion = softwareVersion;
  }
}
