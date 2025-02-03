import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];

        // User input for array elements
        System.out.println("Enter 10 integer values:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Reverse the array");
            System.out.println("2. Check if array is sorted");
            System.out.println("3. Find maximum and minimum elements");
            System.out.println("4. Display the original array");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    reverseArray(array);
                    break;
                case 2:
                    checkSorted(array);
                    break;
                case 3:
                    findMaxMin(array);
                    break;
                case 4:
                    displayArray(array);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }

    // Method to reverse and display the array
    public static void reverseArray(int[] array) {
        System.out.print("Reversed Array: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Method to check if the array is sorted in ascending order
    public static void checkSorted(int[] array) {
        boolean sorted = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                sorted = false;
                break;
            }
        }
        if (sorted) {
            System.out.println("The array is sorted in ascending order.");
        } else {
            System.out.println("The array is not sorted.");
        }
    }

    // Method to find the maximum and minimum elements in the array
    public static void findMaxMin(int[] array) {
        int max = array[0], min = array[0];
        for (int num : array) {
            if (num > max)
                max = num;
            if (num < min)
                min = num;
        }
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
    }

    // Method to display the original array
    public static void displayArray(int[] array) {
        System.out.print("Original Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
