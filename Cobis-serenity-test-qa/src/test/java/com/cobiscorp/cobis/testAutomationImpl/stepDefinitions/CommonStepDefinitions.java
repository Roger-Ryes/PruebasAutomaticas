package com.cobiscorp.cobis.testAutomationImpl.stepDefinitions;

import com.cobiscorp.cobis.testAutomationImpl.accionesGlobales.FormActions;
import com.cobiscorp.cobis.testAutomationImpl.constants.Parametros;
import com.cobiscorp.cobis.pfprt.test.Container;

import io.cucumber.java.es.Dado;

public class CommonStepDefinitions {

	@Dado("^que (.*) realiza Login en COBIS")
	public void que_usuario_realiza_Login_en_COBIS(String user) {
		FormActions.browseToCobis(user);
		FormActions.loginWith(Parametros.USUARIO, Parametros.PASS_USUARIO);
		FormActions.enterTextAndTab(Container.INPUT_FILIAL, Parametros.FILIAL);
		FormActions.enterTextAndTab(Container.INPUT_OFICINA, Parametros.OFICINA);
		FormActions.enterTextAndTab(Container.INPUT_ROL, Parametros.ROL);
		FormActions.clickOn(Container.BOTON_INGRESAR);
	}

}
