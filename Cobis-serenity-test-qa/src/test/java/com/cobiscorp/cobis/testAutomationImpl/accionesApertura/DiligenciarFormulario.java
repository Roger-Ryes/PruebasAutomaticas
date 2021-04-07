package com.cobiscorp.cobis.testAutomationImpl.accionesApertura;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.cobiscorp.cobis.testAutomationImpl.accionesGlobales.FormActionsTasks;
import com.cobiscorp.cobis.testAutomationImpl.accionesGlobales.FormActionsTasks.Seleccionar;
import com.cobiscorp.cobis.pfprt.test.FVistaOperacionForm.DetalleOperacion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

public class DiligenciarFormulario implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(FormActionsTasks.WaitUntilComponent.charge(),
				FormActionsTasks.Seleccionar.lista("CERTIFICADO VIP", DetalleOperacion.SELECT_PRODUCTO_CLIC),
				FormActionsTasks.Seleccionar.lista("SI", DetalleOperacion.SELECT_CAP_INTERES_CLIC),
				SelecccionarValor.formaPago("VENCIMIENTO"),
				SelecccionarValor.categoria("NOMINATIVO"),
				Digitar.monto("12000"),
				Digitar.plazo("35"),
				FormActionsTasks.ClickOn.elementoWeb(DetalleOperacion.BOTON_SIMULAR));
	}
	
	public DiligenciarFormulario() {
		
	}

	public static Performable crearApertura() {
		// TODO Auto-generated method stub
		return instrumented(DiligenciarFormulario.class);
	}

}
