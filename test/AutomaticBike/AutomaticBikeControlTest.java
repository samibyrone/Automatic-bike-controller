package AutomaticBike;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class AutomaticBikeControlTest {

    private AutomaticBike automaticBike;

    @BeforeEach
        public void setup() {
        automaticBike = new AutomaticBike();
    }

    @Test
    public void newAutomaticBike_thatCanTurnOnTest() {
        boolean turnOn;
        turnOn = automaticBike.automaticBikeCanTurnOn();
        assertTrue(true);
    }

    @Test
    public void newAutomaticBike_thatCanTurnOn_andTurnOffTest() {
        boolean turnOff = automaticBike.automaticBikeCanTurnOff();
        assertTrue(true);
    }

    @Test
    public void newAutomaticBike_ThatRespond_whenYouAccelerateTest() {
        int accelerate = automaticBike.automaticBikeCanAccelerate(5);
        assertEquals(5, accelerate);
    }

    @Test
    public void newAutomaticBikeCanIncreaseSpeedWhenItOnGearOneTest() {
        int currentSpeed = automaticBike.automaticBikeSpeedIncreaseSpeedInGearOne(15);
        assertEquals(16, currentSpeed);
    }

    @Test
    public void newAutomaticBikeCanIncreaseSpeedWhenItOnGearTwoTest() {
       int currentSpeed = automaticBike.automaticBikeSpeedIncreaseSpeedInGearTwo(24);
        assertEquals(26, currentSpeed);
    }


    @Test
    public void newAutomaticBikeCanIncreaseSpeedWhenItOnGearThreeTest() {
        int currentSpeed = automaticBike.automaticBikeSpeedIncreaseSpeedInGearThree(35);
        assertEquals(38, currentSpeed);
    }

    @Test
    public void newAutomaticBikeCanIncreaseSpeedWhenItOnGearFourTest() {
        int currentSpeed = automaticBike.automaticBikeSpeedIncreaseSpeedInGearFour(44);
        assertEquals(48, currentSpeed);
    }

    @Test
    public void newAutomaticBikeCanDecreaseSpeedWhenItOnGearOneTest() {
        int currentSpeed = automaticBike.automaticBikeSpeedDecreaseSpeedToGearOne(15);
        assertEquals(14, currentSpeed);
    }

    @Test
    public void newAutomaticBikeCanDecreaseSpeedWhenItOnGearTwoTest() {
        int currentSpeed = automaticBike.automaticBikeSpeedDecreaseSpeedToGearTwo(24);
        assertEquals(22, currentSpeed);
    }

    @Test
    public void newAutomaticBikeCanDecreaseSpeedWhenItOnGearThreeTest() {
        int currentSpeed = automaticBike.automaticBikeSpeedDecreaseSpeedToGearThree(35);
        assertEquals(32, currentSpeed);
    }


    @Test
    public void newAutomaticBikeCanDecreaseSpeedWhenItOnGearFourTest() {
        int currentSpeed = automaticBike.automaticBikeSpeedDecreaseSpeedToGearFour(44);
        assertEquals(40, currentSpeed);
    }

}