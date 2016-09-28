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

package net.digital_alexandria.sgl4j.datastructures;

/**
 * Class that holds a pair of two values.
 *
 * @author Simon Dirmeier {@literal simon.dirmeier@gmx.de}
 */
public class Pair<T extends Comparable<T>, U extends Comparable<U>> implements Comparable<Pair<T, U>>
{
    private final T _T;
    private final U _U;

    public Pair(T t, U u)
    {
        this._T = t;
        this._U = u;
    }

    /**
     * Getter for the first value.
     *
     * @return returns the first value
     */
    public T getFirst()
    {
        return _T;
    }

    /**
     * Getter for the second value.
     *
     * @return returns the second value
     */
    public U getSecond()
    {
        return _U;
    }

    @Override
    public int compareTo(Pair<T, U> o)
    {
        return this._T.compareTo(o._T);
    }
}
