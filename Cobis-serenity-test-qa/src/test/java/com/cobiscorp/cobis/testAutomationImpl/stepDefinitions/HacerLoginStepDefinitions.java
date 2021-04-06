package com.cobiscorp.cobis.testAutomationImpl.stepDefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;

import com.cobiscorp.cobis.testAutomationImpl.accionesGlobales.FormActions;
import com.cobiscorp.cobis.testAutomationImpl.accionesGlobales.FormActionsTasks;
import com.cobiscorp.cobis.testAutomationImpl.questions.CobisTextos;
import com.cobiscorp.cobis.pfprt.test.Container;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class HacerLoginStepDefinitions {

	@Cuando("él cierra sesión")
	public void él_cierra_sesión() {
		FormActions.clickOn(Container.BOTON_LOGOUT);
		FormActions.clickOn(Container.FINALIZAR_SESION);
	}

	@Entonces("se debe mostrar la pagina Login de COBIS")
	public void se_debe_mostrar_la_pagina_Login_de_COBIS() {
		theActorInTheSpotlight().should(seeThat("Titulo Login Cobis", CobisTextos.descripcion(Container.TITULO_LOGIN),
				equalTo("Bienvenido, Ingrese a su cuenta")));
	}

}
