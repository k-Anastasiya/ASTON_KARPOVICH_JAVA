package java_project;

import java.util.Scanner;

public class Task_two {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (scanner.hasNextLine()) {
      String name = scanner.nextLine();
      if (name.equals("Вячеслав")) {
        System.out.println("Привет, Вячеслав");
      } else {
        System.out.println("Нет такого имени");
      }
    }
  }
}
