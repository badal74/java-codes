import java.util.Scanner;

public class Question81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer value: ");    // taking integer input from the user
        int num = sc.nextInt();
        System.out.println(Integer.toString(num) + "100");  // concatenation to check integer to string conversion
    }
}