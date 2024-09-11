package AutomaticBike;


public class AutomaticeBike {
    private boolean turnOn;
    private boolean turnOff;
    private boolean brake;
    private int accelerate;
    private int decelerate;
    private int currentSpeed;


    public boolean turnOn() {
        return true;
    }

    public boolean turnOff() {
        return true;
    }

    public boolean isBrake() {
        return true;
    }

    public void accelerateBike() {
        int currentSpeed = accelerate;
    }

    public void decelerateBike(int currentSpeed) {
        currentSpeed = decelerate;
    }



}
