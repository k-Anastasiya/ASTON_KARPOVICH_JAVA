package java_project;

import java.util.Scanner;

public class Task_three {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();
    int[] array = new int[size];
    for (int i = 0; i < array.length; i++) {
      array[i] = scanner.nextInt();
    }
    for (int i = 0; i < array.length; i++) {
      if (array[i] % 3 == 0 && array[i] != 0) {
        System.out.println(array[i]);
      }
    }
  }
}
