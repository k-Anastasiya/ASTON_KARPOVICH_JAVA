package java_project.task_three;

public class Utils {


  public boolean isInputNumberCorrect(int size) {
    if (size >= 0) {
      return false;
    } else {
      return true;
    }
  }

  public void printElementsMultiplesOfThree(int[] array) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] % 3 == 0 && array[i] != 0) {
        System.out.println(array[i]);
      }
    }
  }
}
