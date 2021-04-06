#language : es
#Author : apena@cobiscorp.com.co
Característica: Hacer Login
  
  Como usuario de la plataforma COBIS
  Quiero realizar login en el sistema
  Para validar corerecto login y Logout con el usaurio establecido

  #@feature
  Escenario: Usuario Ingresar desde la pagina de Login de COBIS
    Dado que usuario realiza Login en COBIS
    Cuando él cierra sesión
    Entonces se debe mostrar la pagina Login de COBIS