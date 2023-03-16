import java.util.Scanner;
public class palindromenumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Convert the number to a string
        String strNumber = Integer.toString(number);

        // Reverse the string using StringBuilder
        String reverseStrNumber = new StringBuilder(strNumber).reverse().toString();

        // Check if the original number is equal to the reversed number
        if (strNumber.equals(reverseStrNumber)) {
            System.out.println(number + " is a palindrome number.");
        } else {
            System.out.println(number + " is not a palindrome number.");
        }
    }
}


