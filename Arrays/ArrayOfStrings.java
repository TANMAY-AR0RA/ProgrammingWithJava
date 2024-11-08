public class ArrayOfStrings {
    String[] dow;
    static String longestString(String ...dow){
        int maxLength = Integer.MIN_VALUE;
        String maxDay = new String("");
        for(String day : dow){
            if(day.length() > maxLength) {
                maxLength = day.length();
                maxDay = day;
            }
        }
        return maxDay;
    }

    static void daysOfWeekBackwards(String ...daysOfWeek){
        System.out.println("The days of week backwards:\n");
        for (int i = daysOfWeek.length - 1; i >= 0; i--) {
            System.out.println(daysOfWeek[i]);
        }
    }
    public static void main(String[] args) {
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println("The day with most number of letters in it is: " + longestString(daysOfWeek) + "\n");
        daysOfWeekBackwards(daysOfWeek);

    }
}
