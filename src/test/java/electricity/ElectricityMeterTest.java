package electricity;

import org.junit.Assert;
import org.junit.Test;

public class ElectricityMeterTest {

    @Test
    public void addKWh() {
        ElectricityMeter electricityMeter = new ElectricityMeter();
        electricityMeter.addKWh(1);
        Assert.assertTrue(electricityMeter.getkWh()==1);
    }
}