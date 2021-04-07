#language : es
#Author : apena@cobiscorp.com.co

Característica: Crear Apertura Deposito a Plazo
  
  Como usuario de la plataforma COBIS
  Quiero realizar una apertura de deposito a Plazo a un cliente
  Para evidenciar en el sistema la correspondiente creación de la apertura del cliente asociado

Antecedentes: El usuario ingresa a cobis
   Dado que Alex realiza Login en COBIS

  @feature
  Esquema del escenario: El usuario crea una Apertura Deposito a Plazo
    Dado navega desde menu hacia Apertura
    Cuando abre la opcion cliente
    Y realiza la busqueda de un <cliente>
    Y realiza el registro de un nuevo DPF para un cliente 
    Entonces se debe mostrar la creacion de la Apertura al cliente previamente seleccionado
   		Ejemplos:
    | cliente      | 
    | "123456789"  |  