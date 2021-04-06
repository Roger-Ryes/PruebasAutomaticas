package com.cobiscorp.cobis.testAutomationImpl.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class CobisTextos {
	
	public static Question<String> descripcion(Target texto) {
		return actor -> Text.of(texto)
	            .viewedBy(actor).asString();
	}

}
