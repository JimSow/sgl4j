/**
 * sgl4j: a Java implementation of various latent variable models.
 * <p>
 * Copyright (C) 2015 - 2016 Simon Dirmeier
 * <p>
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

package net.digital_alexandria.sgl4j.algorithm;

import net.digital_alexandria.sgl4j.datastructures.Pair;

import java.util.Arrays;

/**
 * Class for sorting data-structures.
 *
 * @author Simon Dirmeier {@literal simon.dirmeier@gmx.de}
 */
public final class Sort
{
    /** private constructor to avoid instantiation **/
    private Sort() {}

    /**
     * Sort a array of pairs by their second attributes.
     *
     * @param pairs      a array of pairs
     * @param descending sorts in descending order if true
     * @param <T>        some generic extending Comparable
     * @param <U>        some generic extending Comparable
     */
    public static <T extends Comparable<T>, U extends Comparable<U>>
    void sortSecond(final Pair<T, U>[] pairs, final boolean descending)
    {
        if (descending)
        {
            Arrays.sort(
                pairs,
                (o1, o2) -> (-1) * o1.getSecond().compareTo(o2.getSecond()));
        }
        else
        {
            Arrays.sort(
                pairs,
                (o1, o2) -> o1.getSecond().compareTo(o2.getSecond()));
        }
    }
}
