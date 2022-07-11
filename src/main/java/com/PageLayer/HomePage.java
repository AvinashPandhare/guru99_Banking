package com.PageLayer;

import com.BaseLayer.BaseClass;

import org.testng.Assert;

public class HomePage extends BaseClass {
	
	public void validatingHP() {
		
		String Title=driver.getTitle();
		Assert.assertEquals("Guru99 Bank Home Page",Title);
	}

}
