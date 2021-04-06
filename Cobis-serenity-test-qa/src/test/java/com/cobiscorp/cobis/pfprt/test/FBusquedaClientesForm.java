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
import org.openqa.selenium.*;
//import com.cobiscorp.ecobis.test.selenium.*;
//import com.cobiscorp.ecobis.test.selenium.form.*;
//import org.apache.logging.log4j.Logger;

import net.serenitybdd.screenplay.targets.IFrame;
import net.serenitybdd.screenplay.targets.Target;

public class FBusquedaClientesForm {
	public static IFrame PROFILE_BANK_ACCOUNT_BALANCES  = IFrame.withPath(By.xpath("//body/div[@id='workarea']/iframe[1]"));
	
	public static IFrame PROFILE_BANK_ACCOUNT_BALANCESCTA  = IFrame.withPath(By.xpath("//body/div[@id='workarea']/iframe[1]/"));
			
	public static class ListaPJuridica {
//	
//		public void setCliente(String value) {
//			Utils.waitUntilExistsElementById("VA_TEXTINPUTBOXVVV_738587", 10);
//			TextBox.setValueById("VA_TEXTINPUTBOXVVV_738587", value);
//		}
//				
//		public void setCliente(String value, int timeout) {
//			Utils.waitUntilExistsElementById("VA_TEXTINPUTBOXVVV_738587", 10);
//			TextBox.setValueById("VA_TEXTINPUTBOXVVV_738587", value, timeout);
//		}
//				
//	    public String getCliente() {
//			Utils.waitUntilExistsElementById("VA_TEXTINPUTBOXVVV_738587", 10);
//			return TextBox.getValueInput("VA_TEXTINPUTBOXVVV_738587");
//		}
//		
//		public boolean ClienteIsEditable() {
//		boolean isNotEditable = TextBox.checkIfDisabled("VA_TEXTINPUTBOXVVV_738587") ||  TextBox.checkIfReadOnly("VA_TEXTINPUTBOXVVV_738587"); 				
//		return !isNotEditable;
//		}
//		public boolean ClienteIsValid() {
//		return TextBox.checkClassInvalid("VA_TEXTINPUTBOXVVV_738587");		
//		}
//		public void setDocId(String value) {
//			Utils.waitUntilExistsElementById("VA_TEXTINPUTBOXNVP_688587", 10);
//			TextBox.clearTextById("VA_TEXTINPUTBOXNVP_688587");
//			TextBox.setValueById("VA_TEXTINPUTBOXNVP_688587", value);
//		}
//				
//		public void setDocId(String value, int timeout) {
//			Utils.waitUntilExistsElementById("VA_TEXTINPUTBOXNVP_688587", 10);
//			TextBox.clearTextById("VA_TEXTINPUTBOXNVP_688587");
//			TextBox.setValueById("VA_TEXTINPUTBOXNVP_688587", value, timeout);
//		}
//				
//	    public String getDocId() {
//			Utils.waitUntilExistsElementById("VA_TEXTINPUTBOXNVP_688587", 10);
//			return TextBox.getValueInput("VA_TEXTINPUTBOXNVP_688587");
//		}
//		
//		public boolean DocIdIsEditable() {
//		boolean isNotEditable = TextBox.checkIfDisabled("VA_TEXTINPUTBOXNVP_688587") ||  TextBox.checkIfReadOnly("VA_TEXTINPUTBOXNVP_688587"); 				
//		return !isNotEditable;
//		}
//		public boolean DocIdIsValid() {
//		return TextBox.checkClassInvalid("VA_TEXTINPUTBOXNVP_688587");		
//		}
//		public void setNombreComercial(String value) {
//			Utils.waitUntilExistsElementById("VA_TEXTINPUTBOXJMK_955587", 10);
//			TextBox.clearTextById("VA_TEXTINPUTBOXJMK_955587");
//			TextBox.setValueById("VA_TEXTINPUTBOXJMK_955587", value);
//		}
//				
//		public void setNombreComercial(String value, int timeout) {
//			Utils.waitUntilExistsElementById("VA_TEXTINPUTBOXJMK_955587", 10);
//			TextBox.clearTextById("VA_TEXTINPUTBOXJMK_955587");
//			TextBox.setValueById("VA_TEXTINPUTBOXJMK_955587", value, timeout);
//		}
//				
//	    public String getNombreComercial() {
//			Utils.waitUntilExistsElementById("VA_TEXTINPUTBOXJMK_955587", 10);
//			return TextBox.getValueInput("VA_TEXTINPUTBOXJMK_955587");
//		}
//		
//		public boolean NombreComercialIsEditable() {
//		boolean isNotEditable = TextBox.checkIfDisabled("VA_TEXTINPUTBOXJMK_955587") ||  TextBox.checkIfReadOnly("VA_TEXTINPUTBOXJMK_955587"); 				
//		return !isNotEditable;
//		}
//		public boolean NombreComercialIsValid() {
//		return TextBox.checkClassInvalid("VA_TEXTINPUTBOXJMK_955587");		
//		}
//		public void setRazonSocial(String value) {
//			Utils.waitUntilExistsElementById("VA_TEXTINPUTBOXFGE_392587", 10);
//			TextBox.clearTextById("VA_TEXTINPUTBOXFGE_392587");
//			TextBox.setValueById("VA_TEXTINPUTBOXFGE_392587", value);
//		}
//				
//		public void setRazonSocial(String value, int timeout) {
//			Utils.waitUntilExistsElementById("VA_TEXTINPUTBOXFGE_392587", 10);
//			TextBox.clearTextById("VA_TEXTINPUTBOXFGE_392587");
//			TextBox.setValueById("VA_TEXTINPUTBOXFGE_392587", value, timeout);
//		}
//				
//	    public String getRazonSocial() {
//			Utils.waitUntilExistsElementById("VA_TEXTINPUTBOXFGE_392587", 10);
//			return TextBox.getValueInput("VA_TEXTINPUTBOXFGE_392587");
//		}
//		
//		public boolean RazonSocialIsEditable() {
//		boolean isNotEditable = TextBox.checkIfDisabled("VA_TEXTINPUTBOXFGE_392587") ||  TextBox.checkIfReadOnly("VA_TEXTINPUTBOXFGE_392587"); 				
//		return !isNotEditable;
//		}
//		public boolean RazonSocialIsValid() {
//		return TextBox.checkClassInvalid("VA_TEXTINPUTBOXFGE_392587");		
//		}
//		public void setCodigoOficial(String value) {
//			Utils.waitUntilExistsElementById("VA_TEXTINPUTBOXFGU_762587", 10);
//			TextBox.setValueById("VA_TEXTINPUTBOXFGU_762587", value);
//		}
//				
//		public void setCodigoOficial(String value, int timeout) {
//			Utils.waitUntilExistsElementById("VA_TEXTINPUTBOXFGU_762587", 10);
//			TextBox.setValueById("VA_TEXTINPUTBOXFGU_762587", value, timeout);
//		}
//				
//	    public String getCodigoOficial() {
//			Utils.waitUntilExistsElementById("VA_TEXTINPUTBOXFGU_762587", 10);
//			return TextBox.getValueInput("VA_TEXTINPUTBOXFGU_762587");
//		}
//		
//		public boolean CodigoOficialIsEditable() {
//		boolean isNotEditable = TextBox.checkIfDisabled("VA_TEXTINPUTBOXFGU_762587") ||  TextBox.checkIfReadOnly("VA_TEXTINPUTBOXFGU_762587"); 				
//		return !isNotEditable;
//		}
//		public boolean CodigoOficialIsValid() {
//		return TextBox.checkClassInvalid("VA_TEXTINPUTBOXFGU_762587");		
//		}
//		public void setTipoCliente(String value) {
//			Utils.waitUntilExistsElementById("VA_TEXTINPUTBOXCXN_608587", 10);
//			TextBox.clearTextById("VA_TEXTINPUTBOXCXN_608587");
//			TextBox.setValueById("VA_TEXTINPUTBOXCXN_608587", value);
//		}
//				
//		public void setTipoCliente(String value, int timeout) {
//			Utils.waitUntilExistsElementById("VA_TEXTINPUTBOXCXN_608587", 10);
//			TextBox.clearTextById("VA_TEXTINPUTBOXCXN_608587");
//			TextBox.setValueById("VA_TEXTINPUTBOXCXN_608587", value, timeout);
//		}
//				
//	    public String getTipoCliente() {
//			Utils.waitUntilExistsElementById("VA_TEXTINPUTBOXCXN_608587", 10);
//			return TextBox.getValueInput("VA_TEXTINPUTBOXCXN_608587");
//		}
//		
//		public boolean TipoClienteIsEditable() {
//		boolean isNotEditable = TextBox.checkIfDisabled("VA_TEXTINPUTBOXCXN_608587") ||  TextBox.checkIfReadOnly("VA_TEXTINPUTBOXCXN_608587"); 				
//		return !isNotEditable;
//		}
//		public boolean TipoClienteIsValid() {
//		return TextBox.checkClassInvalid("VA_TEXTINPUTBOXCXN_608587");		
//		}
//		public void setNombreOficial(String value) {
//			Utils.waitUntilExistsElementById("VA_TEXTINPUTBOXQSV_778587", 10);
//			TextBox.clearTextById("VA_TEXTINPUTBOXQSV_778587");
//			TextBox.setValueById("VA_TEXTINPUTBOXQSV_778587", value);
//		}
//				
//		public void setNombreOficial(String value, int timeout) {
//			Utils.waitUntilExistsElementById("VA_TEXTINPUTBOXQSV_778587", 10);
//			TextBox.clearTextById("VA_TEXTINPUTBOXQSV_778587");
//			TextBox.setValueById("VA_TEXTINPUTBOXQSV_778587", value, timeout);
//		}
//				
//	    public String getNombreOficial() {
//			Utils.waitUntilExistsElementById("VA_TEXTINPUTBOXQSV_778587", 10);
//			return TextBox.getValueInput("VA_TEXTINPUTBOXQSV_778587");
//		}
//		
//		public boolean NombreOficialIsEditable() {
//		boolean isNotEditable = TextBox.checkIfDisabled("VA_TEXTINPUTBOXQSV_778587") ||  TextBox.checkIfReadOnly("VA_TEXTINPUTBOXQSV_778587"); 				
//		return !isNotEditable;
//		}
//		public boolean NombreOficialIsValid() {
//		return TextBox.checkClassInvalid("VA_TEXTINPUTBOXQSV_778587");		
//		}
//		public void setModoConsulta(String value) {
//			Utils.waitUntilExistsElementById("VA_TEXTINPUTBOXPIV_940587", 10);
//			TextBox.setValueById("VA_TEXTINPUTBOXPIV_940587", value);
//		}
//				
//		public void setModoConsulta(String value, int timeout) {
//			Utils.waitUntilExistsElementById("VA_TEXTINPUTBOXPIV_940587", 10);
//			TextBox.setValueById("VA_TEXTINPUTBOXPIV_940587", value, timeout);
//		}
//				
//	    public String getModoConsulta() {
//			Utils.waitUntilExistsElementById("VA_TEXTINPUTBOXPIV_940587", 10);
//			return TextBox.getValueInput("VA_TEXTINPUTBOXPIV_940587");
//		}
//		
//		public boolean ModoConsultaIsEditable() {
//		boolean isNotEditable = TextBox.checkIfDisabled("VA_TEXTINPUTBOXPIV_940587") ||  TextBox.checkIfReadOnly("VA_TEXTINPUTBOXPIV_940587"); 				
//		return !isNotEditable;
//		}
//		public boolean ModoConsultaIsValid() {
//		return TextBox.checkClassInvalid("VA_TEXTINPUTBOXPIV_940587");		
//		}
	}
	public static class ListaPNatural {
	
//		public void setCliente(String value) {
//			Utils.waitUntilExistsElementById("VA_TEXTINPUTBOXADQ_909587", 10);
//			TextBox.setValueById("VA_TEXTINPUTBOXADQ_909587", value);
//		}
//				
//		public void setCliente(String value, int timeout) {
//			Utils.waitUntilExistsElementById("VA_TEXTINPUTBOXADQ_909587", 10);
//			TextBox.setValueById("VA_TEXTINPUTBOXADQ_909587", value, timeout);
//		}
//				
//	    public String getCliente() {
//			Utils.waitUntilExistsElementById("VA_TEXTINPUTBOXADQ_909587", 10);
//			return TextBox.getValueInput("VA_TEXTINPUTBOXADQ_909587");
//		}
//		
//		public boolean ClienteIsEditable() {
//		boolean isNotEditable = TextBox.checkIfDisabled("VA_TEXTINPUTBOXADQ_909587") ||  TextBox.checkIfReadOnly("VA_TEXTINPUTBOXADQ_909587"); 				
//		return !isNotEditable;
//		}
//		public boolean ClienteIsValid() {
//		return TextBox.checkClassInvalid("VA_TEXTINPUTBOXADQ_909587");		
//		}
//		public void setDocId(String value) {
//			Utils.waitUntilExistsElementById("VA_TEXTINPUTBOXWPG_883587", 10);
//			TextBox.clearTextById("VA_TEXTINPUTBOXWPG_883587");
//			TextBox.setValueById("VA_TEXTINPUTBOXWPG_883587", value);
//		}
//				
//		public void setDocId(String value, int timeout) {
//			Utils.waitUntilExistsElementById("VA_TEXTINPUTBOXWPG_883587", 10);
//			TextBox.clearTextById("VA_TEXTINPUTBOXWPG_883587");
//			TextBox.setValueById("VA_TEXTINPUTBOXWPG_883587", value, timeout);
//		}
//				
//	    public String getDocId() {
//			Utils.waitUntilExistsElementById("VA_TEXTINPUTBOXWPG_883587", 10);
//			return TextBox.getValueInput("VA_TEXTINPUTBOXWPG_883587");
//		}
//		
//		public boolean DocIdIsEditable() {
//		boolean isNotEditable = TextBox.checkIfDisabled("VA_TEXTINPUTBOXWPG_883587") ||  TextBox.checkIfReadOnly("VA_TEXTINPUTBOXWPG_883587"); 				
//		return !isNotEditable;
//		}
//		public boolean DocIdIsValid() {
//		return TextBox.checkClassInvalid("VA_TEXTINPUTBOXWPG_883587");		
//		}
//		public void setPrimerApellido(String value) {
//			Utils.waitUntilExistsElementById("VA_TEXTINPUTBOXJAP_659587", 10);
//			TextBox.clearTextById("VA_TEXTINPUTBOXJAP_659587");
//			TextBox.setValueById("VA_TEXTINPUTBOXJAP_659587", value);
//		}
//				
//		public void setPrimerApellido(String value, int timeout) {
//			Utils.waitUntilExistsElementById("VA_TEXTINPUTBOXJAP_659587", 10);
//			TextBox.clearTextById("VA_TEXTINPUTBOXJAP_659587");
//			TextBox.setValueById("VA_TEXTINPUTBOXJAP_659587", value, timeout);
//		}
//				
//	    public String getPrimerApellido() {
//			Utils.waitUntilExistsElementById("VA_TEXTINPUTBOXJAP_659587", 10);
//			return TextBox.getValueInput("VA_TEXTINPUTBOXJAP_659587");
//		}
//		
//		public boolean PrimerApellidoIsEditable() {
//		boolean isNotEditable = TextBox.checkIfDisabled("VA_TEXTINPUTBOXJAP_659587") ||  TextBox.checkIfReadOnly("VA_TEXTINPUTBOXJAP_659587"); 				
//		return !isNotEditable;
//		}
//		public boolean PrimerApellidoIsValid() {
//		return TextBox.checkClassInvalid("VA_TEXTINPUTBOXJAP_659587");		
//		}
//		public void setSegundoApellido(String value) {
//			Utils.waitUntilExistsElementById("VA_TEXTINPUTBOXTIE_397587", 10);
//			TextBox.clearTextById("VA_TEXTINPUTBOXTIE_397587");
//			TextBox.setValueById("VA_TEXTINPUTBOXTIE_397587", value);
//		}
//				
//		public void setSegundoApellido(String value, int timeout) {
//			Utils.waitUntilExistsElementById("VA_TEXTINPUTBOXTIE_397587", 10);
//			TextBox.clearTextById("VA_TEXTINPUTBOXTIE_397587");
//			TextBox.setValueById("VA_TEXTINPUTBOXTIE_397587", value, timeout);
//		}
//				
//	    public String getSegundoApellido() {
//			Utils.waitUntilExistsElementById("VA_TEXTINPUTBOXTIE_397587", 10);
//			return TextBox.getValueInput("VA_TEXTINPUTBOXTIE_397587");
//		}
//		
//		public boolean SegundoApellidoIsEditable() {
//		boolean isNotEditable = TextBox.checkIfDisabled("VA_TEXTINPUTBOXTIE_397587") ||  TextBox.checkIfReadOnly("VA_TEXTINPUTBOXTIE_397587"); 				
//		return !isNotEditable;
//		}
//		public boolean SegundoApellidoIsValid() {
//		return TextBox.checkClassInvalid("VA_TEXTINPUTBOXTIE_397587");		
//		}
//		public void setNombre(String value) {
//			Utils.waitUntilExistsElementById("VA_TEXTINPUTBOXNFQ_152587", 10);
//			TextBox.clearTextById("VA_TEXTINPUTBOXNFQ_152587");
//			TextBox.setValueById("VA_TEXTINPUTBOXNFQ_152587", value);
//		}
//				
//		public void setNombre(String value, int timeout) {
//			Utils.waitUntilExistsElementById("VA_TEXTINPUTBOXNFQ_152587", 10);
//			TextBox.clearTextById("VA_TEXTINPUTBOXNFQ_152587");
//			TextBox.setValueById("VA_TEXTINPUTBOXNFQ_152587", value, timeout);
//		}
//				
//	    public String getNombre() {
//			Utils.waitUntilExistsElementById("VA_TEXTINPUTBOXNFQ_152587", 10);
//			return TextBox.getValueInput("VA_TEXTINPUTBOXNFQ_152587");
//		}
//		
//		public boolean NombreIsEditable() {
//		boolean isNotEditable = TextBox.checkIfDisabled("VA_TEXTINPUTBOXNFQ_152587") ||  TextBox.checkIfReadOnly("VA_TEXTINPUTBOXNFQ_152587"); 				
//		return !isNotEditable;
//		}
//		public boolean NombreIsValid() {
//		return TextBox.checkClassInvalid("VA_TEXTINPUTBOXNFQ_152587");		
//		}
//		public void setTipoCliente(String value) {
//			Utils.waitUntilExistsElementById("VA_TEXTINPUTBOXMWW_245587", 10);
//			TextBox.clearTextById("VA_TEXTINPUTBOXMWW_245587");
//			TextBox.setValueById("VA_TEXTINPUTBOXMWW_245587", value);
//		}
//				
//		public void setTipoCliente(String value, int timeout) {
//			Utils.waitUntilExistsElementById("VA_TEXTINPUTBOXMWW_245587", 10);
//			TextBox.clearTextById("VA_TEXTINPUTBOXMWW_245587");
//			TextBox.setValueById("VA_TEXTINPUTBOXMWW_245587", value, timeout);
//		}
//				
//	    public String getTipoCliente() {
//			Utils.waitUntilExistsElementById("VA_TEXTINPUTBOXMWW_245587", 10);
//			return TextBox.getValueInput("VA_TEXTINPUTBOXMWW_245587");
//		}
//		
//		public boolean TipoClienteIsEditable() {
//		boolean isNotEditable = TextBox.checkIfDisabled("VA_TEXTINPUTBOXMWW_245587") ||  TextBox.checkIfReadOnly("VA_TEXTINPUTBOXMWW_245587"); 				
//		return !isNotEditable;
//		}
//		public boolean TipoClienteIsValid() {
//		return TextBox.checkClassInvalid("VA_TEXTINPUTBOXMWW_245587");		
//		}
//		public void setModoConsulta(String value) {
//			Utils.waitUntilExistsElementById("VA_TEXTINPUTBOXGCE_153587", 10);
//			TextBox.setValueById("VA_TEXTINPUTBOXGCE_153587", value);
//		}
//				
//		public void setModoConsulta(String value, int timeout) {
//			Utils.waitUntilExistsElementById("VA_TEXTINPUTBOXGCE_153587", 10);
//			TextBox.setValueById("VA_TEXTINPUTBOXGCE_153587", value, timeout);
//		}
//				
//	    public String getModoConsulta() {
//			Utils.waitUntilExistsElementById("VA_TEXTINPUTBOXGCE_153587", 10);
//			return TextBox.getValueInput("VA_TEXTINPUTBOXGCE_153587");
//		}
//		
//		public boolean ModoConsultaIsEditable() {
//		boolean isNotEditable = TextBox.checkIfDisabled("VA_TEXTINPUTBOXGCE_153587") ||  TextBox.checkIfReadOnly("VA_TEXTINPUTBOXGCE_153587"); 				
//		return !isNotEditable;
//		}
//		public boolean ModoConsultaIsValid() {
//		return TextBox.checkClassInvalid("VA_TEXTINPUTBOXGCE_153587");		
//		}
	}
	public static class FiltroBusquedaCliente {
		public static Target INPUT_IDENTIFICACION = Target.the("Campo de regitro Numero de identificación").inIFrame(PROFILE_BANK_ACCOUNT_BALANCES).located(By.id("VA_DOCIDIXRMVJUDPW_205587"));
		public static Target BOTON_BUSCAR = Target.the("Botón Buscar Cliente").inIFrame(PROFILE_BANK_ACCOUNT_BALANCES).located(By.id("VA_VAIMAGEBUTTONNN_801587"));

	}
	
