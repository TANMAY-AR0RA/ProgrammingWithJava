import java.util.List;

public class PrintEvenOddNumbersUsingFP {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,4,7,9);
        System.out.println("Odd numbers:");
        printOddNumbersWithFP(numbers);
        System.out.println("Even numbers:");
        printEvenNumbersWithFP(numbers);
    }

    private static void printOddNumbersWithFP(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number%2 == 1)
                .forEach(
                        number -> System.out.println(number)
                );
    }

    private static void printEvenNumbersWithFP(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number%2 == 0)
                .forEach(
                        number -> System.out.println(number)
                );
    }
}
