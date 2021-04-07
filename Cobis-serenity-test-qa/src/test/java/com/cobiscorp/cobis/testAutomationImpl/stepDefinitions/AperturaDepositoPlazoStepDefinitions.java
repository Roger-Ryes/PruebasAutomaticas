package com.cobiscorp.cobis.testAutomationImpl.stepDefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import org.openqa.selenium.Keys;

import com.cobiscorp.cobis.testAutomationImpl.accionesApertura.DiligenciarFormulario;
import com.cobiscorp.cobis.testAutomationImpl.accionesGlobales.FormActions;
import com.cobiscorp.cobis.testAutomationImpl.accionesGlobales.FormActionsTasks;
import com.cobiscorp.cobis.pfprt.test.PaginaApertura;
import com.cobiscorp.cobis.pfprt.test.DesignerHeader;
import com.cobiscorp.cobis.pfprt.test.FBusquedaClientesForm;
import com.cobiscorp.cobis.pfprt.test.FVistaRecepcionForm;
import com.cobiscorp.cobis.pfprt.test.FVistaTitularesForm;
import com.cobiscorp.cobis.pfprt.test.FRecepcionModalForm;
import com.cobiscorp.cobis.pfprt.test.FVistaOperacionForm;
import com.cobiscorp.cobis.pfprt.test.FRecepcionModalForm.ListaDetalleRecepcion;
import com.cobiscorp.cobis.pfprt.test.FVistaOperacionForm.DetalleOperacion;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
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

	@Cuando("realiza la busqueda de un {string}")
	public void realiza_la_busqueda_de_un_cliente(String string) {
		//FormActionsTasks.Seleccionar.lista("PERSONA JURIDICA", FBusquedaClientesForm.DetalleOperacion.SELECT_CLIENTE);
		FormActions.EnterText(FBusquedaClientesForm.FiltroBusquedaCliente.INPUT_IDENTIFICACION, string);
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
	
	
	
	
	
	
	
	//SEGUNDA HISTORIA
//	@Dado("se navega  a la opción de menú Depósitos a Plazo_Apertura")
//	public void se_navega_a_la_opción_de_menú_Depósitos_a_Plazo_Apertura() {
//		FormActions.selectMenuOption("Depósitos a Plazo>>Apertura");
//	}
//
//	@Cuando("realiza la busqueda de un {string}")
//	public void realiza_la_busqueda_de_un(String string) {
//		FormActions.clickOn(FVistaTitularesForm.GridListaTitulares.BOTON_NUEVO);
//	    FormActions.clickOn(FVistaTitularesForm.ListaTitulares.BOTON_BUSCAR_CLIENTE);
//		FormActions.EnterText( FBusquedaClientesForm.FiltroBusquedaCliente.INPUT_IDENTIFICACION , string );
//		FormActions.clickOn( FBusquedaClientesForm.FiltroBusquedaCliente.BOTON_BUSCAR );
//		FormActions.clickOn(FBusquedaClientesForm.GridListaPNatural.PRIMER_CLIENTE);
//		FormActions.clickOn(FBusquedaClientesForm.GridListaPNatural.BOTON_ACCEPT_ROW);
//		FormActions.clickOn(FVistaTitularesForm.BOTON_SIGUIENTE);
//	}
//	
//	@Cuando("diligencia el formulario de Operación")
//	public void diligencia_el_formulario_de_Operación() {
//		theActorInTheSpotlight().attemptsTo(DiligenciarFormulario.crearApertura());
//		FormActions.clickOn(FVistaOperacionForm.BOTON_ACEPTAR_MODAL);
//		FormActions.clickOn(FVistaOperacionForm.BOTON_SIGUIENTE_OPERACION);
//	}
//	
//	@Cuando("diligencia el formulario de recepción de fondos")
//	public void diligencia_el_formulario_de_recepción_de_fondos() {
//	    FormActions.clickOn(FVistaRecepcionForm.BOTON_NUEVO_RECEPFONDOS);
//	    
//	}
//	
//	@Entonces("crea el certificado de deposito en estado ing")
//	public void crea_el_certificado_de_deposito_en_estado_ing() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
}