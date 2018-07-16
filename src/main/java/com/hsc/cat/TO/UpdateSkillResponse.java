/**
**********************************************************************************************************
--  FILENAME		: UpdateSkillResponse.java
--  DESCRIPTION		: Response POJO for update skill
--
--  Copyright		: Copyright (c) 2018.
--  Company			: HSC
--
--  Revision History
-- --------------------------------------------------------------------------------------------------------
-- |VERSION |      Date                              |      Author              |      Reason for Changes                                         |
-- --------------------------------------------------------------------------------------------------------
-- |  0.1   |   May 22, 2018                         |     Richa Anand      |       Initial draft                                                        |
-- --------------------------------------------------------------------------------------------------------
--
************************************************************************************************************
**/

package com.hsc.cat.TO;

import java.util.List;

public class UpdateSkillResponse {

	private List<UpdateSkillTO> updateSkillTOList;

	
	public List<UpdateSkillTO> getUpdateSkillTOList() {
		return updateSkillTOList;
	}
	public void setUpdateSkillTOList(List<UpdateSkillTO> updateSkillTOList) {
		this.updateSkillTOList = updateSkillTOList;
	}

	
	
}
