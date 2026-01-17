// Write a program to print the following pattern for n number of rows.
// ans)
// For example, if n=5, the pattern will be:
// *
// **
// ***
// ****
// *****
// Here, n is the number of rows.
// Note: Use Scanner class to take input from the user.
// here we use the nested loops to print the pattern.
// The outer loop runs for 'n' times (number of rows) and the inner loop runs for 'i' times (current row number).
// In the inner loop, we print '*' for each column in the current row.


// import java.util.Scanner;
// public class pattern3 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
        
//             for (int i = 1 ;i <=a ; i++){
//                 for (int j = 1 ; j <= i ; j++){
//                     System.out.print("*");
//             }
//             System.out.println();
//         }
//         sc.close();
//     }
    
// }




// Write a program to print the following pattern for n number of rows in reverse order.// ans)
// For example, if n=5, the pattern will be:
// *****
// ****
// ***
// **
// *
// Here, n is the number of rows.


// import java.util.Scanner;
// public class pattern3 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
        
//             for (int i = a ;i >= 1 ; i--){
//                 for (int j = 1 ; j <= i ; j++){
//                     System.out.print("*");
//             }
//             System.out.println();
//         }
//         sc.close();
//     }
    
// }






// Write a program to print the following pattern for n number of rows in right-angled triangle form.// ans)
// For example, if n=5, the pattern will be:
//     *
//    **
//   ***
//  ****
// *****
// Here, n is the number of rows.
import java.util.Scanner;
public class pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
            for (int i = 1 ;i <= a ; i++){
                for (int j = 1 ; j <= a-i ; j++){
                    System.out.print(" ");
            }
            // printing stars
            for(int j =1 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