	public static class FiltroBusquedaClienteCTA {
		public static Target INPUT_ENTE = Target.the("Campo de regitro Numero de identificación").inIFrame(PROFILE_BANK_ACCOUNT_BALANCES).located(By.xpath("//input[@ng-model='$parent.txtId']"));
		public static Target BOTON_BUSCAR = Target.the("Botón Buscar Cliente").inIFrame(PROFILE_BANK_ACCOUNT_BALANCES).located(By.xpath("//button[@class='btn btn-primary btn-lg']"));

	}
	
	public static class FiltroComprobanteContable {
		public static Target INPUT_FECHA = Target.the("Campo de Fecha").inIFrame(PROFILE_BANK_ACCOUNT_BALANCES).located(By.id("VA_1972NOYIHZCXWGH_841628"));
	}
	

	public static class GridListaPJuridica {
//
//		public String getCellData(int indexRow, int column) {
//			return Grid.getTextByRowAndColumn("QV_6632_39941", indexRow, column);
//		}
//		public void selectRow(int indexRow) {
//			sleepTime(2000);
//			Grid.selectRowByIndex("QV_6632_39941", indexRow);
//			sleepTime(2000);
//		}
//				
//        public void scrollToRight() {
//			Grid.scrollToRight("QV_6632_39941");
//		}
//		
//		public void scrollToLeft() {
//			Grid.scrollToLeft("QV_6632_39941");
//		}
//		
//		public void resizeColumnByIndex(int columnIndex, int pixelSize) {
//			Grid.resizeColumnByIndex("QV_6632_39941", columnIndex, pixelSize);
//		}
//
//    	public void goToPage(int page) {
//			try {
//				Grid.goToPage("QV_6632_39941", page);
//			}
//			catch(NoSuchElementException noFound) {
//				logger.error("Pagina  " + page +" no encontrada");
//			}
//			catch(IndexOutOfBoundsException out) {
//				logger.error("Pagina  " + page +" no encontrada");
//			}
//		}
//		
//		public void goToNextPage() {
//			Grid.goNextPage("QV_6632_39941");
//		}
//		
//		public void goToPreviousPage() {
//			Grid.goPreviousPage("QV_6632_39941");
//		}
//		
//		public void goToMorePages() {
//			try {
//				Grid.morePages("QV_6632_39941");
//			}
//			catch(ElementClickInterceptedException ex) {
//				logger.error("Boton mostrar mas paginas no disponible");
//			}
//		}
//		
//		public void goToLessPages() {
//			try {
//				Grid.lessPages("QV_6632_39941");
//			}
//			catch(ElementClickInterceptedException ex) {
//				logger.error("Boton mostrar menos paginas no disponible");
//			}		
//			catch(NullPointerException ex) {
//				logger.error("Boton mostrar menos paginas no disponible");
//			}
//		}
//		
//		public void goToLastPage() {
//			Grid.goLastPage("QV_6632_39941");
//		}
//		
//		public void goToFirstPage() {
//			Grid.goFirstPage("QV_6632_39941");
//		}
//		
	
	}
	public static class GridListaPNatural {
		public static Target PRIMER_CLIENTE = Target.the("Primer Cliente").inIFrame(PROFILE_BANK_ACCOUNT_BALANCES).located(By.xpath("//span[contains(text(),'1366')]"));
		public static Target BOTON_ACCEPT_ROW = Target.the("Botón Check Intgresar Cliente").inIFrame(PROFILE_BANK_ACCOUNT_BALANCES).located(By.xpath("//tbody/tr[1]/td[5]/a[1]"));
	}
	
	public static class GridListaPNaturalCTA {
		public static Target PRIMER_CLIENTE = Target.the("Primer Cliente").inIFrame(PROFILE_BANK_ACCOUNT_BALANCES).located(By.xpath("//span[contains(text(),'BUMA831017HASCDG07')]"));
		public static Target BOTON_ACCEPT_ROW = Target.the("Botón Check Intgresar Cliente").inIFrame(PROFILE_BANK_ACCOUNT_BALANCES).located(By.xpath("//tbody/tr[1]/td[5]/a[1]"));
		public static Target BOTON_SIGUIENTE = Target.the("Botón Siguiente").inIFrame(PROFILE_BANK_ACCOUNT_BALANCES).located(By.xpath("//button[@class='btn btn-primary navbar-btn ng-scope' and @ng-click='select($event)']"));
	}
	
	
}

