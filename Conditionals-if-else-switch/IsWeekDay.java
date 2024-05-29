import java.util.Scanner;

public class IsWeekDay {
    public static void main(String[] args) {
        System.out.println("Enter a number of day between 0(Sunday) to 6(Saturday): ");
        Scanner sc = new Scanner(System.in);
        int dayNumber = sc.nextInt();
        isWeekDay(dayNumber);
    }
    public static boolean isWeekDay(int dayNumber){
        switch(dayNumber){
            case 0, 6:
                return false;
            case 1, 2, 3, 4, 5:
                System.out.println("It's a week day");
                return true;
            default: System.out.println("Invalid Input");
                return false;
        }
    }
}
