package com.cobiscorp.cobis.testAutomationImpl.accionesGlobales;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import org.assertj.core.error.ShouldAccept;
import org.openqa.selenium.Keys;

import com.cobiscorp.cobis.pfprt.test.Container;
import com.cobiscorp.cobis.pfprt.test.FVistaOperacionForm.DetalleOperacion;
import com.cobiscorp.cobis.pfprt.test.events.IClickable;
import com.cobiscorp.cobis.testAutomationImpl.accionesApertura.Digitar;
import com.cobiscorp.cobis.testAutomationImpl.constants.Parametros;

public class ContainerActions {

	/**
	 * Metodo para
	 *
	 */
	public static void clickOn(Target target) {
		theActorInTheSpotlight().attemptsTo(ContainerActionsTasks.WaitUntilComponent.charge());
		theActorInTheSpotlight().attemptsTo(ContainerActionsTasks.ClickOn.elementoWeb(target));
	}
	
	public static void clic(IClickable control) {
		theActorInTheSpotlight().attemptsTo(ContainerActionsTasks.WaitUntilComponent.charge());
//		theActorInTheSpotlight().attemptsTo(FormActionsTasks.HacerClic.botonModulo(control.getTarget()));
	}

	/**
	 * Metodo para
	 *
	 */
	public static void EnterText(Target target, String texto) {
		theActorInTheSpotlight().attemptsTo(ContainerActionsTasks.WaitUntilComponent.charge());
		theActorInTheSpotlight().attemptsTo(ContainerActionsTasks.EnterTheText.text(texto, target));
	}
	
	public static void EnterDate(Target target, String texto) {
		theActorInTheSpotlight().attemptsTo(ContainerActionsTasks.WaitUntilComponent.charge());
		theActorInTheSpotlight().attemptsTo(ContainerActionsTasks.EnterDate.text(texto, target));
	}
	
	
	
	/**
	 * Metodo para
	 *
	 */
	public static void enterTextAndTab(Target target, String texto) {
		theActorInTheSpotlight().attemptsTo(ContainerActionsTasks.WaitUntilComponent.charge());
		theActorInTheSpotlight().attemptsTo(ContainerActionsTasks.EnterTheTextAndHitTab.text(target, texto));
	}
	
	/**
	 * Metodo para
	 *
	 */
	public static void enterTextAndEnter(Target target, String texto) {
		theActorInTheSpotlight().attemptsTo(ContainerActionsTasks.WaitUntilComponent.charge());
		theActorInTheSpotlight().attemptsTo(ContainerActionsTasks.EnterTheTextAndHitEnter.text(target, texto));
	}

	/**
	 * Metodo para
	 *
	 */
	public static void browseToCobis(String user) {
		theActorCalled(user).has(ContainerActionsTasks.Browse.to(Parametros.PAGINA_COBIS));
	}

	/**
	 * Metodo para
	 *
	 */
	public static void loginWith(String usuario, String password) {
		ContainerActions.EnterText(Container.USUARIO, usuario);
		ContainerActions.EnterText(Container.CLAVE, password);
		ContainerActions.clickOn(Container.BOTON_LOGIN);
	}
	
	/**
	 * Metodo para
	 *
	 */
	public static void selectMenuOption(String menu) {
		ContainerActions.clickOn(Container.MENU);
		String[] items = menu.split(">>");
		for (String item : items) {
			ContainerActions.clickOn(Container.setOpcionMenu(item));
		}
		changeToSecondaryIframe();
	}

	/**
	 * Metodo para
	 *
	 */
	public static void changeToPrimaryIframe() {
		theActorInTheSpotlight().attemptsTo(Switch.toFrame(0));
	}

	/**
	 * Metodo para
	 *
	 */
	public static void changeToSecondaryIframe() {
		theActorInTheSpotlight().attemptsTo(Switch.toFrame(1));
	}

	public static void validateMessage(Target element) {
		theActorInTheSpotlight().attemptsTo(ContainerActionsTasks.WaitUntilComponent.charge());
		theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the(element),WebElementStateMatchers.isVisible()));
	}

//	@Override
//	@Step("{0} Digita el texto #text")
//	public <T extends Actor> void performAs(T actor) {
//		actor.attemptsTo(FormActionsTasks.Clic.elementoWeb(inputSpan),
//				Enter.theValue(text).into(input).thenHit(Keys.TAB));
//	}
//	
//	public Digitar (String text, Target inputSpan, Target input) {		
//		this.inputSpan= inputSpan;
//		this.input= input;
//		this.text =text;
//	}
//
//	public static Performable monto (String texto) {
//		Target inputSpan = DetalleOperacion.MONTOCLIC;
//		Target input = DetalleOperacion.MONTO;
//		return Instrumented.instanceOf(Digitar.class).withProperties(texto,inputSpan,input);
//	    
//	}
//	
//	public static Performable plazo (String texto) {
//		Target inputSpan = DetalleOperacion.PLAZO_CLIC;
//		Target input = DetalleOperacion.PLAZO;
//		return Instrumented.instanceOf(Digitar.class).withProperties(texto,inputSpan,input);
//	    
//	}

	public static void clicJS(Target target) {
		theActorInTheSpotlight().attemptsTo(ContainerActionsTasks.WaitUntilComponent.charge());
		theActorInTheSpotlight().attemptsTo(ContainerActionsTasks.ClicJS.elementoWeb(target));
	}
	
	public static void digitar() {
		ContainerActions.clickOn(Container.BOTON_LOGIN);
	}

	
}
