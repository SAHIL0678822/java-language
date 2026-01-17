// Write a program to print the following pattern for given two numbers a and b.

// ans)

//  For example, if a=5 and b=6, the pattern will be:
// ******
// *    *
// *    *
// *    *   
// ******   
// Here, a is the number of rows and b is the number of columns.
// Note: Use Scanner class to take input from the user.
// here we use the nested loops to print the pattern.
// The outer loop runs for 'a' times (number of rows) and the inner loop runs for 'b' times (number of columns).
// In the inner loop, we check if we are at the border of the pattern (first or last row, or first or last column).
// here we use if else statement to print '*' for border positions and ' ' (space) for inner positions.


// we use import java.util.Scanner; for taking input from the user. by using Scanner class. it is a part of java.util package.
import java.util.Scanner;
// we declare a public class named pattern2. that contains the main method.
public class pattern2 {
    // we declare the main method. which is the entry point of the program.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 1; i <= a; i++){
            for (int j = 1 ;j <= b ; j++){
                // here we check if we are at the border of the pattern (first or last row, or first or last column).
                if (i == 1 || i == a || j == 1 || j == b){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
    
}
