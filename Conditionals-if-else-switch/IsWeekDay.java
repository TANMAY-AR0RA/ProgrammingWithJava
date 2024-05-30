import java.util.Scanner;

public class IsWeekDay {
    public static void main(String[] args) {
        System.out.println("Enter a number of day between 0(Sunday) to 6(Saturday): ");
        Scanner sc = new Scanner(System.in);
        int dayNumber = sc.nextInt();
        System.out.println(isWeekDay(dayNumber));
    }
    public static boolean isWeekDay(int dayNumber){
        switch(dayNumber){
            case 0:
            case 6: return false;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5: return true;
            default: System.out.println("Invalid Input");
                return false;
        }
    }
}
