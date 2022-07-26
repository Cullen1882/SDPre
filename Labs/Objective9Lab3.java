import java.util.Scanner;
public class Objective9Lab3 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int selection;
    boolean keepGoing = true;

    while (keepGoing){
      printMenu();
      selection = scanner.nextInt();
      if(selection == 1){
        System.out.println("Hello Human");
      }
      else if(selection == 2){
        System.out.println("Apples, Bananas, Coconuts");
      }
      else{
        System.out.println("Goodbye");
        keepGoing = false;
      }
    }
    scanner.close();
  }
  public static void printMenu(){
    System.out.println("-----Menu-----");
    System.out.println("1: Say Hello");
    System.out.println("2: List my favorite foods");
    System.out.println("3: Exit");
  }
}
