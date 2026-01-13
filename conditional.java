//i have to add this always when i am using scanner 
import java.util.Scanner;

public class conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }
        sc.close();
    }
}
