package AutomaticBike;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class AutomaticBikeControlTest {


    @Test
    public void newAutomaticBike_thatCanTurnOnTest() {
        AutomaticeBike automaticeBike = new AutomaticeBike();
        automaticeBike.turnOn();
        assertTrue(automaticeBike.turnOn());
    }

    @Test
    public void newAutomaticBike_thatCanTurnOn_andTurnOffTest() {
        AutomaticeBike automaticeBike = new AutomaticeBike();
        automaticeBike.turnOn();
        automaticeBike.turnOff();
        assertEquals(true, automaticeBike.turnOff());
    }

    @Test
    public void newAutomaticBike_ThatRespond_whenYouAccelerate_AndPressBrakeTest() {
        AutomaticeBike automaticeBike = new AutomaticeBike();
        automaticeBike.turnOn();
        automaticeBike.isBrake();
        assertEquals(true, automaticeBike.isBrake());
    }

    @Test
    public void newAutomaticBike_ThatCanAccelerate_whenTurnOnTest() {
        AutomaticeBike automaticeBike = new AutomaticeBike();
        automaticeBike.turnOn();
        automaticeBike.accelerateBike();
        assertEquals(true, automaticeBike.accelerateBike());
    }

    @Test
    public void newAutomaticBike_ThatCanNotAccelerate_WhenTurnOffTest() {
        AutomaticeBike automaticeBike = new AutomaticeBike();
        automaticeBike.turnOff();
        automaticeBike.decelerateBike();
        assertEquals(true, automaticeBike.turnOff());
    }


    @Test
    public void newAutomaticBike_ThatRespond_whenYouIncrease_accelerationTest() {
        AutomaticeBike automaticeBike = new AutomaticeBike();

        }

}
