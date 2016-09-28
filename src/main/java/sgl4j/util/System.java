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

package sgl4j.util;

import net.digital_alexandria.lvm4j.enums.ExitCode;

/**
 * @author Simon Dirmeier {@literal s@simon-dirmeier.net}
 */
public final class System
{
    private System(){}

    public static void exit(java.lang.String s, ExitCode exitCode)
    {
        java.lang.System.err.println(s);
        java.lang.System.exit(exitCode.code());
    }
}
