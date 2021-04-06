package com.cobiscorp.cobis.pfprt.test;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaApertura extends Base {
	
	public static Target HEAD_APERTURA = Target.the("Div encabezado pagina Apertura").located(By.id("cb_head"));
	public static Target TEST_VALIDATOR = Target.the("Iframe formulario funcionalidad").located(By.xpath("//body/div[@id='workarea']/iframe[1]"));
	



	public static Target BOTON_GUARDAR = Target.the("Botón Guardar").inIFrame(IFRAME_MENU).located(By.id("CM_TPFPRTXU_7OV"));
	
	
}
