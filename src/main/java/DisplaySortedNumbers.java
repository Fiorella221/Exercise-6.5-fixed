import java.util.Scanner;
  
public class DisplaySortedNumbers {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter three numbers: ");
    double num1 = input.nextDouble();
    double num2 = input.nextDouble();
    double num3 = input.nextDouble();

    displaySortedNumbers(num1, num2, num3);
    input.close();
  }
  /**
  * Prompts the user for a double value and validates the input.
  * @param input Scanner object to read input
  * @return Valid double value entered by the user
  */
 public static double readDouble(Scanner input) {
   if (!input.hasNextDouble()) {
   System.out.println("Invalid input. Please enter a valid number: ");
    input.next();
    return readDouble(input);
  } else {
    return input.nextDouble();
  }
 }
    
    /**
    * Sorts three numbers in ascending order and displays them.
    * @param num1 First number to be sorted
    * @param num2 Second number to be sorted
    * @param num3 Third number to be sorted
  */
  public static void displaySortedNumbers(double num1, double num2, double num3) {
    double temp;
    if (num1 > num2) {
        temp = num1;
        num1 = num2;
        num2 = temp;
    } 
    if (num2 > num3) {
        temp = num2;
        num2 = num3;
        num3 = temp;
    }
    if (num1 > num2) {
        temp = num1;
        num1 = num2;
        num2 = temp;
    }
  
      System.out.printf("The numbers in ascending order are: %.2f, %.2f, %.2f%n", num1, num2, num3);
  }
}
    
    
