import java.util.Scanner;
public class Lab20 {
    public static void main(String[] args) {
        /*Question : Create a simple calculator that performs addition, subtraction,
        multiplication, and division, modus based on user input using switch statements.
            Inputs :   num 1, num 2, +
            Output :  num1+num2 → print information.*/

                Scanner scanner = new Scanner(System.in);

                // Taking input from th55e user
                System.out.print("Enter first number: ");
                double num1 = scanner.nextDouble();

                System.out.print("Enter an operator (+, -, *, /, %): ");
                char operator = scanner.next().charAt(0);

                System.out.print("Enter second number: ");
                double num2 = scanner.nextDouble();

                double result = 0;
                boolean validOperation = true;

                // Using switch case for different operations
                switch (operator) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        if (num2 != 0) {
                            result = num1 / num2;
                        } else {
                            System.out.println("Error! Division by zero.");
                            validOperation = false;
                        }
                        break;
                    case '%':
                        result = num1 % num2;
                        break;
                    default:
                        System.out.println("Invalid operator!");
                        validOperation = false;
                        break;
                }

                // Displaying the result
                if (validOperation) {
                    System.out.printf("%f %c %f = %f%n", num1, operator, num2, result);
                }

                scanner.close();
            }
        }