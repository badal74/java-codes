import java.util.*;
public class calculator {
   public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("ENTER");
    int a = sc.nextInt();
    System.out.println("ENTER");
    int b = sc.nextInt();
    System.out.println("OPERATOR");
    char operator = sc.next().charAt(0); // to have single characetr as the result
    System.out.println("RESULT");
    switch(operator){
        case '+': case 1 : System.out.println(a+b);
                    break;
        case '-': case 2 : System.out.println(a-b);
                    break;
        case '*': case 3 : System.out.println(a*b);
                    break;
        case '/': case 4 : System.out.println(a/b);
                    break;
        case '%': case 5 : System.out.println(a%b);
                    break;
        default :  System.out.println("not that much adavanced");
        
    }
   } 
}
