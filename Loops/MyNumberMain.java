public class MyNumberMain {
    public static void main(String[] args) {
        int n = 9;
        MyNumber number = new MyNumber(n);
        number.isPrime(); //Is a number Prime?
        int sum = number.sumUptoN(); //Sum of  numbers upto n
        //1 + 2 + 3 + 4 + 5
        System.out.println("Sum of " + n + "numbers is: " + sum);
        int sumOfDivisors = number.sumOfDivisors(); // sum of all divisors except 1 and itself

        number.printANumberTriangle();
        //1
        //1 2
        //1 2 3
        //1 2 3 4
        //1 2 3 4 5
    }
}
