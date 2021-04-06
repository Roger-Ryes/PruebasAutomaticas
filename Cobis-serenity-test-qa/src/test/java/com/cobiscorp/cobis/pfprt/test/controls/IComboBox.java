package com.cobiscorp.cobis.pfprt.test.controls;

import com.cobiscorp.cobis.pfprt.test.events.ITextSelectable;
import com.cobiscorp.cobis.pfprt.test.events.IValueSelectable;

import net.serenitybdd.screenplay.targets.Target;

public interface IComboBox extends IControl, ITextSelectable, IValueSelectable {
	public Target getTarget();
}
