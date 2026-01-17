// WAP to print the following pattern for n number of rows. call it Number Pattern.
// ans)
// For example, if n=5, the pattern will be:
// 1        
// 1 2      
// 1 2 3    
// 1 2 3 4
// 1 2 3 4 5

// import java.util.Scanner;
// public class pattern4 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
        
//             for (int i = 1 ;i <= a ; i++){
//                 for (int j = 1 ; j <= i ; j++){
//                     System.out.print(j+" ");
//             }
               
//             System.out.println();
//         }
//         sc.close();
//     }
// }




// WAP to print the following pattern for n number of rows in reverse order. call it Reverse Number Pattern.
// ans)
// For example, if n=5, the pattern will be:
// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2
// 1

// import java.util.Scanner;
// public class pattern4 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();

//             for (int i = 1 ;i <= a ; i++){
//                 for (int j = 1 ; j <=a-i+1 ; j++){
//                     System.out.print(j+" ");
//             }
               
//             System.out.println();
//         }
//         sc.close();
//     }
// }




// WAP to print the following pattern for n number of rows.call it Floyd's Triangle.
// ans)
// For example, if n=5, the pattern will be:
// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15


// import java.util.Scanner;
// public class pattern4 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         // we have to print continuous numbers so we will use an extra variable
//         //  to keep track of the number to be printed that will be incremented after every print
//         int number =1;

//             for (int i = 1 ;i <= a ; i++){
//                 for (int j = 1 ; j <= i ; j++){
//                     System.out.print(number+" ");
//                     number++;
//             }
               
//             System.out.println();
//         }
//         sc.close();
//     }
// }


// WAP to print the following pattern for n number of rows.call it 0-1 Pattern.
// ans)
// For example, if n=5, the pattern will be:
// 1    
// 0 1  
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1        
// The pattern follows the rule that the sum of the row number and column number is even, print 1 else print 0.

import java.util.Scanner;
public class pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

            for (int i = 1 ;i <= a ; i++){
                for (int j = 1 ; j <= i ; j++){
                    int sum = i +j;
                    if (sum % 2 ==0){
                        System.out.print("1 ");
                    } else {
                        System.out.print("0 ");
                    }
                
            }
               
            System.out.println();
        }
        sc.close();
    }
}
