package net.digital_alexandria.tests;

import net.digital_alexandria.sgl4j.numeric.Combinatorial;
import net.digital_alexandria.sgl4j.numeric.Moments;
import net.digital_alexandria.sgl4j.numeric.Statistics;
import org.ejml.interfaces.decomposition.SingularValueDecomposition;
import org.ejml.simple.SimpleMatrix;
import org.ejml.simple.SimpleSVD;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

/**
 * @author Simon Dirmeier {@literal simon.dirmeier@gmx.de}
 */
public class NumericTest
{
    private final int _SZ = 10;
    private SimpleMatrix _X;

    @Before
    public void setUp() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException
    {
        double m[][] = new double[_SZ][_SZ];
        for (int i = 0; i < _SZ; i++)
        {
            for (int j = 0; j < _SZ; j++)
            {
                m[i][j] = 1;
            }
        }
        _X = new SimpleMatrix(m);
    }

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
        assert Moments.mean(new double[]{1, 3}) == 2;
    }

    @Test
    public void testVariance() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException
    {
        assert Moments.variance(new double[]{1, 3}) == 2;
    }

    @Test
    public void testStandardDeviation() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException
    {
        double std = Moments.standardDeviation(new double[]{1, 3});
        assert net.digital_alexandria.sgl4j.numeric.Math.equals(std * std, 2, .1);
    }

    @Test
    public void testVCOV() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException
    {
        SimpleMatrix VCOV = Statistics.vcov(_X);
        for (int i = 0; i < _SZ; i++)
        {
            for (int j = 0; j < _SZ; j++)
            {
                assert net.digital_alexandria.sgl4j.numeric.Math.equals(VCOV.get(i, j), 0.0, .01);
            }
        }
    }

    @Test
    public void testSVDStandardDeviation() throws NoSuchMethodException, InvocationTargetException,
                                                  IllegalAccessException
    {
        SimpleSVD SVD = Statistics.svd(_X);
        assert net.digital_alexandria.sgl4j.numeric.Math.equals(SVD.getW().get(0, 0), 10, .01);
    }
}
