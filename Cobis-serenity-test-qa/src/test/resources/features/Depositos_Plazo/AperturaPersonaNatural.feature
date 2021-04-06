#language : es
#Author : apena@cobiscorp.com.co

Característica: Apertura de persona natural titular de la cuenta y así como también la  descarga e impresión de Contrato de Apertura LP
  
	COMO usuario de la plataforma COBIS, usando filial, oficina y rol del módulo de cuentas
	QUIERO aperturar una cuenta de ahorros persona natural 
	PARA  evidenciar la creación correcta de cuenta de ahorros
	
  @featureApertura
  Escenario: Aperturar una cuenta de ahorros persona natural LP
		Dado que usuario realiza Login en COBIS
		Cuando el navega  a la Opción de Cuenta- Apertura de Cuenta en Paso1
		Y selecciona rol "Titular”
		Y realiza la Búsqueda de Cliente “Persona Natural” 
		Y diligencia en Paso 2 sección de Datos Generales
		Entonces se emite mensaje de cuenta creada exitosasmente y se habilita botón Imprimir