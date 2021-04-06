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

import net.serenitybdd.screenplay.targets.Target;

public class FVistaRecepcionForm extends Base{

	public static Target BOTON_NUEVO_RECEPFONDOS = Target.the("Botón Nuevo").inIFrame(IFRAME_MENU).located(By.id("QV_6933_39827_CUSTOM_CREATE"));

	

	
	private FiltroBusquedaRecepcion filtroBusquedaRecepcion;
	private ContextoPFI contextoPFI;
	private GridListaDetalleRecepcion gridListaDetalleRecepcion;

	public FVistaRecepcionForm() {		
		this.filtroBusquedaRecepcion = new FiltroBusquedaRecepcion();
		this.contextoPFI = new ContextoPFI();
		this.gridListaDetalleRecepcion = new GridListaDetalleRecepcion();
	}
	
	public FiltroBusquedaRecepcion getFiltroBusquedaRecepcion() {
		return this.filtroBusquedaRecepcion;
	}
	
	public ContextoPFI getContextoPFI() {
		return this.contextoPFI;
	}
	
	public GridListaDetalleRecepcion getGridListaDetalleRecepcion() {
		return this.gridListaDetalleRecepcion;
	}
	
	public void clickButtonAnterior_P2T() {
//		Button.clickButtonById("CM_TPFPRTXU_P2T");
	}
		
	public void clickButtonSiguiente_HPX() {
//		Button.clickButtonById("CM_TPFPRTXU_HPX");
	}
		
	public void clickButtonGuardar_7OV() {
//		Button.clickButtonById("CM_TPFPRTXU_7OV");
	}
		
//	public DesignerHeader getHeaderUPCabeceraOperacion_908() {
//		return new DesignerHeader();
//	}

	public static class FiltroBusquedaRecepcion {
	
//		public void setNumeroOperacion(String value) {
//			Utils.waitUntilExistsElementById("VA_NUMEROOPERACNNN_890921", 10);
//			TextBox.clearTextById("VA_NUMEROOPERACNNN_890921");
//			TextBox.setValueById("VA_NUMEROOPERACNNN_890921", value);
//		}
//				
//		public void setNumeroOperacion(String value, int timeout) {
//			Utils.waitUntilExistsElementById("VA_NUMEROOPERACNNN_890921", 10);
//			TextBox.clearTextById("VA_NUMEROOPERACNNN_890921");
//			TextBox.setValueById("VA_NUMEROOPERACNNN_890921", value, timeout);
//		}
//				
//	    public String getNumeroOperacion() {
//			Utils.waitUntilExistsElementById("VA_NUMEROOPERACNNN_890921", 10);
//			return TextBox.getValueInput("VA_NUMEROOPERACNNN_890921");
//		}
//		
//		public boolean NumeroOperacionIsEditable() {
//		boolean isNotEditable = TextBox.checkIfDisabled("VA_NUMEROOPERACNNN_890921") ||  TextBox.checkIfReadOnly("VA_NUMEROOPERACNNN_890921"); 				
//		return !isNotEditable;
//		}
//		public boolean NumeroOperacionIsValid() {
//		return TextBox.checkClassInvalid("VA_NUMEROOPERACNNN_890921");		
//		}
	}
	public static class ContextoPFI {
	
//		public void setMontoRecepcion(String value) {
//			Utils.waitUntilExistsElementById("VA_MONTORECEPCIONN_767921", 10);
//			TextBox.setValueById("VA_MONTORECEPCIONN_767921", value);
//		}
//				
//		public void setMontoRecepcion(String value, int timeout) {
//			Utils.waitUntilExistsElementById("VA_MONTORECEPCIONN_767921", 10);
//			TextBox.setValueById("VA_MONTORECEPCIONN_767921", value, timeout);
//		}
//				
//	    public String getMontoRecepcion() {
//			Utils.waitUntilExistsElementById("VA_MONTORECEPCIONN_767921", 10);
//			return TextBox.getTextValueById("VA_MONTORECEPCIONN_767921");
//		}
//		
//		public boolean MontoRecepcionIsEditable() {
//		boolean isNotEditable = TextLabel.checkIfDisabled("VA_MONTORECEPCIONN_767921") ||  TextLabel.checkIfReadOnly("VA_MONTORECEPCIONN_767921"); 				
//		return !isNotEditable;
//		}
//		public boolean MontoRecepcionIsValid() {
//		return TextLabel.checkClassInvalid("VA_MONTORECEPCIONN_767921");		
//		}
	}

	public static class GridListaDetalleRecepcion {
	

//		public String getCellData(int indexRow, int column) {
//			return Grid.getTextByRowAndColumn("QV_6933_39827", indexRow, column);
//		}
//		public FRecepcionModalForm addRow() {			
//			Grid.clickNewRecord("QV_6933_39827");
//			return new FRecepcionModalForm();
//		}
//		
//		public void acceptRow() {
//			Grid.clickAcceptRecord("QV_6933_39827");
//		}
//
//		public void cancelRow() {
//			Grid.clickCancelRecord("QV_6933_39827");
//		}
//
//		public void deleteRow(int indexRow) {			
//			Grid.clickDeleteRow("QV_6933_39827",indexRow);
//		}
//		
//		public void confirmDeleteRow(boolean accept) throws InterruptedException{			
//			Grid.clickConfirmDelete(accept);
//		}
//				
//		public void selectRow(int indexRow) {
//			sleepTime(2000);
//			Grid.selectRowByIndex("QV_6933_39827", indexRow);
//			sleepTime(2000);
//		}
				
	
	}
}

