package module4;

import java.util.Scanner;

public class FloatingPointValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float total = 0;
        int count = 0;
        float max = Float.MIN_VALUE;
        float min = Float.MAX_VALUE;

        while (count < 5) {
            System.out.print("Enter a floating-point value: ");
            if (scanner.hasNextFloat()) {
                float value = scanner.nextFloat();
                total += value;
                if (value > max) {
                    max = value;
                }
                if (value < min) {
                    min = value;
                }
                count++;
            } else {
                System.out.println("Invalid input. Please enter a valid floating-point value.");
                scanner.next(); // Clear the invalid input
            }
        }

        float average = total / 5;
        float interest = total * 0.2f;

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println("Interest on total at 20%: " + interest);

        scanner.close();
    }
}
