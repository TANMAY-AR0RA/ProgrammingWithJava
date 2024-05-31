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
    }

    public void isPrime(){

    }
    public void printANumberTriangle(){

    }
}
