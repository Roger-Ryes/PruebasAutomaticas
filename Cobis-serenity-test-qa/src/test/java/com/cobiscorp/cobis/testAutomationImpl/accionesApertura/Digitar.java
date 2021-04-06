package com.cobiscorp.cobis.testAutomationImpl.accionesApertura;

import org.openqa.selenium.Keys;

import com.cobiscorp.cobis.pfprt.test.FVistaOperacionForm.DetalleOperacion;
import com.cobiscorp.cobis.testAutomationImpl.accionesGlobales.FormActionsTasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

public class Digitar implements Task{
	
	private Target inputSpan;
	private Target input;
	private String text;

	@Override
	@Step("{0} Digita el texto #text")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(FormActionsTasks.ClickOn.elementoWeb(inputSpan),
				Enter.theValue(text).into(input).thenHit(Keys.TAB));
	}
	
	public Digitar (String text, Target inputSpan, Target input) {		
		this.inputSpan= inputSpan;
		this.input= input;
		this.text =text;
	}

	public static Performable monto (String texto) {
		Target inputSpan = DetalleOperacion.MONTOCLIC;
		Target input = DetalleOperacion.MONTO;
		return Instrumented.instanceOf(Digitar.class).withProperties(texto,inputSpan,input);
	    
	}
	
	public static Performable plazo (String texto) {
		Target inputSpan = DetalleOperacion.PLAZO_CLIC;
		Target input = DetalleOperacion.PLAZO;
		return Instrumented.instanceOf(Digitar.class).withProperties(texto,inputSpan,input);
	    
	}

}
