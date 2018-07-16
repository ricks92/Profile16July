/**
**********************************************************************************************************
--  FILENAME		: SecurityQuestionService.java
--  DESCRIPTION		: Business logic for populating security questions in UI
--
--  Copyright		: Copyright (c) 2018.
--  Company			: HSC
--
--  Revision History
-- --------------------------------------------------------------------------------------------------------
-- |VERSION |      Date                              |      Author              |      Reason for Changes                                         |
-- --------------------------------------------------------------------------------------------------------
-- |  0.1   |   June 27, 2018                         |     Richa Anand      |       Initial draft                                                        |
-- --------------------------------------------------------------------------------------------------------
--
************************************************************************************************************
**/

package com.hsc.cat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hsc.cat.entity.SecurityQuestions;
import com.hsc.cat.repository.SecurityQuestionRepository;

@Service
@Transactional
public class SecurityQuestionService {

	@Autowired
	private SecurityQuestionRepository securityQuestionRepository;
	
	
	public List<SecurityQuestions> getSecurityQuestions(){
		List<SecurityQuestions> list=securityQuestionRepository.findAll();
		return list;
	}
}
