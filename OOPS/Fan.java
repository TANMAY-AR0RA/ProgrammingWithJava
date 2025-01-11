public class Fan {
    private final String make;
    private final double radius;
    private final String color;
    private boolean isOn; // false : by default fan is off
    private byte speed; // 0-5 : by default fan speed is 0

    public Fan(String make, double radius, String color) {
        this.make = make;
        this.radius = radius;
        this.color = color;
    }

    public String toString() {
        return String.format("Fan [make = %s, radius = %.2f, color = %s, isOn = %b, speed = %d]", make, radius, color, isOn, speed);
    }

    public void switchOn() {
        isOn = true;
        setSpeed((byte) 5);
    }

    public void switchOff() {
        isOn = false;
        setSpeed((byte) 0);
    }

    public byte getSpeed() {
        return speed;
    }

    public void setSpeed(byte speed) {
        this.speed = speed;
    }
}
