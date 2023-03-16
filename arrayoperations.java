import java.util.Scanner;
public class arrayoperations {
    public static void main(String[]args) {
        int[] array = new int[15];
        Scanner scanner = new Scanner(System.in);
        // Take input from the user and store it  in array
        System.out.println("Enter 15 integer values:");
        for (int i = 0; i < 15; i++) {
            array[i] = scanner.nextInt();
        }

        // Printing values stored in array
        System.out.println("Values stored in array:");
        for (int i = 0; i < 15; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Check if the  number is present in   the array
        System.out.print("Enter a number to search in array: ");
        int numberToSearch = scanner.nextInt();
        boolean isNumberFound = false;
        int index = -1;
        for (int i = 0; i < 15; i++) {
            if (array[i] == numberToSearch) {
                isNumberFound = true;
                index = i;
                break;
            }
        }
        if (isNumberFound) {
            System.out.println("The number found at index " + index);
        } else {
            System.out.println("Number not found in this array");
        }

        // Creating a new array with elements in reverse order
        int[] reverseArray = new int[15];
        for (int i = 0; i < 15; i++) {
            reverseArray[i] = array[14-i];
        }

        // Printing elements of new array in reverse order
        System.out.println("Values stored in reverse order:");
        for (int i = 0; i < 15; i++) {
            System.out.print(reverseArray[i] + " ");
        }
        System.out.println();

        // Calculating sum and product of elements in array
        int sum = 0;
        int product = 1;
        for (int i = 0; i < 15; i++) {
            sum += array[i];
            product *= array[i];
        }

        // Printing sum and product of elements in array
        System.out.println("Sum of elements in array: " + sum);
        System.out.println("Product of elements in array: " + product);
    }
}

