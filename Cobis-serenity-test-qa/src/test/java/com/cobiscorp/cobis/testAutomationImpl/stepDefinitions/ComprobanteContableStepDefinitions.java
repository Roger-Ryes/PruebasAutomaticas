package com.cobiscorp.cobis.testAutomationImpl.stepDefinitions;

import com.cobiscorp.cobis.pfprt.test.FComprobanteContable;
import com.cobiscorp.cobis.testAutomationImpl.accionesGlobales.FormActions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;

public class ComprobanteContableStepDefinitions {
	
	@Cuando("ingresa y selecciona los valores \\(Fecha, Descripción, Oficina de origen.  Área de origen y checkbox “Mayorizado”) de la sección “Comprobante contables”")
	public void ingresa_y_selecciona_los_valores_Fecha_Descripción_Oficina_de_origen_Área_de_origen_y_checkbox_Mayorizado_de_la_sección_Comprobante_contables() {
		FormActions.selectMenuOption("Contabilidad>>Transacciones>>Comprobantes Contables");
		FormActions.EnterDate(FComprobanteContable.Comprobante.INPUT_FECHA, "25122019");
		
		FormActions.clickOn(FComprobanteContable.Comprobante.FILTRO_COMPROBANTE_TIPO);	
		FormActions.clickOn(FComprobanteContable.GRID_TIPO_COMPROBANTE.COMPROBANTE_1);	
		
		FormActions.clickOn(FComprobanteContable.Comprobante.FILTRO_AREA_ORIGEN);	
		FormActions.clickOn(FComprobanteContable.GRID_AREA_ORIGEN.AREA_CONTABILIDAD);	
		//FormActions.EnterText(FComprobanteContable.Comprobante.INPUT_DESCRIPCION, "Este es un comprobante");
		
		
	}

	@Cuando("realiza  el ingreso en la grilla, registro de Cuenta Débito por un  valor X")
	public void realiza_el_ingreso_en_la_grilla_registro_de_Cuenta_Débito_por_un_valor_X() {


	}

	@Cuando("realiza el ingreso en la grilla, registro de Cuenta Crédito por un valor X")
	public void realiza_el_ingreso_en_la_grilla_registro_de_Cuenta_Crédito_por_un_valor_X() {

	}

	@Cuando("se hace click en el boton Guardar")
	public void se_hace_click_en_el_boton_Guardar() {
		FormActions.clickOn(FComprobanteContable.BUTTON_GUARDAR);
	
	}

	@Entonces("se emite mensaje de “Operación realizada con éxito”")
	public void se_emite_mensaje_de_Operación_realizada_con_éxito() {
		FormActions.validateMessage(FComprobanteContable.MESSAGE_EXITO);
	}


}
