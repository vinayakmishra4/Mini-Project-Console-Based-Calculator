public class ConsoleCalculator 
{

    // Function to add two numbers
    public static double add(double a, double b)
    {
        return a + b;
    }

    // Function to subtract two numbers
    public static double subtract(double a, double b)
    {
        return a - b;
    }

    // Function to multiply two numbers
    public static double multiply(double a, double b)
    {
        return a * b;
    }

    // Function to divide two numbers
    public static double divide(double a, double b)
    {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero.");
            return 0;
        }
        return a / b;
    }

    // Function to calculate modulus
    public static double modulus(double a, double b)
    {
        return a % b;
    }

    // Function to calculate power
    public static double power(double a, double b)
    {
        return Math.pow(a, b);
    }

    // Function to calculate square root
    public static double squareRoot(double a)
    {
        if (a < 0) 
        {
            System.out.println("Error: Cannot take square root of a negative number.");
            return 0;
        }
        return Math.sqrt(a);
    }

    // Function to calculate absolute value
    public static double absolute(double a)
    {
        return Math.abs(a);
    }

    public static void main(String[] args)
    {
        java.util.Scanner sc = new java.util.Scanner(System.in); // Scanner to read input from user
        int choice; // Variable to store user's menu choice
        double num1 = 0, num2 = 0, result; // Variables for operands and result

        while (true)
        { // Loop to keep calculator running until user chooses to exit
            // Display the calculator menu
            System.out.println("\n==== Console Calculator ====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Power (a^b)");
            System.out.println("7. Square Root");
            System.out.println("8. Absolute Value");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt(); // Read user's choice

            if (choice == 9) 
            { // If user chooses to exit
                System.out.println("Exiting Calculator. Goodbye!");
                break; // Exit the loop and terminate program
            }

            // Take input numbers based on operation type
            if (choice >= 1 && choice <= 6) 
            {
                // For operations that need two operands
                System.out.print("Enter first number: ");
                num1 = sc.nextDouble(); // Read first operand
                System.out.print("Enter second number: ");
                num2 = sc.nextDouble(); // Read second operand
            } 
            else if (choice == 7 || choice == 8)
            {
                // For operations that need only one operand
                System.out.print("Enter the number: ");
                num1 = sc.nextDouble(); // Read operand
            } 
            else
            {
                // Handle invalid menu option
                System.out.println("Invalid choice. Please try again.");
                continue; // Skip to next iteration
            }

            // Perform the operation based on user choice
            switch (choice)
            {
                case 1:
                    // Addition
                    result = add(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case 2:
                    // Subtraction
                    result = subtract(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case 3:
                    // Multiplication
                    result = multiply(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case 4:
                    // Division
                    result = divide(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case 5:
                    // Modulus
                    result = modulus(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case 6:
                    // Power
                    result = power(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case 7:
                    // Square Root
                    result = squareRoot(num1);
                    System.out.println("Result: " + result);
                    break;
                case 8:
                    // Absolute Value
                    result = absolute(num1);
                    System.out.println("Result: " + result);
                    break;
            }
        }

        sc.close(); // Close the scanner to free resources
    }
}
