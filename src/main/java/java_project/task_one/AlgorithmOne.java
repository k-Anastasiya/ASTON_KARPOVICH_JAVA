package java_project.task_one;

import java.util.Scanner;

public class AlgorithmOne {

  private static final String MESSAGE_ENTER_NUMBER = "Please, enter a number";

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Utils utils = new Utils();
    boolean isInputNumberCorrect = false;
    while (!isInputNumberCorrect) {
      System.out.println(MESSAGE_ENTER_NUMBER);
     int inputNumber = scanner.nextInt();
      isInputNumberCorrect = utils.isVisibleNamePerson(inputNumber);
    }
  }
}
