import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        float firstNumber = scanner.nextFloat();
        System.out.print("Enter the second number: ");
        float secondNumber = scanner.nextFloat();

        float sum = firstNumber + secondNumber;
        float subtraction = firstNumber - secondNumber;
        float multiplication = firstNumber * secondNumber;
        float division = firstNumber / secondNumber;

        System.out.printf("Sum: %.2f\n", sum);
        System.out.printf("Subtraction: %.2f\n", subtraction);
        System.out.printf("Multiplication: %.2f\n", multiplication);
        System.out.printf("Division: %.2f\n", division);

        System.out.println();
        //2///////////////////////////////
        System.out.print("Enter height (m): ");
        float height = scanner.nextFloat();
        System.out.print("Enter weight (kg): ");
        float weight = scanner.nextFloat();

        float bmi = weight / (float) Math.pow(height, 2);

        System.out.printf("Your BMI: %.2f\n", bmi);

        if (bmi < 16.00F) {
            System.out.println("starvation");
        } else if (bmi < 17.00F) {
            System.out.println("emaciation");
        } else if (bmi < 18.50F) {
            System.out.println("underweight");
        } else if (bmi < 23.00F) {
            System.out.println("standard low range");
        } else if (bmi < 25.00F) {
            System.out.println("standard high range");
        } else if (bmi < 27.50F) {
            System.out.println("overweight low range");
        } else if (bmi < 30.00F) {
            System.out.println("overweight high range");
        } else if (bmi < 35.00F) {
            System.out.println("first degree obesity");
        } else if (bmi < 40.00F) {
            System.out.println("second degree obesity");
        } else {
            System.out.println("third degree obesity");
        }

        System.out.println();
        //3///////////////////////////////
        System.out.println("ax2+bx+c = 0");

        System.out.print("a: ");
        float a = scanner.nextFloat();

        System.out.print("b: ");
        float b = scanner.nextFloat();

        System.out.print("c: ");
        float c = scanner.nextFloat();

        float delta = b * b - 4 * a * c;
        float x1 = 0, x2 = 0;

        if (a == 0) {
            System.out.println("a can't be 0");
        } else {
            switch (Math.round(delta)) {
                case 0:
                    x1 = -b / (2 * a);
                    System.out.printf("x=  %.2f\n", x1);
                    break;
                default:
                    x1 = (-b + (float) Math.sqrt(delta)) / (2 * a);
                    x2 = (-b - (float) Math.sqrt(delta)) / (2 * a);
                    System.out.printf("x1=  %.2f\n, x2= %.2f\n", x1, x2);
                    break;
            }

        }

        System.out.println();
        //4///////////////////////
        int k = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                k = k + i;
            }
        }
        System.out.println("k= " + k);

        System.out.println();
        //5///////////////////////
        Random random = new Random();
        int min = 100;
        int max = 1;
        int counter = 1;

        while (counter <= 10) {
            int number = random.nextInt(100) + 1;
            System.out.print(number+", ");

            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
            counter++;
        }

        System.out.println("\n Min: " + min);
        System.out.println("Max: " + max);

    }
}