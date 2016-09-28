/**
 * sgl4j: a Java implementation of various latent variable models.
 *
 * Copyright (C) 2015 - 2016 Simon Dirmeier
 *
 * This file is part of sgl4j.
 * <p>
 * sgl4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p>
 * sgl4j is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p>
 * You should have received a copy of the GNU General Public License
 * along with sgl4j.  If not, see <http://www.gnu.org/licenses/>.
 */


package net.digital_alexandria.tests;

import net.digital_alexandria.sgl4j.datastructures.Pair;
import net.digital_alexandria.sgl4j.datastructures.Triple;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;

/**
 * @author Simon Dirmeier {@literal simon.dirmeier@gmx.de}
 */
public class DataStructureTest
{
    @Test
    public void testFirst() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException
    {
        Pair<String, String> p = new Pair<>("s", "g");
        assert p.getFirst().equals("s");
    }

    @Test
    public void testSecond() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException
    {
        Pair<String, String> p = new Pair<>("s", "g");
        assert p.getSecond().equals("g");
    }

    @Test
    public void testThird() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException
    {
        Triple<String, String, String> p = new Triple<>("s", "g", "l");
        assert p.getThird().equals("l");
    }

    @Test(expected = AssertionError.class)
    public void testCompareTo() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException
    {
        Pair<String, String> p1 = new Pair<>("s", "g");
        Pair<String, String> p2 = new Pair<>("h", "g");
        assert p1.compareTo(p2) == 0;
    }

}
