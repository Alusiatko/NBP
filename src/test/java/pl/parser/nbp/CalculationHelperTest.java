package pl.parser.nbp;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class CalculationHelperTest {

    @Test
    public void testCountAverage() {
        // GIVEN
        List<Double> input = Arrays.asList(3.5, 4.5);

        // WHEN
        CalculationHelper calculationHelper = new CalculationHelper();
        Double actual = calculationHelper.countAverage(input);

        // THEN
        Assert.assertEquals(4.0, actual, 0);
    }

    @Test
    public void testEmpty() {
        // GIVEN
        List<Double> emptyInput = Arrays.asList();

        // WHEN
        CalculationHelper calculationHelper = new CalculationHelper();
        Double act1 = calculationHelper.countAverage(emptyInput);

        // THEN
        Assert.assertEquals(0, act1, 0);
    }

    @Test
    public void testEmpty2() {
        // GIVEN
        List<Double> emptyInput2 = Arrays.asList(null, null);

        // WHEN
        CalculationHelper calculationHelper2 = new CalculationHelper();
        Double act1 = calculationHelper2.countAverage(emptyInput2);

        // THEN
        Assert.assertEquals(0, act1, 0);
    }
}
