// arrays
// list of items of the same type
// defining an array
// type[]arrayName = newtype[size]

// public class array01 {
//     public static void main(String[] args) {
//         int marks[] = new int[3];
//         // int[] marks = new int[3];
//         marks[0]=98;//phy
//         marks[1]=97;//chem
//         marks[2]=99;//math
//         // System.out.println(marks[0]);
//         // System.out.println(marks[1]);
//         // System.out.println(marks[2]);

//         for(int i = 0; i <= 3; i++) {
//             System.out.println(marks[i]);
//         }
       
//     }
// }
//integer take 4 bit in memory


// defining an array (2)
// import java.util.*;
// public class array01 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int Numbers[] = new int[size];

//         for (int i = 0; i < size; i++){
//             Numbers[i] = sc.nextInt();
//         }
        
// //output
//         for (int i = 0; i <= 3; i++){
//             System.out.println(i);
//         }
//         sc.close();
//     }
// }


import java.util.*;
public class array01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int Numbers[] = new int[size];
//input of data
        for (int i = 0; i < size; i++){
            Numbers[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        
//output
        for (int i = 0; i < Numbers.length; i++){
            if (Numbers[i]==x){
                System.out.println("x found at"+i);
            }
           
        }
        sc.close();
    }
}
