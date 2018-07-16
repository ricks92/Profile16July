/**
**********************************************************************************************************
--  FILENAME		: SelfRatedSkillsTO.java
--  DESCRIPTION		: Response POJO for self rated skills
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

public class SelfRatedSkillsTO {

	private String empid;
    private int skillId;
	private String skillName;
	private String description;
	private int rating;
	private int sdlcCategory;
	private boolean NotPeerRated;
	
	

	

	public boolean isNotPeerRated() {
		return NotPeerRated;
	}


	public void setNotPeerRated(boolean notPeerRated) {
		NotPeerRated = notPeerRated;
	}


	public SelfRatedSkillsTO() {
		
	}
	
	
	public int getSkillId() {
		return skillId;
	}
	public void setSkillId(int skillId) {
		this.skillId = skillId;
	}
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

    public String getEmpid() {
		return empid;
	}

    public void setEmpid(String empid) {
		this.empid = empid;
	}


	public int getSdlcCategory() {
		return sdlcCategory;
	}


	public void setSdlcCategory(int sdlcCategory) {
		this.sdlcCategory = sdlcCategory;
	}
	
	
	
}
