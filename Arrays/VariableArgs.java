public class VariableArgs {

    static int sum(int ...values) { // Variable Arguments int ...values OR int... values
        int sum = 0;
        for(int value : values){
            sum += value;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Sum of numbers 1 -> 5: " + sum(1, 2, 3, 4, 5));
        System.out.println("Sum of numbers 1 -> 10: " + sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }
}
