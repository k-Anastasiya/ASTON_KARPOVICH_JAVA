package java_project.task_two;

import java.util.Scanner;

public class AlgorithmTwo {

  private static final String MESSAGE_ENTER_NAME = "Enter name";
  private static final String MESSAGE_CONSTANT_NAME = "Вячеслав";

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println(MESSAGE_ENTER_NAME);
    while (scanner.hasNextLine()) {
      String name = scanner.nextLine();
      if (name.equals(MESSAGE_CONSTANT_NAME)) {
        System.out.format(("Привет, %s"), MESSAGE_CONSTANT_NAME);
      } else {
        System.out.println("Нет такого имени");
      }
    }
  }
}
