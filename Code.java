import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        char op;
        Double x, y, res;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        x = sc.nextDouble();
        System.out.println("Enter the second number");
        y = sc.nextDouble();
        System.out.println("Enter any of the following op: +, -, *, /, %");
        op = sc.next().charAt(0);
        switch (op) {
            case '+':
                res = x + y;
                System.out.println(x + " + " + y + " = " + res);
                break;
            case '-':
                res = x - y;
                System.out.println(x + " - " + y + " = " + res);
                break;
            case '*':
                res = x * y;
                System.out.println(x + " * " + y + " = " + res);
                break;
            case '/':
                res = x / y;
                System.out.println(x + " / " + y + " = " + res);
                break;
            case '%':
                res = x % y;
                System.out.println(x + " % " + y + " = " + res);
                break;
            default:
                System.out.println("The op you have selected is invalid");
                break;
        }
    }
}