package net.digital_alexandria.tests;

import net.digital_alexandria.sgl4j.strings.Parsers;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;

/**
 * @author Simon Dirmeier {@literal simon.dirmeier@gmx.de}
 */
public class StringsTest
{
    @Test
    public void testToDouble() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException
    {
        double[] d = Parsers.toDouble("1", "2");
        assert d[0] == 1;
    }

    @Test(expected = NumberFormatException.class)
    public void testToDoubleError() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException
    {
        Parsers.toDouble("1", "a");
    }
}
