class Bike{
    private int speed;

    Bike(){
        this(10); // default constructor is initialized
                        // with parameterized constructor using this keyword
    }
    Bike(int speed){
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}