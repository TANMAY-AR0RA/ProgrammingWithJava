public class BiNumber {
    private int number1;
    private int number2;

    BiNumber(int number1, int number2){
        this.number1 = number1;
        this.number2 = number2;
    }
    public int add(){
        return number1 + number2;
    }
    public int multiply(){
        return number1 * number2;
    }
    public void doubleValue(){
        this.number1 *= 2;
        this.number2 *= 2;
    }
    public int getNumber1(){
        return this.number1;
    }
    public int getNumber2(){
        return this.number2;
    }
}
