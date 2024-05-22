public class MotorBikeRunner {
    public static void main(String[] args){
        MotorBike yamaha = new MotorBike();
        yamaha.start("yamaha");
        yamaha.setSpeed(120);
        System.out.println("Speed is " + yamaha.getSpeed());

        MotorBike suzuki = new MotorBike();
        suzuki.start("suzuki");
        suzuki.setSpeed(60);
        System.out.println("Speed is " + suzuki.getSpeed());

    }
}
