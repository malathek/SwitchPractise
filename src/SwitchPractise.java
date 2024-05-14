import java.util.*;
public class SwitchPractise {
    public static void main(String[] args) {
       //char ch ='a';
    /* switch(ch){
        case 'a','e' -> System.out.println("its me");

    } */
//this is applicable for jdk >13
   /*   int val  = switch (ch){
            case 'a':
                yield 65;

        };*/
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number to perform arithmetic operation");
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        System.out.println("Enter which operation need to perform +-*/%");
        int result = 0;
        char ch = sc.next().charAt(0);
        switch(ch){
            case '+':
                result = num1+num2;
                System.out.println("Addition of two number "+result);
                break;
            case '-':
                result = num1-num2;
                System.out.println("Subtraction of two number "+result);
                break;
            case '*':
                result = num1*num2;
                System.out.println("Multiplication of two number "+result);
                break;
            case '/':
                result = num1/num2;
                System.out.println("Division of two number "+result);
                break;
            case '%':
                result = num1%num2;
                System.out.println("Modulus of two number "+result);
                break;
            default:
                System.out.println("There is no such operator");
        }

    }
}
