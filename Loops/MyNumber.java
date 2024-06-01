public class MyNumber {
    private int n;
    public MyNumber(int n) {
        this.n = n;
    }

    public int sumUptoN() {
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        return sum;
    }

    public int sumOfDivisors() {
        int sum = 0;
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                sum += i;
            }
        }
        return sum;
    }

    public void isPrime(){
        if(n == 1)
            System.out.println(n + " is neither prime nor composite");

        for(int i = 2; i < n; i++){
            if(n % i == 0){
                System.out.println(n + " is not a prime number.");
                return;
            }
        }
        System.out.println(n + " is a prime number.");
    }
    public void printANumberTriangle(){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
