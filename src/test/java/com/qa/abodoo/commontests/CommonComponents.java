package com.qa.abodoo.commontests;

public interface CommonComponents {
	 String hardSkills = "(//span[text()='Hard Skills'])[2]";
	 String addHardSkillIcon = "//img[@src='/_next/static/media/plusIconWhite.a05ddce9.svg']";
	 String addHardSkillField = "//input[@placeholder='Start typing here']";
	 String saveHardSkillAndProceedButton = "//button[text()='Save and Proceed']";
	 String softSkills = "(//span[text()='Soft Skills'])[2]";
	 String addSoftSkillField = "//input[@placeholder='Start typing here']";
	 String saveSoftSkillAndProceed = "//button[text()='Save & Proceed']";
	
	 String clearAll = "//button[text()='Clear all']";
	 String learningMenu = "(//a[@href='/learning'])[1]";
	 String addDesiredJobTitleButton = "//button[@class='btn btn-light justify-content-center']";
	 String addJobTitleField = "//input[@class='experience_input_field']";
	 String saveDesiredJobTitleButton = "//button[text()='Add']";
	 String matched = "//button[text()='Matched']";
	 String courseNameExpected = "Becoming a Cybersecurity Consultant";
	 String allJobs="//button[text()='All']";	
}
