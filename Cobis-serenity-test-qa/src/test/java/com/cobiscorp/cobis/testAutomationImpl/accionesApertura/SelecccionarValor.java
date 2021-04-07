package com.cobiscorp.cobis.testAutomationImpl.accionesApertura;

import org.openqa.selenium.By;

import com.cobiscorp.cobis.pfprt.test.FVistaOperacionForm.DetalleOperacion;
import com.cobiscorp.cobis.testAutomationImpl.accionesGlobales.FormActionsTasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

public class SelecccionarValor implements Task{
	
	private String listaSeleccion;
	private Target listaSpan;
	
	@Override
	@Step("{0} Despliega Lista y Selecciona: #listaSeleccion")
	public <T extends Actor> void performAs(T actor) {
		FormActionsTasks.WaitUntilComponent.charge();
		actor.attemptsTo(FormActionsTasks.ClickOn.elementoWeb(listaSpan),
				Click.on(By.xpath("//li[text()='"+listaSeleccion+"']")));
	}
	
	public SelecccionarValor(String listaSeleccion, Target listaSpan) {
		this.listaSeleccion = listaSeleccion;
		this.listaSpan = listaSpan;
	}

	public static Performable producto (String listaSeleccion) {
		Target listaSpan = DetalleOperacion.SELECT_PRODUCTO_CLIC;
		return Instrumented.instanceOf(SelecccionarValor.class)
				.withProperties(listaSeleccion, listaSpan);
	}
	
	public static Performable formaPago (String listaSeleccion) {
		Target listaSpan = DetalleOperacion.SELECT_FROMA_PAGO_CLIC;
		return Instrumented.instanceOf(SelecccionarValor.class)
				.withProperties(listaSeleccion, listaSpan);
	}
	
	public static Performable categoria (String listaSeleccion) {
		Target listaSpan = DetalleOperacion.SELECT_CATEGORIA_CLIC;
		return Instrumented.instanceOf(SelecccionarValor.class)
				.withProperties(listaSeleccion, listaSpan);
	}

}
