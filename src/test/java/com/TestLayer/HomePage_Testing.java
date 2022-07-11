package com.TestLayer;

import org.testng.annotations.Test;

import com.BaseLayer.BaseClass;
import com.PageLayer.HomePage;

public class HomePage_Testing extends BaseClass {
	
	@Test
	public void testing_validatingHP() {
		
		HomePage HomePage_Object=new HomePage();	
		HomePage_Object.validatingHP();
		
	}
	

}
