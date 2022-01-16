package com.mindtree.pageobject;

import org.apache.log4j.Logger;

import com.mindtree.exceptions.WebDriverHelperException;
import com.mindtree.reusable.WebDriverHelper;
import com.mindtree.uistore.corporatemissionUI;
import com.mindtree.utility.Logs;


public class corporatemission {
	WebDriverHelper helper;
	Logs loggerUtil;
	Logger log;
	public corporatemission() {
		//helper = new WebDriverHelper();
		loggerUtil = new Logs();
	}



	public void tohover() {
		log = loggerUtil.createLog("corporatemission.java");
		log.debug("Mouse Hover to About Us");
		//helper.hover(corporatemissionUI.about);
	}
	public void toclick() {
		//helper.actionClick(corporatemissionUI.corporate);
		log.debug("Corporate Mission clicked");
	}
	public void validate() {
		String name = "Corporate Mission";
		//name = helper.getText(corporatemissionUI.corpo);
		if (name.contains("Corporate Mission")) {
			log.debug("Corporate Mission");
		}
	}
}
