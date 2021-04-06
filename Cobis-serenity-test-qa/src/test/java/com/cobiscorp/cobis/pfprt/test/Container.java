package com.cobiscorp.cobis.pfprt.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.screenplay.targets.IFrame;
import net.serenitybdd.screenplay.targets.Target;

public class Container {
	public WebElement element;
	
	public static IFrame IFRAME_MENU  = IFrame.withPath(By.xpath("//iframe[@class='cb-external ng-scope']"));
	
	public static Target BOTON_LOGOUT = Target.the("Boton Logout").located(By.id("nav-logout"));
	public static Target FINALIZAR_SESION = Target.the("Enlace para finalizar sesión").located(By.xpath("//a[@ng-click='onSelectionLogout()']"));
	public static Target MENU = Target.the("Opción de Menu Cobis").located(By.xpath("//a[@title='Menú']"));
	public static Target APERTURA = Target.the("Menu Apertura").located(By.xpath("//body/div[@id='nav-panels']/div[@id='panel-menu']/div[2]/div[3]/a[1]"));

	public static Target USUARIO = Target.the("Input campo usuario").located(By.id("login"));
	public static Target CLAVE = Target.the("Input campo Password").located(By.id("password"));
	public static Target TITULO_LOGIN = Target.the("Titulo de Login COBIS").located(By.id("message"));
	public static Target BOTON_LOGIN = Target.the("Botón Inicio de Sesión").located(By.xpath("//button[@class='btn btn-primary btn-lg btn-block ng-scope']"));
	public static Target INPUT_FILIAL = Target.the("Selector buscador Filial").located(By.xpath("//input[@name='filial_input']"));
	public static Target INPUT_OFICINA = Target.the("Selector buscador Oficina").located(By.xpath("//input[@name='office_input']"));
	public static Target INPUT_ROL = Target.the("Selector buscador Rol").located(By.xpath("//input[@name='rol_input']"));
	public static Target BOTON_INGRESAR = Target.the("Botón Ingresar COBIS").located(By.id("btnAuthorization"));
	public static Target CAMBIAR_DE_USUARIO = Target.the("Enlcae Cambiar de Usuario").located(By.xpath("//a[contains(text(),'Cambiar de usuario')]"));

	public static Target TASA = Target.the("GAT Nominal").located(By.id("VA_TASAEFECTIVAYZH_602333"));
	
	
	public static Target DEPOSITO_PLAZO = Target.the("Menu Deposito a Plazo").located(By.xpath("//div[contains(text(),'Depósitos a Plazo')]"));

	public static Target OPCION_MENU;
	
	public static Target setOpcionMenu(String opcion) {
		OPCION_MENU = Target.the("Menu" + opcion).located(By.xpath("//div[contains(text(),'" + opcion + "')]"));
		return OPCION_MENU;
	}
	
}
