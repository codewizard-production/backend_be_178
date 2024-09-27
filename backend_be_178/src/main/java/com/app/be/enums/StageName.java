package com.app.be.enums;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmEnumeration;

@EdmEnumeration	  
public enum StageName{
	    PreSeed,
	    Seed,
	    SeriesA,
	    SeriesB; 
    public int value(StageName stageName) {
        return stageName.ordinal();
    }
    public static StageName getStageName(int ordinal) {
        for(StageName stageName : StageName.values())
                if(stageName.ordinal() == ordinal)
                        return stageName;
        return null;
    }
}


