package net.digital_alexandria.tests;

import net.digital_alexandria.sgl4j.numeric.Combinatorial;
import net.digital_alexandria.sgl4j.numeric.Moments;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

/**
 * @author Simon Dirmeier {@literal simon.dirmeier@gmx.de}
 */
public class NumericTest
{
    @Test
    public void testCombinatorial() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException
    {
        List<String> l = Combinatorial.combinatorial(new char[]{'s', 'g', 'l'}, 2);
        assert l.size() == 3 + Math.pow(3, 2);
    }


    @Test
    public void testEqual() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException
    {
        assert net.digital_alexandria.sgl4j.numeric.Math.sumEquals(new double[]{1, 2, 3}, .1, 6.05);
    }

    @Test(expected = AssertionError.class)
    public void testEqualError() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException
    {
        assert net.digital_alexandria.sgl4j.numeric.Math.sumEquals(new double[]{1, 2, 3}, .1, 6.15);
    }

    @Test
    public void testStringToDouble() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException
    {
        assert net.digital_alexandria.sgl4j.strings.Parsers.toDouble("2")[0] == 2;
    }

    @Test
    public void testMean() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException
    {
        assert Moments.mean(new double[]{1,3}) == 2;
    }

    @Test
    public void testVariance() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException
    {
        assert Moments.variance(new double[]{1,3}) == 2;
    }

    @Test
    public void testStandardDeviation() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException
    {
        double std =  Moments.standardDeviation(new double[]{1,3});
        assert net.digital_alexandria.sgl4j.numeric.Math.equals(std*std, 2, .1);
    }
}
