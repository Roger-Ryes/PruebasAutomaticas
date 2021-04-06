package com.cobiscorp.cobis.pfprt.test;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class DesignerHeader extends Base{
	
	public static Target BOTON_DROPDOWN = Target.the("DropDown Acciones Apertura").inIFrame(IFRAME_MENU).located(By.xpath("//body[1]/div[1]/cobis-header[1]/div[1]/div[1]/div[2]/div[1]/button[1]/span[1]"));
	public static Target ACTIVAR = Target.the("Activar Apertura").inIFrame(IFRAME_MENU).located(By.xpath("//a[contains(text(),'Activar')]"));
	public static Target BOTON_ACEPTAR_MODAL_ACTIVAR= Target.the("Botón Aceptar Modal Activar").inIFrame(IFRAME_MENU).located(By.id("CM_TPFPRTTP_0PX"));
	
}
