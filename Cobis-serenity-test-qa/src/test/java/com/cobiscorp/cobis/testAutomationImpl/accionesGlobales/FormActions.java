package com.cobiscorp.cobis.testAutomationImpl.accionesGlobales;

import net.serenitybdd.screenplay.targets.Target;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FormActions extends ContainerActions {

	

	public static void gridAccion(Target target) {
		theActorInTheSpotlight().attemptsTo(FormActionsTasks.WaitUntilComponent.charge());
		theActorInTheSpotlight().attemptsTo(FormActionsTasks.ClickOn.elementoWeb(target));
	}

	public static class Combo {
		public static void leer(Target target) {
			theActorInTheSpotlight().attemptsTo(FormActionsTasks.WaitUntilComponent.charge());
			theActorInTheSpotlight().attemptsTo(FormActionsTasks.ClickOn.elementoWeb(target));
		}

		public static void escribir(Target target) {
			theActorInTheSpotlight().attemptsTo(FormActionsTasks.WaitUntilComponent.charge());
			theActorInTheSpotlight().attemptsTo(FormActionsTasks.ClickOn.elementoWeb(target));
		}

		public static void seleccionar(Target target) {
			theActorInTheSpotlight().attemptsTo(FormActionsTasks.WaitUntilComponent.charge());
			theActorInTheSpotlight().attemptsTo(FormActionsTasks.ClickOn.elementoWeb(target));
		}

	}

	public static class Seleccionar {
		public static void combo(Target target) {
			theActorInTheSpotlight().attemptsTo(FormActionsTasks.WaitUntilComponent.charge());
			theActorInTheSpotlight().attemptsTo(FormActionsTasks.ClickOn.elementoWeb(target));
		}

		public static void elemento(Target target) {
			theActorInTheSpotlight().attemptsTo(FormActionsTasks.WaitUntilComponent.charge());
			theActorInTheSpotlight().attemptsTo(FormActionsTasks.ClickOn.elementoWeb(target));
		}

		public static void seleccionar(Target target) {
			theActorInTheSpotlight().attemptsTo(FormActionsTasks.WaitUntilComponent.charge());
			theActorInTheSpotlight().attemptsTo(FormActionsTasks.ClickOn.elementoWeb(target));
		}

	}
	
	
}
