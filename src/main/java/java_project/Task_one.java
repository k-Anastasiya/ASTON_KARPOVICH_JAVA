package java_project;

import java.util.Scanner;

public class Task_one {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while(scanner.hasNext()){
      int number = scanner.nextInt();
      if(number > 7){
        System.out.println("Привет");
      }
    }
  }
}
