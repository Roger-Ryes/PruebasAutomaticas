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

public class FSimulacionForm{
//	 extends DesignerForm
//	public static Logger logger;
	
	private ResultadoSimulacion resultadoSimulacion;

	public FSimulacionForm() {		
		this.resultadoSimulacion = new ResultadoSimulacion();
	}
	
	public ResultadoSimulacion getResultadoSimulacion() {
		return this.resultadoSimulacion;
	}
	
//	public void clickButtonAceptar_9T_() {
//		Button.clickButtonById("CM_TPFPRTTS_9T_");
//	}
//		
//	public void clickButtonImprimir_74N() {
//		Button.clickButtonById("CM_TPFPRTTS_74N");
//	}
//		
//	public void clickButtonCancelar_92P() {
//		Button.clickButtonById("CM_TPFPRTTS_92P");
//	}
		
	public static class ResultadoSimulacion {
//	
//		public void setTasaEfectiva(String value) {
//			Utils.waitUntilExistsElementById("VA_TASAEFECTIVAYZH_602333", 10);
//			TextBox.setValueById("VA_TASAEFECTIVAYZH_602333", value);
//		}
//				
//		public void setTasaEfectiva(String value, int timeout) {
//			Utils.waitUntilExistsElementById("VA_TASAEFECTIVAYZH_602333", 10);
//			TextBox.setValueById("VA_TASAEFECTIVAYZH_602333", value, timeout);
//		}
//				
//	    public String getTasaEfectiva() {
//			Utils.waitUntilExistsElementById("VA_TASAEFECTIVAYZH_602333", 10);
//			return TextBox.getTextValueById("VA_TASAEFECTIVAYZH_602333");
//		}
//		
//		public boolean TasaEfectivaIsEditable() {
//		boolean isNotEditable = TextLabel.checkIfDisabled("VA_TASAEFECTIVAYZH_602333") ||  TextLabel.checkIfReadOnly("VA_TASAEFECTIVAYZH_602333"); 				
//		return !isNotEditable;
//		}
//		public boolean TasaEfectivaIsValid() {
//		return TextLabel.checkClassInvalid("VA_TASAEFECTIVAYZH_602333");		
//		}
//		public void setTotalInteresEstimado(String value) {
//			Utils.waitUntilExistsElementById("VA_7028LVULSIEQAMM_117333", 10);
//			TextBox.setValueById("VA_7028LVULSIEQAMM_117333", value);
//		}
//				
//		public void setTotalInteresEstimado(String value, int timeout) {
//			Utils.waitUntilExistsElementById("VA_7028LVULSIEQAMM_117333", 10);
//			TextBox.setValueById("VA_7028LVULSIEQAMM_117333", value, timeout);
//		}
//				
//	    public String getTotalInteresEstimado() {
//			Utils.waitUntilExistsElementById("VA_7028LVULSIEQAMM_117333", 10);
//			return TextBox.getTextValueById("VA_7028LVULSIEQAMM_117333");
//		}
//		
//		public boolean TotalInteresEstimadoIsEditable() {
//		boolean isNotEditable = TextLabel.checkIfDisabled("VA_7028LVULSIEQAMM_117333") ||  TextLabel.checkIfReadOnly("VA_7028LVULSIEQAMM_117333"); 				
//		return !isNotEditable;
//		}
//		public boolean TotalInteresEstimadoIsValid() {
//		return TextLabel.checkClassInvalid("VA_7028LVULSIEQAMM_117333");		
//		}
//		public void setMontoImpuesto(String value) {
//			Utils.waitUntilExistsElementById("VA_4958KJUNIKANRYO_666333", 10);
//			TextBox.setValueById("VA_4958KJUNIKANRYO_666333", value);
//		}
//				
//		public void setMontoImpuesto(String value, int timeout) {
//			Utils.waitUntilExistsElementById("VA_4958KJUNIKANRYO_666333", 10);
//			TextBox.setValueById("VA_4958KJUNIKANRYO_666333", value, timeout);
//		}
//				
//	    public String getMontoImpuesto() {
//			Utils.waitUntilExistsElementById("VA_4958KJUNIKANRYO_666333", 10);
//			return TextBox.getTextValueById("VA_4958KJUNIKANRYO_666333");
//		}
//		
//		public boolean MontoImpuestoIsEditable() {
//		boolean isNotEditable = TextLabel.checkIfDisabled("VA_4958KJUNIKANRYO_666333") ||  TextLabel.checkIfReadOnly("VA_4958KJUNIKANRYO_666333"); 				
//		return !isNotEditable;
//		}
//		public boolean MontoImpuestoIsValid() {
//		return TextLabel.checkClassInvalid("VA_4958KJUNIKANRYO_666333");		
//		}
//		public void setInteresEstimado(String value) {
//			Utils.waitUntilExistsElementById("VA_1LWNAGMXJNKVPOM_236333", 10);
//			TextBox.setValueById("VA_1LWNAGMXJNKVPOM_236333", value);
//		}
//				
//		public void setInteresEstimado(String value, int timeout) {
//			Utils.waitUntilExistsElementById("VA_1LWNAGMXJNKVPOM_236333", 10);
//			TextBox.setValueById("VA_1LWNAGMXJNKVPOM_236333", value, timeout);
//		}
//				
//	    public String getInteresEstimado() {
//			Utils.waitUntilExistsElementById("VA_1LWNAGMXJNKVPOM_236333", 10);
//			return TextBox.getTextValueById("VA_1LWNAGMXJNKVPOM_236333");
//		}
//		
//		public boolean InteresEstimadoIsEditable() {
//		boolean isNotEditable = TextLabel.checkIfDisabled("VA_1LWNAGMXJNKVPOM_236333") ||  TextLabel.checkIfReadOnly("VA_1LWNAGMXJNKVPOM_236333"); 				
//		return !isNotEditable;
//		}
//		public boolean InteresEstimadoIsValid() {
//		return TextLabel.checkClassInvalid("VA_1LWNAGMXJNKVPOM_236333");		
//		}
//		public void setFechaProximoPago(String value) {
//			Utils.waitUntilExistsElementById("VA_9231OHDLGOAHDDN_845333", 10);
//			TextBox.setValueById("VA_9231OHDLGOAHDDN_845333", value);
//		}
//				
//		public void setFechaProximoPago(String value, int timeout) {
//			Utils.waitUntilExistsElementById("VA_9231OHDLGOAHDDN_845333", 10);
//			TextBox.setValueById("VA_9231OHDLGOAHDDN_845333", value, timeout);
//		}
//				
//	    public String getFechaProximoPago() {
//			Utils.waitUntilExistsElementById("VA_9231OHDLGOAHDDN_845333", 10);
//			return TextBox.getTextValueById("VA_9231OHDLGOAHDDN_845333");
//		}
//		
//		public boolean FechaProximoPagoIsEditable() {
//		boolean isNotEditable = TextLabel.checkIfDisabled("VA_9231OHDLGOAHDDN_845333") ||  TextLabel.checkIfReadOnly("VA_9231OHDLGOAHDDN_845333"); 				
//		return !isNotEditable;
//		}
//		public boolean FechaProximoPagoIsValid() {
//		return TextLabel.checkClassInvalid("VA_9231OHDLGOAHDDN_845333");		
//		}
//		public void setNumeroPagos(String value) {
//			Utils.waitUntilExistsElementById("VA_4380QXQOZHQLBBA_456333", 10);
//			TextBox.setValueById("VA_4380QXQOZHQLBBA_456333", value);
//		}
//				
//		public void setNumeroPagos(String value, int timeout) {
//			Utils.waitUntilExistsElementById("VA_4380QXQOZHQLBBA_456333", 10);
//			TextBox.setValueById("VA_4380QXQOZHQLBBA_456333", value, timeout);
//		}
//				
//	    public String getNumeroPagos() {
//			Utils.waitUntilExistsElementById("VA_4380QXQOZHQLBBA_456333", 10);
//			return TextBox.getTextValueById("VA_4380QXQOZHQLBBA_456333");
//		}
//		
//		public boolean NumeroPagosIsEditable() {
//		boolean isNotEditable = TextLabel.checkIfDisabled("VA_4380QXQOZHQLBBA_456333") ||  TextLabel.checkIfReadOnly("VA_4380QXQOZHQLBBA_456333"); 				
//		return !isNotEditable;
//		}
//		public boolean NumeroPagosIsValid() {
//		return TextLabel.checkClassInvalid("VA_4380QXQOZHQLBBA_456333");		
//		}
	}

}

