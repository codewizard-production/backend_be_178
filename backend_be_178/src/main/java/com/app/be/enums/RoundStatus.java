package com.app.be.enums;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmEnumeration;

@EdmEnumeration	  
public enum RoundStatus{
	    Planned,
	    Open,
	    Closed,
	    OverSubscribed,
	    Cancelled,
	    Paused; 
    public int value(RoundStatus roundStatus) {
        return roundStatus.ordinal();
    }
    public static RoundStatus getRoundStatus(int ordinal) {
        for(RoundStatus roundStatus : RoundStatus.values())
                if(roundStatus.ordinal() == ordinal)
                        return roundStatus;
        return null;
    }
}


