#language : es
#Author : apena@cobiscorp.com.co

Característica: Realizar la creación de asiento contable  Mayorizado 
  
		COMO usuario de la plataforma COBIS, usando filial, oficina y rol del módulo de contabilidad 
		QUIERO crear un asiento contable mayorizado   
		PARA  evidenciar la creación correcta del asiento contable 
	
  @featureComprobanteContable
  Escenario: Crear un asiento contable mayorizado  
		Dado que usuario realiza Login en COBIS
		Cuando ingresa y selecciona los valores (Fecha, Descripción, Oficina de origen.  Área de origen y checkbox “Mayorizado”) de la sección “Comprobante contables”
		Y realiza  el ingreso en la grilla, registro de Cuenta Débito por un  valor X
		Y realiza el ingreso en la grilla, registro de Cuenta Crédito por un valor X
		Y se hace click en el boton Guardar
		Entonces se emite mensaje de “Operación realizada con éxito” 
 