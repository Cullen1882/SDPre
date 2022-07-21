public class Objective3Lab3 {
  public static void main(String[] args) {
    int randNum1 = 1 + (int)(Math.random() * 6);
    int randNum2 = 1 + (int)(Math.random() * 6);
    int randNum3 = 1 + (int)(Math.random() * 6);
    int sum = randNum1 + randNum2 + randNum3;
    System.out.println(randNum1 + " + " + randNum2 + " + " + randNum3 + " = " + sum);
  }
}
