package AutomaticBike;


public class AutomaticBike {

    boolean turnOn;
    boolean turnOff;
    int speed = 1;
    int gearLevel;
    int accelerate = 1;

    public boolean automaticBikeCanTurnOn() {
        turnOn = false;
        if (turnOn) turnOn = true;
        return true;
    }

    public boolean automaticBikeCanTurnOff() {
        turnOff = false;
        if (!turnOff) turnOff = true;
        return true;
    }

    public int automaticBikeCanAccelerate(int accelerate) {
        return accelerate;
    }

    public int automaticBikeSpeedIncreaseSpeedInGearOne(int currentSpeed) {
        if (speed >= 0 && speed <= 20)
            gearLevel = 1;
            accelerate = 1;
            currentSpeed += accelerate;
            return currentSpeed;
    }


    public int automaticBikeSpeedIncreaseSpeedInGearTwo(int currentSpeed) {
        if (speed >= 20 && speed <= 30)
            ++gearLevel;
            ++accelerate;
            currentSpeed += accelerate;
            return currentSpeed;
    }

    public int automaticBikeSpeedIncreaseSpeedInGearThree(int currentSpeed) {
        if (speed >= 30 && speed <= 40)
            gearLevel += 2;
            accelerate += 2;
            currentSpeed += accelerate;
            return currentSpeed;
    }

    public int automaticBikeSpeedIncreaseSpeedInGearFour(int currentSpeed) {
        if (speed >= 40 && speed <= 50)
            gearLevel += 3;
            accelerate += 3;
            currentSpeed += accelerate;
            return currentSpeed;
    }

    public int automaticBikeSpeedDecreaseSpeedToGearOne(int currentSpeed) {
        if (speed >= 0 && speed <= 20)
            gearLevel = 1;
            accelerate = 1;
            currentSpeed -= accelerate;
            return currentSpeed;
    }

    public int automaticBikeSpeedDecreaseSpeedToGearTwo(int currentSpeed) {
        if (speed >= 20 && speed <= 30)
            gearLevel = 2;
            accelerate = 2;
            currentSpeed -= accelerate;
            return currentSpeed;
    }

    public int automaticBikeSpeedDecreaseSpeedToGearThree(int currentSpeed) {
        if (speed >= 20 && speed <= 30)
            gearLevel = 3;
            accelerate = 3;
            currentSpeed -= accelerate;
            return currentSpeed;
    }

    public int automaticBikeSpeedDecreaseSpeedToGearFour(int currentSpeed) {
        if (speed >= 20 && speed <= 30)
            gearLevel = 4;
            accelerate = 4;
            currentSpeed -= accelerate;
            return currentSpeed;
    }
}
