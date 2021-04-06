package com.cobiscorp.cobis.testAutomationImpl.accionesGlobales;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.Keys;

import com.cobiscorp.cobis.pfprt.test.Container;
import com.cobiscorp.cobis.pfprt.test.FVistaOperacionForm.DetalleOperacion;
import com.cobiscorp.cobis.testAutomationImpl.accionesApertura.Digitar;
import com.cobiscorp.cobis.testAutomationImpl.constants.Parametros;

import io.cucumber.java.Before;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

public class ContainerActionsTasks {

	public static class Browse implements Interaction {

		private final String url;

		@Override
		@Step("{0} navega hacia la pagina: #opcionDeUrl")
		public <T extends Actor> void performAs(T actor) {
			actor.attemptsTo(Open.url(url));

		}

		public static Performable to(String url) {
			return Instrumented.instanceOf(Browse.class).withProperties(url);
		}

		public Browse(String url) {
			this.url = url;
		}

	}

	public static class WaitUntilComponent implements Task {

		@Override
		public <T extends Actor> void performAs(T actor) {
			actor.attemptsTo(WaitUntil.angularRequestsHaveFinished());
		}

		public WaitUntilComponent() {
		}

		public static Performable charge() {
			return instrumented(WaitUntilComponent.class);
		}

	}

	public static class ClickOn implements Task {

		private Target element;

		@Override
		@Step("{0} hace clic en el modulo ó boton: #elemento")
		public <T extends Actor> void performAs(T actor) {
			actor.attemptsTo(Click.on(element));
		}

		public ClickOn(Target element) {
			this.element = element;
		}

		public static Performable elementoWeb(Target element) {
			return Instrumented.instanceOf(ClickOn.class).withProperties(element);
		}

	}

	public static class EnterTheText implements Task {

		private String text;
		private Target target;

		@Override
		@Step("{0} digita #texto en la caja #inputBox")
		public <T extends Actor> void performAs(T actor) {
			actor.attemptsTo(Enter.theValue(text).into(target));
		}

		public EnterTheText(Target target, String text) {
			this.text = text;
			this.target = target;
		}

		public static Performable text(String text, Target target) {
			return Instrumented.instanceOf(EnterTheText.class).withProperties(target, text);
		}

	}

	public static class EnterTheTextAndHitTab implements Task {

		private String text;
		private Target target;

		@Override
		@Step("{0} digita #texto en la caja #inputBox y presiona Tab ")
		public <T extends Actor> void performAs(T actor) {
			actor.attemptsTo(Enter.theValue(text).into(target).thenHit(Keys.TAB));
		}

		public EnterTheTextAndHitTab(Target target, String text) {
			this.target = target;
			this.text = text;
		}

		public static Performable text(Target target, String text) {
			return Instrumented.instanceOf(EnterTheTextAndHitTab.class).withProperties(target, text);
		}

	}

	public static class EnterTheTextAndHitEnter implements Task {

		private String text;
		private Target target;

		@Override
		@Step("{0} digita #texto en la caja #target y presiona Enter")
		public <T extends Actor> void performAs(T actor) {
			actor.attemptsTo(Enter.theValue(text).into(target).thenHit(Keys.ENTER));
		}

		public EnterTheTextAndHitEnter(Target target, String text) {
			this.text = text;
			this.target = target;
		}

		public static Performable text(Target target, String text) {
			return Instrumented.instanceOf(EnterTheTextAndHitEnter.class).withProperties(target, text);
		}

	}

	public static class SetStage {

		@Before
		public void setTheStage() {

			OnStage.setTheStage(new OnlineCast());
		}

	}

	public static class Digitar implements Task {

		private Target inputSpan;
		private Target input;
		private String text;

		@Override
		@Step("{0} Digita el texto #text")
		public <T extends Actor> void performAs(T actor) {
			actor.attemptsTo(FormActionsTasks.ClickOn.elementoWeb(inputSpan),
					Enter.theValue(text).into(input).thenHit(Keys.TAB));
		}

		public Digitar(String text, Target inputSpan, Target input) {
			this.inputSpan = inputSpan;
			this.input = input;
			this.text = text;
		}

		public static Performable monto(String texto) {
			Target inputSpan = DetalleOperacion.MONTOCLIC;
			Target input = DetalleOperacion.MONTO;
			return Instrumented.instanceOf(Digitar.class).withProperties(texto, inputSpan, input);

		}

		public static Performable plazo(String texto) {
			Target inputSpan = DetalleOperacion.PLAZO_CLIC;
			Target input = DetalleOperacion.PLAZO;
			return Instrumented.instanceOf(Digitar.class).withProperties(texto, inputSpan, input);

		}
	}

	public static class ClicJS implements Task {

		private Target elemento;

		@Override
		@Step("{0} hace clic en el modulo ó boton: #elemento")
		public <T extends Actor> void performAs(T actor) {
			actor.attemptsTo(Click.on(elemento));
		}

		public ClicJS(Target elemento) {
			this.elemento = elemento;
		}

		public static Performable elementoWeb(Target elemento) {

			return Instrumented.instanceOf(ClicJS.class).withProperties(elemento);

		}

	}

}
