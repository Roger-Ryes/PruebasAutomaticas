package com.cobiscorp.cobis.pfprt.test;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.IFrame;
import net.serenitybdd.screenplay.targets.Target;


public class FComprobanteContable extends Base {
	public static IFrame FRAME  = IFrame.withPath(By.xpath("//body/div[@id='workarea']/iframe[1]")); 
	public static Target BUTTON_GUARDAR = Target.the("Guardar").inIFrame(FRAME).located(By.id("CM_TCNMNGDF_N1G"));
	public static Target MESSAGE_EXITO = Target.the("Mensaje éxito").inIFrame(FRAME).located(By.xpath("//div[contains(text(),'Operación realizada con éxito')]"));
	

	
				
	public static class Comprobante {
		public static Target INPUT_FECHA = Target.the("Fecha").inIFrame(FRAME).located(By.id("VA_1972NOYIHZCXWGH_841628"));
		public static Target INPUT_DESCRIPCION = Target.the("Descripción").inIFrame(FRAME).located(By.id("VA_2045TVIPEQGWKDD_668628"));
		public static Target FILTRO_COMPROBANTE_TIPO = Target.the("Comprobante Tipo").inIFrame(FRAME).located(By.xpath("//button[@ng-class='vc.viewState.VA_4483GJDPRVFSBRL_544628.style']"));
		public static Target FILTRO_AREA_ORIGEN = Target.the("Area Origen").inIFrame(FRAME).located(By.xpath("//button[@ng-class='vc.viewState.VA_2502TECDGCHQJNR_958628.style']"));
		
		
	}

	public static class GRID_TIPO_COMPROBANTE{
		public static Target COMPROBANTE_1 = Target.the("Comprobante 1").inIFrame(FRAME).located(By.xpath("//span[contains(text(),'COMPROBANTE TIPO 1 CAPITAL CONTABLE PRUEBA')]"));
	}
	
	public static class GRID_AREA_ORIGEN{
		public static Target AREA_CONTABILIDAD = Target.the("Comprobante 1").inIFrame(FRAME).located(By.xpath("//span[contains(text(),'CONTABILIDAD')]"));
	}
	
}
