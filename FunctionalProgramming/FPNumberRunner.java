import java.util.List;

public class FPNumberRunner {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);

        NormalSum(numbers);
        System.out.println("Sum of numbers: " + SumUsingFP(numbers));
        System.out.println("Sum of Odd numbers: " + OddSumUsingFP(numbers));
    }

    private static void NormalSum(List<Integer> numbers) {
        int sum = 0;
        for(int num : numbers){
            sum += num; //mutation
        }
        System.out.println("Normal Sum of numbers: " + sum);
    }

    private static int SumUsingFP(List<Integer> numbers) {
        return numbers.stream().reduce(0, (num1, num2) -> num1 + num2);
    }

    private static int OddSumUsingFP(List<Integer> numbers) {
        return numbers.stream()
                .filter(number -> number%2 == 1)
                .reduce(0, (num1, num2) -> num1 + num2);
    }
}
