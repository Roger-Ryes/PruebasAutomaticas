package com.cobiscorp.cobis.testAutomationImpl.stepDefinitions;

import com.cobiscorp.cobis.pfprt.test.FBusquedaClientesForm;
import com.cobiscorp.cobis.pfprt.test.FBusquedaClientesForm.FiltroBusquedaClienteCTA;
import com.cobiscorp.cobis.pfprt.test.FVistaTitularesForm;
import com.cobiscorp.cobis.testAutomationImpl.accionesGlobales.FormActions;

import io.cucumber.java.es.Cuando;

import io.cucumber.java.es.Entonces;

public class AperturaPersonaNaturalStepDefinitions {

	@Cuando("el navega  a la Opción de Cuenta- Apertura de Cuenta en Paso1")
	public void el_navega_a_la_Opción_de_Cuenta_Apertura_de_Cuenta_en_Paso1() {
		FormActions.selectMenuOption("Depósitos a la Vista>>Cuentas>>Apertura de cuentas");
	}

	@Cuando("selecciona rol \"Titular”")
	public void selecciona_rol_Titular() {
		FormActions.clickOn(FVistaTitularesForm.GridListaTitulares.BOTON_NUEVO);
		FormActions.clickOn(FVistaTitularesForm.ListaTitulares.BOTON_BUSCAR_CLIENTE);
		FormActions.EnterText(FBusquedaClientesForm.FiltroBusquedaClienteCTA.INPUT_ENTE, "3");
		FormActions.clickOn(FBusquedaClientesForm.FiltroBusquedaClienteCTA.BOTON_BUSCAR);
		FormActions.clickOn(FBusquedaClientesForm.GridListaPNaturalCTA.PRIMER_CLIENTE);
		FormActions.clickOn(FBusquedaClientesForm.GridListaPNaturalCTA.BOTON_SIGUIENTE);
	}

	@Cuando("realiza la Búsqueda de Cliente “Persona Natural”")
	public void realiza_la_Búsqueda_de_Cliente_Persona_Natural() {

	}

	@Cuando("diligencia en Paso {int} sección de Datos Generales")
	public void diligencia_en_Paso_sección_de_Datos_Generales(Integer int1) {

	}

	@Entonces("se emite mensaje de cuenta creada exitosasmente y se habilita botón Imprimir")
	public void se_emite_mensaje_de_cuenta_creada_exitosasmente_y_se_habilita_botón_Imprimir() {

	}
}
