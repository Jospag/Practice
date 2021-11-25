import java.util.InputMismatchException;
import java.util.Scanner;

public class DividedByZero {
    public static void main(String[] args) {
        int firstNumber = input("Enter first number");
        int secondNumber = input("Enter second number");

        try {
        System.out.printf("The quotient is %d", (firstNumber / secondNumber));
        }
        catch (ArithmeticException error) {
          System.out.println("An error occurred");
        System.out.println(error.getMessage());

        }
    }
    private  static void callThrowThrows() throws Exception {
       throwsThrows();
        }

    private static int throwsThrows() throws Exception {
        System.out.println("Throw throw was called");
        throw new Exception("You forced my hands...");
    }


    private static int input(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);

        try {
            return scanner.nextInt();
        } catch (InputMismatchException | ArithmeticException ex) {
                System.err.println("Re-enter please");
                return input(prompt);
            }
        }
    }