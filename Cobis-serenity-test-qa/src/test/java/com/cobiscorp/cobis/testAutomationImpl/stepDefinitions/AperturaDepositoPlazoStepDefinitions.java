package com.cobiscorp.cobis.testAutomationImpl.stepDefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import org.openqa.selenium.Keys;

import com.cobiscorp.cobis.testAutomationImpl.accionesApertura.DiligenciarFormulario;
import com.cobiscorp.cobis.testAutomationImpl.accionesGlobales.FormActions;
import com.cobiscorp.cobis.pfprt.test.PaginaApertura;
import com.cobiscorp.cobis.pfprt.test.DesignerHeader;
import com.cobiscorp.cobis.pfprt.test.FBusquedaClientesForm;
import com.cobiscorp.cobis.pfprt.test.FVistaRecepcionForm;
import com.cobiscorp.cobis.pfprt.test.FVistaTitularesForm;
import com.cobiscorp.cobis.pfprt.test.FRecepcionModalForm;
import com.cobiscorp.cobis.pfprt.test.FVistaOperacionForm;
import com.cobiscorp.cobis.pfprt.test.FRecepcionModalForm.ListaDetalleRecepcion;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class AperturaDepositoPlazoStepDefinitions {

	@Cuando("navega desde menu hacia Apertura")
	public void navega_desde_menu_hacia_Apertura() {
		FormActions.selectMenuOption("Depósitos a Plazo>>Apertura");
	}

	@Cuando("abre la opcion cliente")
	public void abre_la_opcion_cliente() {
		FormActions.clickOn(FVistaTitularesForm.GridListaTitulares.BOTON_NUEVO);
		FormActions.clickOn(FVistaTitularesForm.ListaTitulares.BOTON_BUSCAR_CLIENTE);
	}

	@Cuando("realiza la busqueda de un cliente")
	public void realiza_la_busqueda_de_un_cliente() {
		FormActions.EnterText(FBusquedaClientesForm.FiltroBusquedaCliente.INPUT_IDENTIFICACION, "123456789");
		FormActions.clickOn(FBusquedaClientesForm.FiltroBusquedaCliente.BOTON_BUSCAR);
		FormActions.clickOn(FBusquedaClientesForm.GridListaPNatural.PRIMER_CLIENTE);
		FormActions.clickOn(FBusquedaClientesForm.GridListaPNatural.BOTON_ACCEPT_ROW);
		FormActions.clickOn(FVistaTitularesForm.BOTON_SIGUIENTE);
	}

	@Cuando("realiza el registro de un nuevo DPF para un cliente")
	public void realiza_el_registro_de_un_nuevo_DPF_para_un_cliente() {

		theActorInTheSpotlight().attemptsTo(DiligenciarFormulario.crearApertura());

		FormActions.clickOn(FVistaOperacionForm.BOTON_ACEPTAR_MODAL);
		FormActions.clickOn(FVistaOperacionForm.BOTON_SIGUIENTE_OPERACION);

		// Completa los pasos faltantes
		FormActions.clickOn(FVistaRecepcionForm.BOTON_NUEVO_RECEPFONDOS);
		FormActions.clickOn(FRecepcionModalForm.ListaDetalleRecepcion.SELECT_FORMA_RECEPCION_CLIC);
		FormActions.clickOn(FRecepcionModalForm.ListaDetalleRecepcion.SELECT_FORMA_RECEPCION);
		FormActions.clickOn(FRecepcionModalForm.ListaDetalleRecepcion.MONTOCLIC_RECEPCION);

		theActorInTheSpotlight().attemptsTo(WaitUntil.angularRequestsHaveFinished(),
				Enter.theValue("30000").into(ListaDetalleRecepcion.MONTO_RECEPCION).thenHit(Keys.TAB));

		FormActions.clickOn(FRecepcionModalForm.BOTON_ACEPTAR_MODAL_RECEPCION);
		FormActions.clickOn(PaginaApertura.BOTON_GUARDAR);
	}

	@Entonces("se debe mostrar la creacion de la Apertura al cliente previamente seleccionado")
	public void se_debe_mostrar_la_creacion_de_la_Apertura_al_cliente_previamente_seleccionado() {
		FormActions.clickOn(DesignerHeader.BOTON_DROPDOWN);
		FormActions.clickOn(DesignerHeader.ACTIVAR);
		FormActions.clickOn(DesignerHeader.BOTON_ACEPTAR_MODAL_ACTIVAR);
	}

}
