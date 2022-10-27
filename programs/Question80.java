import java.util.Scanner;

public class Question80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // taking string input from user
        System.out.print("Enter the string to convert it to integer: ");
        String str = sc.next();
        // displaying converted integer to the user
        System.out.println("String converted to integer is: " + convertToInteger(str));
    }

    // function to convert given string to integer
    static int convertToInteger(String str){
        int ans = 0;
        for(int i = 0; i < str.length(); i++){
            ans = ans*10 + (str.charAt(i) - '0');
        }
        return ans;
    }
}