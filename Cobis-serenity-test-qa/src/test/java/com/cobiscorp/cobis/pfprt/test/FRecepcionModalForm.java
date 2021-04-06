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

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class FRecepcionModalForm extends Base{
	
	public static Target BOTON_ACEPTAR_MODAL_RECEPCION = Target.the("Botón Aceptar Modal recepción").inIFrame(IFRAME_MENU).located(By.id("CM_TPFPRTUL_O1P"));
	
	
	private ListaDetalleRecepcion listaDetalleRecepcion;

	public FRecepcionModalForm() {		
		this.listaDetalleRecepcion = new ListaDetalleRecepcion();
	}
	
	public ListaDetalleRecepcion getListaDetalleRecepcion() {
		return this.listaDetalleRecepcion;
	}
	
	public void clickButtonAceptar_O1P() {
//		Button.clickButtonById("CM_TPFPRTUL_O1P");
	}
		
	public void clickButtonCancelar_YD2() {
//		Button.clickButtonById("CM_TPFPRTUL_YD2");
	}
		
	public static class ListaDetalleRecepcion {
		public static Target SELECT_FORMA_RECEPCION_CLIC = Target.the("Select Forma de Recepción").inIFrame(IFRAME_MENU).located(By.xpath("//body[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/span[1]/span[1]"));
		public static Target SELECT_FORMA_RECEPCION = Target.the("Select Forma de Recepción").inIFrame(IFRAME_MENU).located(By.xpath("//li[contains(text(),'CONTABLE')]"));
		public static Target MONTOCLIC_RECEPCION = Target.the("Input valor monto").inIFrame(IFRAME_MENU).located(By.xpath("//body[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/span[1]/span[1]/input[1]"));
		public static Target MONTO_RECEPCION = Target.the("Input valor monto").inIFrame(IFRAME_MENU).located(By.id("VA_MONTOIZNJERYLGS_823386"));

	
//		public void setCodigoFormaPagoByCode(String value) {
//			Utils.waitUntilExistsElementById("VA_CODIGOAPAGOKIMV_550386", 10);
//			ComboBox.setValue("VA_CODIGOAPAGOKIMV_550386", value);
//		}
//				
//		public void setCodigoFormaPagoByText(String value) {
//			Utils.waitUntilExistsElementById("VA_CODIGOAPAGOKIMV_550386", 10);
//			ComboBox.setValueByIdExtKendoText("VA_CODIGOAPAGOKIMV_550386", value);
//		}
//				
//	    public String getCodigoFormaPagoByCode() {
//			Utils.waitUntilExistsElementById("VA_CODIGOAPAGOKIMV_550386", 10);
//			return TextBox.getValueInput("VA_CODIGOAPAGOKIMV_550386");
//		}
//		
//	    public String getCodigoFormaPagoByText() {
//			Utils.waitUntilExistsElementById("VA_CODIGOAPAGOKIMV_550386", 10);
//			return ComboBox.getTextByIdExtKendo("VA_CODIGOAPAGOKIMV_550386");
//		}
//		
//		public boolean CodigoFormaPagoIsEditable() {
//		boolean isNotEditable = ComboBox.checkIfDisabled("VA_CODIGOAPAGOKIMV_550386") ||  ComboBox.checkIfReadOnly("VA_CODIGOAPAGOKIMV_550386"); 				
//		return !isNotEditable;
//		}
//		public boolean CodigoFormaPagoIsValid() {
//		return ComboBox.checkClassInvalid("VA_CODIGOAPAGOKIMV_550386");		
//		}
//		public void setCodigoMonedaByCode(String value) {
//			Utils.waitUntilExistsElementById("VA_CODIGOMONEDAITE_767386", 10);
//			ComboBox.setValue("VA_CODIGOMONEDAITE_767386", value);
//		}
//				
//		public void setCodigoMonedaByText(String value) {
//			Utils.waitUntilExistsElementById("VA_CODIGOMONEDAITE_767386", 10);
//			ComboBox.setValueByIdExtKendoText("VA_CODIGOMONEDAITE_767386", value);
//		}
//				
//	    public String getCodigoMonedaByCode() {
//			Utils.waitUntilExistsElementById("VA_CODIGOMONEDAITE_767386", 10);
//			return TextBox.getValueInput("VA_CODIGOMONEDAITE_767386");
//		}
//		
//	    public String getCodigoMonedaByText() {
//			Utils.waitUntilExistsElementById("VA_CODIGOMONEDAITE_767386", 10);
//			return ComboBox.getTextByIdExtKendo("VA_CODIGOMONEDAITE_767386");
//		}
//		
//		public boolean CodigoMonedaIsEditable() {
//		boolean isNotEditable = ComboBox.checkIfDisabled("VA_CODIGOMONEDAITE_767386") ||  ComboBox.checkIfReadOnly("VA_CODIGOMONEDAITE_767386"); 				
//		return !isNotEditable;
//		}
//		public boolean CodigoMonedaIsValid() {
//		return ComboBox.checkClassInvalid("VA_CODIGOMONEDAITE_767386");		
//		}
//		public void setMonto(String value) {
//			Utils.waitUntilExistsElementById("VA_MONTOIZNJERYLGS_823386", 10);
//			TextBox.setValueById("VA_MONTOIZNJERYLGS_823386", value);
//		}
//				
//		public void setMonto(String value, int timeout) {
//			Utils.waitUntilExistsElementById("VA_MONTOIZNJERYLGS_823386", 10);
//			TextBox.setValueById("VA_MONTOIZNJERYLGS_823386", value, timeout);
//		}
//				
//	    public String getMonto() {
//			Utils.waitUntilExistsElementById("VA_MONTOIZNJERYLGS_823386", 10);
//			return TextBox.getValueInput("VA_MONTOIZNJERYLGS_823386");
//		}
//		
//		public boolean MontoIsEditable() {
//		boolean isNotEditable = TextBox.checkIfDisabled("VA_MONTOIZNJERYLGS_823386") ||  TextBox.checkIfReadOnly("VA_MONTOIZNJERYLGS_823386"); 				
//		return !isNotEditable;
//		}
//		public boolean MontoIsValid() {
//		return TextBox.checkClassInvalid("VA_MONTOIZNJERYLGS_823386");		
//		}
//		public void setClienteByCode(String value) {
//			Utils.waitUntilExistsElementById("VA_CLIENTESCJFYNZM_349386", 10);
//			ComboBox.setValue("VA_CLIENTESCJFYNZM_349386", value);
//		}
//				
//		public void setClienteByText(String value) {
//			Utils.waitUntilExistsElementById("VA_CLIENTESCJFYNZM_349386", 10);
//			ComboBox.setValueByIdExtKendoText("VA_CLIENTESCJFYNZM_349386", value);
//		}
//				
//	    public String getClienteByCode() {
//			Utils.waitUntilExistsElementById("VA_CLIENTESCJFYNZM_349386", 10);
//			return TextBox.getValueInput("VA_CLIENTESCJFYNZM_349386");
//		}
//		
//	    public String getClienteByText() {
//			Utils.waitUntilExistsElementById("VA_CLIENTESCJFYNZM_349386", 10);
//			return ComboBox.getTextByIdExtKendo("VA_CLIENTESCJFYNZM_349386");
//		}
//		
//		public boolean ClienteIsEditable() {
//		boolean isNotEditable = ComboBox.checkIfDisabled("VA_CLIENTESCJFYNZM_349386") ||  ComboBox.checkIfReadOnly("VA_CLIENTESCJFYNZM_349386"); 				
//		return !isNotEditable;
//		}
//		public boolean ClienteIsValid() {
//		return ComboBox.checkClassInvalid("VA_CLIENTESCJFYNZM_349386");		
//		}
//		public void setCodigoBancoByCode(String value) {
//			Utils.waitUntilExistsElementById("VA_CODIGOBANCODKND_854386", 10);
//			DropDownList.setValueById("VA_CODIGOBANCODKND_854386", value, false);
//		}
//				
//		public void setCodigoBancoByText(String value) {
//			Utils.waitUntilExistsElementById("VA_CODIGOBANCODKND_854386", 10);
//			DropDownList.setTextById("VA_CODIGOBANCODKND_854386", value, false);
//		}
//				
//	    public String getCodigoBancoByCode() {
//			Utils.waitUntilExistsElementById("VA_CODIGOBANCODKND_854386", 10);
//			return TextBox.getValueInput("VA_CODIGOBANCODKND_854386");
//		}
//		
//	    public String getCodigoBancoByText() {
//			Utils.waitUntilExistsElementById("VA_CODIGOBANCODKND_854386", 10);
//			return DropDownList.getTextById("VA_CODIGOBANCODKND_854386");
//		}
//		
//		public boolean CodigoBancoIsEditable() {
//		boolean isNotEditable = DropDownList.checkIfDisabled("VA_CODIGOBANCODKND_854386") ||  DropDownList.checkIfReadOnly("VA_CODIGOBANCODKND_854386"); 				
//		return !isNotEditable;
//		}
//		public boolean CodigoBancoIsValid() {
//		return DropDownList.checkClassInvalid("VA_CODIGOBANCODKND_854386");		
//		}
//		public void setCuentaReferenciaByClick() {
//			Utils.waitUntilExistsElementById("VA_CUENTAREFEREAAA_719386", 10);
//			TextBox.clickInputGroup("VA_CUENTAREFEREAAA_719386");
//		}
//		public void setCuentaReferencia(String value) {
//			Utils.waitUntilExistsElementById("VA_CUENTAREFEREAAA_719386", 10);
//			TextBox.clearTextById("VA_CUENTAREFEREAAA_719386");
//			TextBox.setValueById("VA_CUENTAREFEREAAA_719386", value);
//		}
//				
//	    public String getCuentaReferencia() {
//			Utils.waitUntilExistsElementById("VA_CUENTAREFEREAAA_719386", 10);
//			return TextBox.getValueInput("VA_CUENTAREFEREAAA_719386");
//		}
//		
//		public boolean CuentaReferenciaIsEditable() {
//		boolean isNotEditable = TextInputButton.checkIfDisabled("VA_CUENTAREFEREAAA_719386") ||  TextInputButton.checkIfReadOnly("VA_CUENTAREFEREAAA_719386"); 				
//		return !isNotEditable;
//		}
//		public boolean CuentaReferenciaIsValid() {
//		return TextInputButton.checkClassInvalid("VA_CUENTAREFEREAAA_719386");		
//		}
//		public void setTipoPagoByCode(String value) {
//			Utils.waitUntilExistsElementById("VA_TIPOPAGOUUEFUJJ_431386", 10);
//			ComboBox.setValue("VA_TIPOPAGOUUEFUJJ_431386", value);
//		}
//				
//		public void setTipoPagoByText(String value) {
//			Utils.waitUntilExistsElementById("VA_TIPOPAGOUUEFUJJ_431386", 10);
//			ComboBox.setValueByIdExtKendoText("VA_TIPOPAGOUUEFUJJ_431386", value);
//		}
//				
//	    public String getTipoPagoByCode() {
//			Utils.waitUntilExistsElementById("VA_TIPOPAGOUUEFUJJ_431386", 10);
//			return TextBox.getValueInput("VA_TIPOPAGOUUEFUJJ_431386");
//		}
//		
//	    public String getTipoPagoByText() {
//			Utils.waitUntilExistsElementById("VA_TIPOPAGOUUEFUJJ_431386", 10);
//			return ComboBox.getTextByIdExtKendo("VA_TIPOPAGOUUEFUJJ_431386");
//		}
//		
//		public boolean TipoPagoIsEditable() {
//		boolean isNotEditable = ComboBox.checkIfDisabled("VA_TIPOPAGOUUEFUJJ_431386") ||  ComboBox.checkIfReadOnly("VA_TIPOPAGOUUEFUJJ_431386"); 				
//		return !isNotEditable;
//		}
//		public boolean TipoPagoIsValid() {
//		return ComboBox.checkClassInvalid("VA_TIPOPAGOUUEFUJJ_431386");		
//		}
	}

}

