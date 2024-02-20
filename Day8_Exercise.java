import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Day8_Exercise {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        //Exercise 1
        try {
            System.out.println("Please enter the first number: ");
            int firstNum = s.nextInt();
            System.out.println("Please enter the second number: ");
            int secondNum = s.nextInt();

            int sum = firstNum + secondNum;
            int subtract = firstNum - secondNum;
            int multiply = firstNum * secondNum;
            int divide = firstNum / secondNum;
            int remainder = firstNum % secondNum;

            System.out.printf("%d + %d = %d%n", firstNum, secondNum, sum);
            System.out.printf("%d - %d = %d%n", firstNum, secondNum, subtract);
            System.out.printf("%d x %d = %d%n", firstNum, secondNum, multiply);
            System.out.printf("%d / %d = %d%n", firstNum, secondNum, divide);
            System.out.printf("%d mod %d = %d%n", firstNum, secondNum, remainder);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");

        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed.");

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

        //Exercise 2
        try {
            System.out.println("Please enter a number: ");
            int num = s.nextInt();

            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d x %d = %d%n", num, i, num * i);
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //Exercise 3
        try {
            System.out.println("Please enter the radius: ");
            double radius = s.nextDouble();
            ValidatePositiveNumber(radius);

            double perimeter = 2 * Math.PI * radius;
            double area = Math.PI * radius * radius;

            System.out.println("Perimeter is = " + perimeter);
            System.out.println("Area is = " + area);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //Exercise 4
        try {
            System.out.println("Please enter the count of numbers: ");
            int count = s.nextInt();
            ValidatePositiveNumber(count);

            double sum = 0;

            for (int i = 1; i <= count; i++) {
                System.out.println("Please enter an integer: ");
                int integer = s.nextInt();
                sum += integer;
            }
            System.out.println("The average is: " + sum / count);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //Exercise 5
        try {
            System.out.println("Please enter the first number: ");
            int num1 = s.nextInt();
            System.out.println("Please enter the second number: ");
            int num2 = s.nextInt();
            System.out.println("Please enter the third number: ");
            int num3 = s.nextInt();

            if (num1 + num2 == num3) {
                System.out.println("The result is: true");
            } else {
                System.out.println("The result is: false");
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //Exercise 6
        try {
            System.out.println("Please enter a word: ");
            String word = s.nextLine();
            ValidateEmptyString(word);
            validateNumericString(word);

            String reversedWord = "";

            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord += word.charAt(i);
            }

            System.out.println("Reversed word: " + reversedWord);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //Exercise 7
        try {
            System.out.println("Please enter a number: ");
            int number = s.nextInt();

            if (number % 2 == 0) {
                System.out.println("The number is Even");
            } else {
                System.out.println("The number is Odd");
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //Exercise 8
        try {
            System.out.println("Please enter temperature in Centigrade: ");
            double celsius = s.nextDouble();

            double fahrenheit = (celsius * 9 / 5) + 32;

            System.out.println("Temperature in Fahrenheit is: " + fahrenheit);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //Exercise 9
        try {
            System.out.println("Please enter a string: ");
            String string = s.nextLine();
            ValidateEmptyString(string);

            System.out.println("Please enter a index: ");
            int index = s.nextInt();

            char c = string.charAt(index);

            System.out.println("The character at index " + index + " is " + c);


        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Index is out of string range");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //Exercise 10
        try {
            System.out.println("Please enter the width: ");
            double width = s.nextDouble();
            ValidatePositiveNumber(width);

            System.out.println("Please enter the height: ");
            double height = s.nextDouble();
            ValidatePositiveNumber(height);

            double areaRectangle = width * height;
            double perimeterRectangle = 2 * (width + height);

            System.out.println("Area is " + width + " * " + height + " = " + areaRectangle);
            System.out.println("Perimeter is 2 * (" + width + " + " + height + ") = " + perimeterRectangle);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //Exercise 11
        try {
            System.out.println("Please enter the first number: ");
            int number1 = s.nextInt();
            System.out.println("Please enter the second number: ");
            int number2 = s.nextInt();

            if (number1 == number2) {
                System.out.printf("%d == %d%n", number1, number2);
            } else {
                System.out.printf("%d != %d%n", number1, number2);
            }

            if (number1 >= number2) {
                System.out.printf("%d >= %d%n", number1, number2);
            } else {
                System.out.printf("%d < %d%n", number1, number2);
            }

            if (number1 <= number2) {
                System.out.printf("%d <= %d%n", number1, number2);
            } else {
                System.out.printf("%d > %d%n", number1, number2);
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //Exercise 12
        try {
            System.out.println("Please enter seconds: ");
            int totalSeconds = s.nextInt();
            ValidatePositiveNumber(totalSeconds);

            int hours = totalSeconds / 3600;
            int minutes = (totalSeconds % 3600) / 60;
            int seconds = totalSeconds % 60;

            System.out.printf("%02d:%02d:%02d%n", hours, minutes, seconds);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //Exercise 13
        try {
            System.out.println("Please enter the first integer: ");
            int integer1 = s.nextInt();
            System.out.println("Please enter the second integer: ");
            int integer2 = s.nextInt();
            System.out.println("Please enter the third integer: ");
            int integer3 = s.nextInt();
            System.out.println("Please enter the fourth integer: ");
            int integer4 = s.nextInt();

            if (integer1 == integer2 && integer2 == integer3 && integer3 == integer4) {
                System.out.println("Numbers are equal");
            } else {
                System.out.println("Numbers are not equal");
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //Exercise 14
        try {
            System.out.println("Please enter an integer: ");
            int integer = s.nextInt();

            if (integer == 0) {
                System.out.println("The number is zero");
            } else if (integer > 0) {
                System.out.println("The number is positive");
            } else {
                System.out.println("The number is negative");
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //Exercise 16
        try {
            System.out.println("Please enter an integer: ");
            int numbers = s.nextInt();
            String numStr = Integer.toString(numbers);
            String reversedNum = "";

            for (int i = numStr.length() - 1; i >= 0; i--) {
                reversedNum += numStr.charAt(i);
            }

            System.out.println("Digits reversed: " + reversedNum);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //Exercise 17
        try {
            int largest = Integer.MIN_VALUE;
            int smallest = Integer.MAX_VALUE;

            while (true) {
                System.out.println("Please enter a number or enter '0' to quit");
                int nm = s.nextInt();

                if (nm == 0) {
                    break;
                }

                if (nm > largest) {
                    largest = nm;
                }

                if (nm < smallest) {
                    smallest = nm;
                }

            }

            if (largest != Integer.MIN_VALUE && smallest != Integer.MAX_VALUE) {
                System.out.println("The largest number is: " + largest);
                System.out.println("The smallest number is: " + smallest);
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //Exercise 18
        try {
            System.out.println("Please enter a string: ");
            String str = s.nextLine();
            ValidateEmptyString(str);
            validateNumericString(str);

            int aCount = 0;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'a') {
                    aCount++;
                }
            }

            System.out.println("Number of a's is: " + aCount);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    //Validates a number to ensure it is greater than 0
    private static void ValidatePositiveNumber(double num) throws Exception {

        if (num <= 0) {
            throw new Exception("Invalid input. The number must be greater than 0.");
        }
    }

    //Validates a string to ensure it is not empty
    private static void ValidateEmptyString(String str) throws Exception {

        if (str.isEmpty()) {
            throw new Exception("Invalid input. The string must not be empty.");
        }
    }

    //Validates a string to ensure it does not consist entirely of numeric characters
    private static void validateNumericString(String str) throws Exception {

        if (str.matches("\\d+")) {
            throw new Exception("Invalid input. The string must not consist entirely of numeric characters.");
        }
    }

}
