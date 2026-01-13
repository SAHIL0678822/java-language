import java.util.Scanner;
public class homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum of a and b is: " + sum);    
        int diff = a - b;
        System.out.println("The difference of a and b is: " + diff);    
        int prod = a * b;
        System.out.println("The product of a and b is: " + prod);
        int quot = a / b;
        System.out.println("The quotient of a and b is: " + quot);    
        sc.close();
    }
}
