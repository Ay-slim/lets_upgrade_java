import java.util.Scanner;

public class SignIndicator {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter an integer: ");
      int input = sc.nextInt();
      if(input > 0) {
        System.out.print("Positive");
      } else if(input < 0) {
        System.out.println("Negative");
      }else {
        System.out.println("Zero");
      }
    }
  }
}