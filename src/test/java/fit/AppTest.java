package fit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void shouldExistAirplane()
    {
        var airplane = new Airplane(); 
        assertNotNull(airplane);
    }

    @Test
    public void shouldExistJet()
    {
        var jet = new Jet(); 
        assertNotNull(jet);
    }

    @Test
    public void jetMustBeTwoTimesFasterThenAirplaneWhenAccelerate() {
        var airplane = new Airplane();
        var jet = new Jet();

        jet.accelerate();

        assertEquals(jet.getSpeed() / airplane.getSpeed(), 2);
    }
}
