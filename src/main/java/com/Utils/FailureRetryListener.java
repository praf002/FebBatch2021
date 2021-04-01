package com.Utils;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class FailureRetryListener implements IAnnotationTransformer {
 
 //Overriding the transform method to set the RetryAnalyzer
 public void transform(ITestAnnotation testAnnotation, Class testClass, 
 Constructor testConstructor, Method testMethod) {
 @SuppressWarnings("deprecation")
IRetryAnalyzer retry = testAnnotation.getRetryAnalyzer();

 if (retry == null)
 testAnnotation.setRetryAnalyzer(IRetryAnalyzer.class);
 }
}