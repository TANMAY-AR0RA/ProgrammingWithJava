import java.util.Scanner;

public class DetermineNameofDay {
    public static void main(String[] args) {
        System.out.println("Enter a number of day between 0(Sunday) to 6(Saturday): ");
        Scanner sc = new Scanner(System.in);
        int dayNumber = sc.nextInt();
        System.out.println(determineNameofDay(dayNumber));
    }
    public static String determineNameofDay(int dayNumber){
        switch(dayNumber){
            case 0: return "Sunday";
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
            default: return "Invalid Input";
        }
    }
}
