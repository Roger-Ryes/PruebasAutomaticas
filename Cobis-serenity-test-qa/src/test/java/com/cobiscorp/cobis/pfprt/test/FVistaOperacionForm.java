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
//import org.apache.logging.log4j.Logger;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class FVistaOperacionForm extends Base{

	public static Target BOTON_ACEPTAR_MODAL = Target.the("Botón Aceptar Modal").inIFrame(IFRAME_MENU).located(By.id("CM_TPFPRTTS_9T_"));
	
public static Target BOTON_SIGUIENTE_OPERACION = Target.the("Botón Siguiente").inIFrame(IFRAME_MENU).located(By.id("CM_TPFPRTCK_KRJ"));

	
	public static class ResultadoSimulacion {
	
	}
	public static class DetalleIncreRed {
	
//		public void setMontoIncremento(String value) {
//			Utils.waitUntilExistsElementById("VA_7137FZKIFZALTHW_476483", 10);
//			TextBox.setValueById("VA_7137FZKIFZALTHW_476483", value);
//		}
//				
//		public void setMontoIncremento(String value, int timeout) {
//			Utils.waitUntilExistsElementById("VA_7137FZKIFZALTHW_476483", 10);
//			TextBox.setValueById("VA_7137FZKIFZALTHW_476483", value, timeout);
//		}
//				
//	    public String getMontoIncremento() {
//			Utils.waitUntilExistsElementById("VA_7137FZKIFZALTHW_476483", 10);
//			return TextBox.getValueInput("VA_7137FZKIFZALTHW_476483");
//		}
//		
//		public boolean MontoIncrementoIsEditable() {
//		boolean isNotEditable = TextBox.checkIfDisabled("VA_7137FZKIFZALTHW_476483") ||  TextBox.checkIfReadOnly("VA_7137FZKIFZALTHW_476483"); 				
//		return !isNotEditable;
//		}
//		public boolean MontoIncrementoIsValid() {
//		return TextBox.checkClassInvalid("VA_7137FZKIFZALTHW_476483");		
//		}
	}
	public static class DetalleOperacion {
		public static Target SELECT_PRODUCTO_CLIC = Target.the("Select Producto").inIFrame(IFRAME_MENU).located(By.xpath("//body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/span[1]/span[2]"));
		public static Target SELECT_PRODUCTO = Target.the("Select Producto").inIFrame(IFRAME_MENU).located(By.xpath("//li[contains(text(),'CERTIFICADO VIP')]"));
		
		
		public static Target SELECT_FROMA_PAGO_CLIC = Target.the("Select Forma de Pago").inIFrame(IFRAME_MENU).located(By.xpath("//body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]/span[1]/span[2]"));
		public static Target SELECT_FROMA_PAGO = Target.the("Select Forma de Pago").inIFrame(IFRAME_MENU).located(By.xpath("//li[contains(text(),'VENCIMIENTO')]"));
		
		public static Target SELECT_CAP_INTERES_CLIC = Target.the("Select Capitaliza Interes").inIFrame(IFRAME_MENU).located(By.xpath("//body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/span[1]/span[1]/span[2]"));
		public static Target SELECT_CAP_INTERES = Target.the("Select Capitaliza Interes").inIFrame(IFRAME_MENU).located(By.xpath("//ul[@id='VA_CAPITALIZAINSET_783483_listbox']"));

		public static Target SELECT_CATEGORIA_CLIC = Target.the("Select categoria").inIFrame(IFRAME_MENU).located(By.xpath("//body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/span[1]/span[1]/span[2]"));
		public static Target SELECT_CATEGORIA = Target.the("Select categoria").inIFrame(IFRAME_MENU).located(By.xpath("//li[contains(text(),'NOMINATIVO')]"));
		
		public static Target MONTOCLIC = Target.the("Input valor monto").inIFrame(IFRAME_MENU).located(By.xpath("//body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/span[1]/span[1]/input[1]"));
		public static Target MONTO = Target.the("Input valor monto").inIFrame(IFRAME_MENU).located(By.id("VA_4625AEXERXZYJSY_772483"));
		
		public static Target SELECT_MONEDA = Target.the("Select Moneda").inIFrame(IFRAME_MENU).located(By.xpath("//span[contains(text(),'1366')]"));
		
		public static Target PLAZO_CLIC = Target.the("Input valor Plazo").inIFrame(IFRAME_MENU).located(By.xpath("//body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[9]/div[1]/div[1]/div[1]/span[1]/span[1]"));
		public static Target PLAZO = Target.the("Input valor Plazo").inIFrame(IFRAME_MENU).located(By.id("VA_2745QLCWKQUCCTK_953483"));
		
		public static Target BOTON_SIMULAR = Target.the("Botón Simular").inIFrame(IFRAME_MENU).located(By.id("VA_VABUTTONGXXYYCM_171483"));

	
//		public void setCodigoProductoByCode(String value) {
//			Utils.waitUntilExistsElementById("VA_6382FCVFPQQZAQS_544483", 10);
//			DropDownList.setValueById("VA_6382FCVFPQQZAQS_544483", value, false);
//		}
//				
//		public void setCodigoProductoByText(String value) {
//			Utils.waitUntilExistsElementById("VA_6382FCVFPQQZAQS_544483", 10);
//			DropDownList.setTextById("VA_6382FCVFPQQZAQS_544483", value, false);
//		}
//				
//	    public String getCodigoProductoByCode() {
//			Utils.waitUntilExistsElementById("VA_6382FCVFPQQZAQS_544483", 10);
//			return TextBox.getValueInput("VA_6382FCVFPQQZAQS_544483");
//		}
//		
//	    public String getCodigoProductoByText() {
//			Utils.waitUntilExistsElementById("VA_6382FCVFPQQZAQS_544483", 10);
//			return DropDownList.getTextById("VA_6382FCVFPQQZAQS_544483");
//		}
//		
//		public boolean CodigoProductoIsEditable() {
//		boolean isNotEditable = DropDownList.checkIfDisabled("VA_6382FCVFPQQZAQS_544483") ||  DropDownList.checkIfReadOnly("VA_6382FCVFPQQZAQS_544483"); 				
//		return !isNotEditable;
//		}
//		public boolean CodigoProductoIsValid() {
//		return DropDownList.checkClassInvalid("VA_6382FCVFPQQZAQS_544483");		
//		}
//		public void setCodigoFormaPagoByCode(String value) {
//			Utils.waitUntilExistsElementById("VA_CODIGOAPAGOKDMY_947483", 10);
//			DropDownList.setValueById("VA_CODIGOAPAGOKDMY_947483", value, false);
//		}
//				
//		public void setCodigoFormaPagoByText(String value) {
//			Utils.waitUntilExistsElementById("VA_CODIGOAPAGOKDMY_947483", 10);
//			DropDownList.setTextById("VA_CODIGOAPAGOKDMY_947483", value, false);
//		}
//				
//	    public String getCodigoFormaPagoByCode() {
//			Utils.waitUntilExistsElementById("VA_CODIGOAPAGOKDMY_947483", 10);
//			return TextBox.getValueInput("VA_CODIGOAPAGOKDMY_947483");
//		}
//		
//	    public String getCodigoFormaPagoByText() {
//			Utils.waitUntilExistsElementById("VA_CODIGOAPAGOKDMY_947483", 10);
//			return DropDownList.getTextById("VA_CODIGOAPAGOKDMY_947483");
//		}
//		
//		public boolean CodigoFormaPagoIsEditable() {
//		boolean isNotEditable = DropDownList.checkIfDisabled("VA_CODIGOAPAGOKDMY_947483") ||  DropDownList.checkIfReadOnly("VA_CODIGOAPAGOKDMY_947483"); 				
//		return !isNotEditable;
//		}
//		public boolean CodigoFormaPagoIsValid() {
//		return DropDownList.checkClassInvalid("VA_CODIGOAPAGOKDMY_947483");		
//		}
//		public void setCodigoPeriodoPagoByCode(String value) {
//			Utils.waitUntilExistsElementById("VA_1990ZLIMNFDCHPC_590483", 10);
//			DropDownList.setValueById("VA_1990ZLIMNFDCHPC_590483", value, false);
//		}
//				
//		public void setCodigoPeriodoPagoByText(String value) {
//			Utils.waitUntilExistsElementById("VA_1990ZLIMNFDCHPC_590483", 10);
//			DropDownList.setTextById("VA_1990ZLIMNFDCHPC_590483", value, false);
//		}
//				
//	    public String getCodigoPeriodoPagoByCode() {
//			Utils.waitUntilExistsElementById("VA_1990ZLIMNFDCHPC_590483", 10);
//			return TextBox.getValueInput("VA_1990ZLIMNFDCHPC_590483");
//		}
//		
//	    public String getCodigoPeriodoPagoByText() {
//			Utils.waitUntilExistsElementById("VA_1990ZLIMNFDCHPC_590483", 10);
//			return DropDownList.getTextById("VA_1990ZLIMNFDCHPC_590483");
//		}
//		
//		public boolean CodigoPeriodoPagoIsEditable() {
//		boolean isNotEditable = DropDownList.checkIfDisabled("VA_1990ZLIMNFDCHPC_590483") ||  DropDownList.checkIfReadOnly("VA_1990ZLIMNFDCHPC_590483"); 				
//		return !isNotEditable;
//		}
//		public boolean CodigoPeriodoPagoIsValid() {
//		return DropDownList.checkClassInvalid("VA_1990ZLIMNFDCHPC_590483");		
//		}
//		public void setCapitalizaInteresByCode(String value) {
//			Utils.waitUntilExistsElementById("VA_CAPITALIZAINSET_783483", 10);
//			DropDownList.setValueById("VA_CAPITALIZAINSET_783483", value, false);
//		}
//				
//		public void setCapitalizaInteresByText(String value) {
//			Utils.waitUntilExistsElementById("VA_CAPITALIZAINSET_783483", 10);
//			DropDownList.setTextById("VA_CAPITALIZAINSET_783483", value, false);
//		}
//				
//	    public String getCapitalizaInteresByCode() {
//			Utils.waitUntilExistsElementById("VA_CAPITALIZAINSET_783483", 10);
//			return TextBox.getValueInput("VA_CAPITALIZAINSET_783483");
//		}
//		
//	    public String getCapitalizaInteresByText() {
//			Utils.waitUntilExistsElementById("VA_CAPITALIZAINSET_783483", 10);
//			return DropDownList.getTextById("VA_CAPITALIZAINSET_783483");
//		}
//		
//		public boolean CapitalizaInteresIsEditable() {
//		boolean isNotEditable = DropDownList.checkIfDisabled("VA_CAPITALIZAINSET_783483") ||  DropDownList.checkIfReadOnly("VA_CAPITALIZAINSET_783483"); 				
//		return !isNotEditable;
//		}
//		public boolean CapitalizaInteresIsValid() {
//		return DropDownList.checkClassInvalid("VA_CAPITALIZAINSET_783483");		
//		}
//		public void setCodigoCategoriaByCode(String value) {
//			Utils.waitUntilExistsElementById("VA_9037ZLZRWQMOXVW_704483", 10);
//			DropDownList.setValueById("VA_9037ZLZRWQMOXVW_704483", value, false);
//		}
//				
//		public void setCodigoCategoriaByText(String value) {
//			Utils.waitUntilExistsElementById("VA_9037ZLZRWQMOXVW_704483", 10);
//			DropDownList.setTextById("VA_9037ZLZRWQMOXVW_704483", value, false);
//		}
//				
//	    public String getCodigoCategoriaByCode() {
//			Utils.waitUntilExistsElementById("VA_9037ZLZRWQMOXVW_704483", 10);
//			return TextBox.getValueInput("VA_9037ZLZRWQMOXVW_704483");
//		}
//		
//	    public String getCodigoCategoriaByText() {
//			Utils.waitUntilExistsElementById("VA_9037ZLZRWQMOXVW_704483", 10);
//			return DropDownList.getTextById("VA_9037ZLZRWQMOXVW_704483");
//		}
//		
//		public boolean CodigoCategoriaIsEditable() {
//		boolean isNotEditable = DropDownList.checkIfDisabled("VA_9037ZLZRWQMOXVW_704483") ||  DropDownList.checkIfReadOnly("VA_9037ZLZRWQMOXVW_704483"); 				
//		return !isNotEditable;
//		}
//		public boolean CodigoCategoriaIsValid() {
//		return DropDownList.checkClassInvalid("VA_9037ZLZRWQMOXVW_704483");		
//		}
//		public void setMonto(String value) {
//			Utils.waitUntilExistsElementById("VA_4625AEXERXZYJSY_772483", 10);
//			TextBox.setValueById("VA_4625AEXERXZYJSY_772483", value);
//		}
//				
//		public void setMonto(String value, int timeout) {
//			Utils.waitUntilExistsElementById("VA_4625AEXERXZYJSY_772483", 10);
//			TextBox.setValueById("VA_4625AEXERXZYJSY_772483", value, timeout);
//		}
//				
//	    public String getMonto() {
//			Utils.waitUntilExistsElementById("VA_4625AEXERXZYJSY_772483", 10);
//			return TextBox.getValueInput("VA_4625AEXERXZYJSY_772483");
//		}
//		
//		public boolean MontoIsEditable() {
//		boolean isNotEditable = TextBox.checkIfDisabled("VA_4625AEXERXZYJSY_772483") ||  TextBox.checkIfReadOnly("VA_4625AEXERXZYJSY_772483"); 				
//		return !isNotEditable;
//		}
//		public boolean MontoIsValid() {
//		return TextBox.checkClassInvalid("VA_4625AEXERXZYJSY_772483");		
//		}
//		public void setCodigoMonedaByCode(String value) {
//			Utils.waitUntilExistsElementById("VA_8097QTIHKGCBQZH_796483", 10);
//			DropDownList.setValueById("VA_8097QTIHKGCBQZH_796483", value, false);
//		}
//				
//		public void setCodigoMonedaByText(String value) {
//			Utils.waitUntilExistsElementById("VA_8097QTIHKGCBQZH_796483", 10);
//			DropDownList.setTextById("VA_8097QTIHKGCBQZH_796483", value, false);
//		}
//				
//	    public String getCodigoMonedaByCode() {
//			Utils.waitUntilExistsElementById("VA_8097QTIHKGCBQZH_796483", 10);
//			return TextBox.getValueInput("VA_8097QTIHKGCBQZH_796483");
//		}
//		
//	    public String getCodigoMonedaByText() {
//			Utils.waitUntilExistsElementById("VA_8097QTIHKGCBQZH_796483", 10);
//			return DropDownList.getTextById("VA_8097QTIHKGCBQZH_796483");
//		}
//		
//		public boolean CodigoMonedaIsEditable() {
//		boolean isNotEditable = DropDownList.checkIfDisabled("VA_8097QTIHKGCBQZH_796483") ||  DropDownList.checkIfReadOnly("VA_8097QTIHKGCBQZH_796483"); 				
//		return !isNotEditable;
//		}
//		public boolean CodigoMonedaIsValid() {
//		return DropDownList.checkClassInvalid("VA_8097QTIHKGCBQZH_796483");		
//		}
//		public void setTasaByClick() {
//			Utils.waitUntilExistsElementById("VA_4868ZBVNBHCDKRQ_312483", 10);
//			TextBox.clickInputGroup("VA_4868ZBVNBHCDKRQ_312483");
//		}
//		public void setTasa(String value) {
//			Utils.waitUntilExistsElementById("VA_4868ZBVNBHCDKRQ_312483", 10);
//			TextBox.setValueById("VA_4868ZBVNBHCDKRQ_312483", value);
//		}
//				
//	    public String getTasa() {
//			Utils.waitUntilExistsElementById("VA_4868ZBVNBHCDKRQ_312483", 10);
//			return TextBox.getValueInput("VA_4868ZBVNBHCDKRQ_312483");
//		}
//		
//		public boolean TasaIsEditable() {
//		boolean isNotEditable = TextInputButton.checkIfDisabled("VA_4868ZBVNBHCDKRQ_312483") ||  TextInputButton.checkIfReadOnly("VA_4868ZBVNBHCDKRQ_312483"); 				
//		return !isNotEditable;
//		}
//		public boolean TasaIsValid() {
//		return TextInputButton.checkClassInvalid("VA_4868ZBVNBHCDKRQ_312483");		
//		}
//		public void setPlazo(String value) {
//			Utils.waitUntilExistsElementById("VA_2745QLCWKQUCCTK_953483", 10);
//			TextBox.setValueById("VA_2745QLCWKQUCCTK_953483", value);
//		}
//				
//		public void setPlazo(String value, int timeout) {
//			Utils.waitUntilExistsElementById("VA_2745QLCWKQUCCTK_953483", 10);
//			TextBox.setValueById("VA_2745QLCWKQUCCTK_953483", value, timeout);
//		}
//				
//	    public String getPlazo() {
//			Utils.waitUntilExistsElementById("VA_2745QLCWKQUCCTK_953483", 10);
//			return TextBox.getValueInput("VA_2745QLCWKQUCCTK_953483");
//		}
//		
//		public boolean PlazoIsEditable() {
//		boolean isNotEditable = TextBox.checkIfDisabled("VA_2745QLCWKQUCCTK_953483") ||  TextBox.checkIfReadOnly("VA_2745QLCWKQUCCTK_953483"); 				
//		return !isNotEditable;
//		}
//		public boolean PlazoIsValid() {
//		return TextBox.checkClassInvalid("VA_2745QLCWKQUCCTK_953483");		
//		}
//		public void setFechaActivacionByText(String day, String month, String year) {
//			Utils.waitUntilExistsElementById("VA_3551CTGFAKJAABB_535483", 10);
//			TextBox.setDateById("VA_3551CTGFAKJAABB_535483",day,month,year);		
//		}		
//		public void setFechaActivacionByClick(String day, String month, String year) {
//			Utils.waitUntilExistsElementById("VA_3551CTGFAKJAABB_535483", 10);
//			if (month.length() == 2 && month.charAt(0) == '0')
//				month = month.substring(1);
//			if (day.length() == 2 && day.charAt(0) == '0')
//				day = day.substring(1);
//			int numberMonth = Integer.parseInt(month)-1;
//			month = Integer.toString(numberMonth);
//			DatePicker.searchDate("VA_3551CTGFAKJAABB_535483",day,month,year);
//		}		
//	    public String getFechaActivacion() {
//			Utils.waitUntilExistsElementById("VA_3551CTGFAKJAABB_535483", 10);
//			return TextBox.getValueInput("VA_3551CTGFAKJAABB_535483");
//		}
//		
//		public boolean FechaActivacionIsEditable() {
//		boolean isNotEditable = DateTimeField.checkIfDisabled("VA_3551CTGFAKJAABB_535483") ||  DateTimeField.checkIfReadOnly("VA_3551CTGFAKJAABB_535483"); 				
//		return !isNotEditable;
//		}
//		public boolean FechaActivacionIsValid() {
//		return DateTimeField.checkClassInvalid("VA_3551CTGFAKJAABB_535483");		
//		}
//		public void setFechaVencimientoByText(String day, String month, String year) {
//			Utils.waitUntilExistsElementById("VA_1302RXTSVRAYPLW_535483", 10);
//			TextBox.setDateById("VA_1302RXTSVRAYPLW_535483",day,month,year);		
//		}		
//		public void setFechaVencimientoByClick(String day, String month, String year) {
//			Utils.waitUntilExistsElementById("VA_1302RXTSVRAYPLW_535483", 10);
//			if (month.length() == 2 && month.charAt(0) == '0')
//				month = month.substring(1);
//			if (day.length() == 2 && day.charAt(0) == '0')
//				day = day.substring(1);
//			int numberMonth = Integer.parseInt(month)-1;
//			month = Integer.toString(numberMonth);
//			DatePicker.searchDate("VA_1302RXTSVRAYPLW_535483",day,month,year);
//		}		
//	    public String getFechaVencimiento() {
//			Utils.waitUntilExistsElementById("VA_1302RXTSVRAYPLW_535483", 10);
//			return TextBox.getValueInput("VA_1302RXTSVRAYPLW_535483");
//		}
//		
//		public boolean FechaVencimientoIsEditable() {
//		boolean isNotEditable = DateTimeField.checkIfDisabled("VA_1302RXTSVRAYPLW_535483") ||  DateTimeField.checkIfReadOnly("VA_1302RXTSVRAYPLW_535483"); 				
//		return !isNotEditable;
//		}
//		public boolean FechaVencimientoIsValid() {
//		return DateTimeField.checkClassInvalid("VA_1302RXTSVRAYPLW_535483");		
//		}
	
	}

}

