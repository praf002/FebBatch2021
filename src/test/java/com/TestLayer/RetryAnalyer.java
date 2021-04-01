package com.TestLayer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyer implements IRetryAnalyzer {

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
