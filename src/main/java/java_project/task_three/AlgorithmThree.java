package java_project.task_three;

import java.util.Scanner;

public class AlgorithmThree {

  private static final String MESSAGE_ENTER_THE_LENGTH_OF_THE_ARRAY = "Please, enter the length of the array";
  private static final String MESSAGE_THAT_ARE_MULTIPLES_OF_THREE = "Displaying elements that are multiples of three";
  private static final String MESSAGE_ENTER_ELEMENTS_OF_THE_ARRAY = "Please, enter elements of the array";


  public static void main(String[] args) {
    Utils utils = new Utils();
    Scanner scanner = new Scanner(System.in);
    System.out.println(MESSAGE_ENTER_THE_LENGTH_OF_THE_ARRAY);
    int size = scanner.nextInt();
    int[] array = new int[size];
    if (utils.isInputNumberCorrect(size)) {
      System.out.println(MESSAGE_ENTER_ELEMENTS_OF_THE_ARRAY);
      for (int i = 0; i < array.length; i++) {
        array[i] = scanner.nextInt();
      }
      System.out.println(MESSAGE_THAT_ARE_MULTIPLES_OF_THREE);
      utils.printElementsMultiplesOfThree(array);
    }
  }
}
