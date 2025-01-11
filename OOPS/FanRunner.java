public class FanRunner {
    public static void main(String[] args) {

        Fan fan = new Fan("Bajaj", 0.345, "Cream");
        System.out.println(fan);

        fan.switchOn();
        System.out.println(fan);

        fan.setSpeed((byte) 2);
        System.out.println(fan);

        fan.switchOff();
        System.out.println(fan);
    }
}
