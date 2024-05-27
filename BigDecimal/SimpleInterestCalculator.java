import java.math.BigDecimal;

public class SimpleInterestCalculator {
    BigDecimal principal;
    BigDecimal interest;
    BigDecimal noOfYears;
    public SimpleInterestCalculator(String principal, String interest) {
        this.principal = new BigDecimal(principal);
        this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
    }

    public BigDecimal calculateTotalValue(int noOfYears) {
        this.noOfYears = new BigDecimal(noOfYears);
        return principal.add(principal.multiply(interest)
                .multiply(this.noOfYears));
    }
}
