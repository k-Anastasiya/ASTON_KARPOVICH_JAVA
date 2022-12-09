package java_project.task_one;

public class Utils {

  private final String NAME_PERSON = "Привет";

  public boolean isVisibleNamePerson(int number) {
    if (number > 7) {
      System.out.println(NAME_PERSON);
      return true;
    } else {
      System.out.println("Try again!");
    }
    return false;
  }
}
