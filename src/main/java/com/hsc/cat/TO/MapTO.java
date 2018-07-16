/**
**********************************************************************************************************
--  FILENAME		: MapTO.java
--  DESCRIPTION		: Response POJO for chart
--
--  Copyright		: Copyright (c) 2018.
--  Company			: HSC
--
--  Revision History
-- --------------------------------------------------------------------------------------------------------
-- |VERSION |      Date                              |      Author              |      Reason for Changes                                         |
-- --------------------------------------------------------------------------------------------------------
-- |  0.1   |   June 6, 2018                         |     Richa Anand      |       Initial draft                                                        |
-- --------------------------------------------------------------------------------------------------------
--
************************************************************************************************************
**/

package com.hsc.cat.TO;

import java.util.HashMap;
import java.util.List;

public class MapTO {
	
	private HashMap<String, List<SubjectTO>> map;

	public HashMap<String, List<SubjectTO>> getMap() {
		return map;
	}

	public void setMap(HashMap<String, List<SubjectTO>> map) {
		this.map = map;
	}
	
	
	
}
