/*
 * Copyright (C) 2013      Denis Forveille titou10.titou10@gmail.com
 * Copyright (C) 2010-2013 Serge Rieder serge@jkiss.org
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
package org.jkiss.dbeaver.ext.db2.model.dict;

import org.jkiss.dbeaver.model.DBPNamedObject;
import org.jkiss.dbeaver.model.struct.DBSEntityConstraintType;

/**
 * DB2 Type of Constraints
 * 
 * @author Denis Forveille
 */
public enum DB2ConstraintType implements DBPNamedObject {
    F("F (Foreign key)", DBSEntityConstraintType.FOREIGN_KEY),

    I("I (Functional dependency)", DBSEntityConstraintType.ASSOCIATION),

    K("K (Check)", DBSEntityConstraintType.CHECK),

    P("P (Primary key)", DBSEntityConstraintType.PRIMARY_KEY),

    U("U (Unique)", DBSEntityConstraintType.UNIQUE_KEY);

    private String name;
    private DBSEntityConstraintType type;

    // -----------
    // Constructor
    // -----------
    private DB2ConstraintType(String name, DBSEntityConstraintType type)
    {
        this.name = name;
        this.type = type;
    }

    // -----------------------
    // Display @Property Value
    // -----------------------
    @Override
    public String toString()
    {
        return name;
    }

    // -----------
    // Helpers
    // -----------
    public static DBSEntityConstraintType getConstraintType(String code)
    {
        return DB2ConstraintType.valueOf(code).getType();
    }

    // ----------------
    // Standard Getters
    // ----------------
    @Override
    public String getName()
    {
        return name;
    }

    public DBSEntityConstraintType getType()
    {
        return type;
    }

}