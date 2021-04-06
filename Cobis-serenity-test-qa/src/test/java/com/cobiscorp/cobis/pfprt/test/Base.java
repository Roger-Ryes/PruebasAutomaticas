package com.cobiscorp.cobis.pfprt.test;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.IFrame;

public class Base {

	public static IFrame IFRAME_MENU  = IFrame.withPath(By.xpath("//iframe[@class='cb-external ng-scope']"));
	
	
}
