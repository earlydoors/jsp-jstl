package com.jspservletcookbook;

import java.util.TimeZone;

public class ZoneWrapper {
	
	public String[] getAvailableIDs(){
		
		return TimeZone.getAvailableIDs();
	}

}
