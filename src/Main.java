import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        double num1 = in.nextDouble();
        double num2 = in.nextDouble();
        System.out.println("Enter the operator:\n +\n -\n *\n /\n");
        char operation = in.next().charAt(0);
        double result = 0;
        switch(operation){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Enter your wrong input");
        }
        System.out.printf("Result: %f", result);
    }
}