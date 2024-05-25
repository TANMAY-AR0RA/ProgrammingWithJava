public class BikeRunner {
    public static void main(String[] args) {
        Bike ducati = new Bike(); // ducati object gets a default speed of 10
        System.out.println(ducati.getSpeed());
        Bike suzuki = new Bike(100); // Parameterized constructor is called here
        System.out.println(suzuki.getSpeed());

    }
}
