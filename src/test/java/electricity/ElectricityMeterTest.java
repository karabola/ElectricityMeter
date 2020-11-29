package electricity;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ElectricityMeterTest {

    @Test
    public void addKWh() {
        ElectricityMeter electricityMeter = new ElectricityMeter();
        electricityMeter.addKWh(1);
        Assert.assertTrue(electricityMeter.getkWh()==1);
    }
}