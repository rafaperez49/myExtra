# language:es
#Author: yarias@choucairtesting.com

Característica: Automation Demo Site
  	Como usuario 
		Quiero realizar el regitro en Automation Demo Site
		A traves del diligenciamiento del formulario
@caso1
  Esquema del escenario: Relizar el registro en la pagina Automation Demo Site
    Dado que Carlos quiere acceder al Sitio Automation Demo Site
    Cuando el realiza el registro en la página
     |first_name | last_name | address | mail | phone | languages | skills | conuntry | select_conuntry | date_birth_year   | date_birth_month | date_birth_day | password | confirm_password|
	   |<first_name> | <last_name> | <address> | <mail> | <phone> | <languages> | <skills> | <conuntry> | <select_conuntry>   | <date_birth_year> | <date_birth_month> | <date_birth_day> | <password> | <confirm_password>|
		 Entonces el verifica que se carga la pantalla con texto Double Click on Edit Icon to EDIT the Table Row      
 
 Ejemplos:
  |first_name | last_name | address | mail | phone | languages | skills | conuntry | select_conuntry | date_birth_year      | date_birth_month | date_birth_day | password | confirm_password|
	|Yeison | Arias | Calle 1 N 1 1 | yfarias2@correo.co | 3013696970 | Arabic | C++ | Colombia | Australia | 1981 | February | 5 | Password1* | Password1*|    
  |Yeison | Arias | Calle 1 N 1 1 | yfarias2@correo.co | 3013696970 | Arabic | C++ | Colombia | Australia | 1981 | February | 5 | Password1* | Password1*|    
   
