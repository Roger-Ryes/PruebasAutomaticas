package com.cobiscorp.cobis.testAutomationImpl.accionesGlobales;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.By;

import com.cobiscorp.cobis.pfprt.test.Container;
import com.cobiscorp.cobis.testAutomationImpl.constants.Parametros;

import io.cucumber.java.Before;

public class FormActionsTasks extends ContainerActionsTasks {
	
	

	/**
	 * Metodo para
	 *
	 */
	public static class HacerClicJS implements Task {

		private Target botonModuloTarget;

		@Override
		@Step("{0} hace clic en el modulo ó boton: #botonModuloTarget")
		public <T extends Actor> void performAs(T actor) {
			FormActionsTasks.WaitUntilComponent.charge();
			actor.attemptsTo(JavaScriptClick.on(botonModuloTarget));
		}

		public HacerClicJS(Target botonModuloTarget) {
			this.botonModuloTarget = botonModuloTarget;
		}

		public static Performable botonModulo(Target botonModuloTarget) {

			return Instrumented.instanceOf(ClickOn.class).withProperties(botonModuloTarget);

		}

	}



	/**
	 * Metodo para
	 *
	 */
	public static class Seleccionar implements Task {

		private String listaSeleccion;
		private Target listaSpan;

		@Override
		@Step("{0} Despliega Lista y Selecciona: #listaSeleccion")
		public <T extends Actor> void performAs(T actor) {
			// TODO Auto-generated method stub
			FormActionsTasks.WaitUntilComponent.charge();
			actor.attemptsTo(ClickOn.elementoWeb(listaSpan),
					Click.on(By.xpath("//li[text()='" + listaSeleccion + "']")));
		}

		public Seleccionar(String listaSeleccion, Target listaSpan) {
			this.listaSeleccion = listaSeleccion;
			this.listaSpan = listaSpan;
		}

		public static Performable lista(String listaSeleccion, Target listaSpan) {
			return Instrumented.instanceOf(Seleccionar.class).withProperties(listaSeleccion, listaSpan);
		}

	}

	/**
	 * Metodo para
	 *
	 */


	public static class Grid {

		public static class Commands {

		}

		public static class Pager {

		}

		public static class Row {

		}

		public static class RowCommands {

		}

		public static class RowControls {

		}
	}
	

	public static class ComboBox {

		public static class Seleccionar {

		}

		public static class Escribir {

		}

		public static class Leer {

		}
	}

}
