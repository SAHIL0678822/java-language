// Write a program to print a rectangle pattern of '*' characters with given number of rows and columns.
// For example, if the input is 3 rows and 5 columns, the output should be:
// *****
// *****
// *****
// ans )  we will use nested loops to print the rectangle pattern.
// The outer loop will iterate over the number of rows, and the inner loop will iterate over the number of columns to print '*' characters.
// We will read the number of rows and columns from user input.
// Here is the code implementation:



import java.util.*;
public class pattern1 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);
        // Read number of rows and columns
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Outer loop for rows
        for(int i = 1; i <= a; i++){
            // Inner loop for columns
            for(int j = 1; j <= b; j++){
                // Print '*' character
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();
        }
        sc.close();
    }
}
