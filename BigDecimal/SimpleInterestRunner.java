import java.math.BigDecimal;

public class SimpleInterestRunner {
    public static void main(String[] args) {
        //Simple Interest formula:
        // Total value = Principal + (Principal * Interest * noOfYears)
        SimpleInterestCalculator calculator = new SimpleInterestCalculator("4500.00", "7.5");
        BigDecimal totalValue = calculator.calculateTotalValue(5); //5 years
        System.out.println(totalValue);
    }
}
