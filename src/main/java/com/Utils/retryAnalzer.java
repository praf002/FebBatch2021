package com.Utils;

import org.testng.ITestResult;

public class retryAnalzer {

	int counter=0;
	int maxLimit=3;
	
	
	public boolean retry(ITestResult result) {
		
		if(counter<maxLimit) {
			counter++;
			return true;
		}
		
		return false;
	}

}
