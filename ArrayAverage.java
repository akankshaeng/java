import java.util.Scanner;

public class ArrayAverage {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        
        // Initialize the array and sum variable
        double[] arr = new double[n];
        double sum = 0;
        
        // Loop to take user input and calculate sum
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
            sum += arr[i];
        }
        
        // Calculate and display the average
        double average = sum / n;
        System.out.printf("The average is: %.2f%n", average);
        
        sc.close();
    }
}

