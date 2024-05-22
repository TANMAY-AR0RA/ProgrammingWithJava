public class MotorBike {
    private int speed;

    void start(String bikeName){
        System.out.println(bikeName +" started");
    }
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
