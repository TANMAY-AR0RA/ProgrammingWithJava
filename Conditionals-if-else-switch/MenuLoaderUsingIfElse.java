import java.util.Scanner;

public class MenuLoaderUsingIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        System.out.println("Number1: ");
        int number1 = sc.nextInt();
        System.out.println("Number2: ");
        int number2 = sc.nextInt();
        System.out.println("1 - Add");
        System.out.println("2 - Subtract");
        System.out.println("3 - Divide");
        System.out.println("4 - Multiply");
        System.out.print("---Choose Operation---: ");

        int operation = sc.nextInt();
        int result = 0;
        if(operation == 1){
            result = number1 + number2;
        } else if (operation == 2) {
            result = number1 - number2;
        } else if (operation == 3) {
            result = number1 / number2;
        } else if (operation == 4) {
            result = number1 * number2;
        }
        else {
            System.out.println("wrong input");
        }

        System.out.println("Result is: " + result);
    }
}
