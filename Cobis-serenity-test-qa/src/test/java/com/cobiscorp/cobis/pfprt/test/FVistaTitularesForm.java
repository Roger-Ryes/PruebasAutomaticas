/*
 * Esta aplicacion es parte de los paquetes bancarios propiedad de COBISCORP.
 * Su uso no autorizado queda expresamente prohibido asi como cualquier
 * alteracion o agregado hecho por alguno de sus usuarios sin el debido
 * consentimiento por escrito de COBISCORP.
 * Este programa esta protegido por la ley de derechos de autor y por las
 * convenciones internacionales de propiedad intelectual. Su uso no
 * autorizado dara derecho a COBISCORP para obtener ordenes de secuestro
 * o retencion y para perseguir penalmente a los autores de cualquier infraccion.
 */
package com.cobiscorp.cobis.pfprt.test;
//import org.openqa.selenium.*;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class FVistaTitularesForm extends Base {
	
	public static Target BOTON_SIGUIENTE = Target.the("Botón Siguiente").inIFrame(IFRAME_MENU).located(By.id("CM_TPFPRTMQ_FFB"));
	public static class ListaTitulares {
		public static Target BOTON_BUSCAR_CLIENTE = Target.the("Botón Buscar Cliente").located(By.xpath("//button[@class='btn btn-default btn-block']"));
	}
//	public static class FiltroBusquedaTitular {
//	
//		public void setCondicionByCode(String value) {
//			Utils.waitUntilExistsElementById("VA_9493EMREWQEQIQW_409581", 10);
//			DropDownList.setValueById("VA_9493EMREWQEQIQW_409581", value, false);
//		}
//				
//		public void setCondicionByText(String value) {
//			Utils.waitUntilExistsElementById("VA_9493EMREWQEQIQW_409581", 10);
//			DropDownList.setTextById("VA_9493EMREWQEQIQW_409581", value, false);
//		}
//				
//	    public String getCondicionByCode() {
//			Utils.waitUntilExistsElementById("VA_9493EMREWQEQIQW_409581", 10);
//			return TextBox.getValueInput("VA_9493EMREWQEQIQW_409581");
//		}
//		
//	    public String getCondicionByText() {
//			Utils.waitUntilExistsElementById("VA_9493EMREWQEQIQW_409581", 10);
//			return DropDownList.getTextById("VA_9493EMREWQEQIQW_409581");
//		}
//		
//		public boolean CondicionIsEditable() {
//		boolean isNotEditable = DropDownList.checkIfDisabled("VA_9493EMREWQEQIQW_409581") ||  DropDownList.checkIfReadOnly("VA_9493EMREWQEQIQW_409581"); 				
//		return !isNotEditable;
//		}
//		public boolean CondicionIsValid() {
//		return DropDownList.checkClassInvalid("VA_9493EMREWQEQIQW_409581");		
//		}
//		public void setNumeroOperacion(String value) {
//			Utils.waitUntilExistsElementById("VA_1183CXMTNKPVPFM_999581", 10);
//			TextBox.clearTextById("VA_1183CXMTNKPVPFM_999581");
//			TextBox.setValueById("VA_1183CXMTNKPVPFM_999581", value);
//		}
//				
//		public void setNumeroOperacion(String value, int timeout) {
//			Utils.waitUntilExistsElementById("VA_1183CXMTNKPVPFM_999581", 10);
//			TextBox.clearTextById("VA_1183CXMTNKPVPFM_999581");
//			TextBox.setValueById("VA_1183CXMTNKPVPFM_999581", value, timeout);
//		}
//				
//	    public String getNumeroOperacion() {
//			Utils.waitUntilExistsElementById("VA_1183CXMTNKPVPFM_999581", 10);
//			return TextBox.getValueInput("VA_1183CXMTNKPVPFM_999581");
//		}
//		
//		public boolean NumeroOperacionIsEditable() {
//		boolean isNotEditable = TextBox.checkIfDisabled("VA_1183CXMTNKPVPFM_999581") ||  TextBox.checkIfReadOnly("VA_1183CXMTNKPVPFM_999581"); 				
//		return !isNotEditable;
//		}
//		public boolean NumeroOperacionIsValid() {
//		return TextBox.checkClassInvalid("VA_1183CXMTNKPVPFM_999581");		
//		}
//	}
//
	public static class GridListaTitulares {
		public static Target BOTON_NUEVO = Target.the("Botón Nuevo").located(By.xpath("//button[@class='btn btn-default k-grid-add cb-grid-button ng-binding ng-scope']"));
		public static Target SELECT_PERSONA_CLIC = Target.the("Select Persona Juridica").located(By.xpath("//body[1]/div[15]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/span[1]/span[2]"));
	}
}

