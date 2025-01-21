public class CustomerRunner {
    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.name = "John Doe";
        customer.phoneNumber = "123-456-7890";

        System.out.println("Customer Name: " + customer.name);
        System.out.println("Customer Phone Number: " + customer.phoneNumber);
    }
}
