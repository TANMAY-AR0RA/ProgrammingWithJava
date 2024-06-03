public class MyNumberMain {
    public static void main(String[] args) {
        int n = 8;
        MyNumber number = new MyNumber(n);
        boolean isPrime = number.isPrime(); //Is a number Prime?
        System.out.println(isPrime);
        int sum = number.sumUptoN(); //Sum of  numbers upto n
        //1 + 2 + 3 + 4 + 5
        System.out.println("Sum of numbers upto " + n + " is: " + sum);

        int sumOfDivisors = number.sumOfDivisors(); // sum of all divisors except 1 and itself
        System.out.println("Sum of divisors of "  + n + " is: " + sumOfDivisors);

        number.printANumberTriangle();
        //1
        //1 2
        //1 2 3
        //1 2 3 4
        //1 2 3 4 5
    }
}
