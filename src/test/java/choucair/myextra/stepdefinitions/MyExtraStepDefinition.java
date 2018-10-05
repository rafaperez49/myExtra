package choucair.myextra.stepdefinitions;

import static org.hamcrest.Matchers.equalTo;

import org.openqa.selenium.WebDriver;

import choucair.myextra.questions.LaRespuesta;
import choucair.myextra.tasks.Abrir;
import choucair.myextra.tasks.Loguearse;
import choucair.myextra.tasks.Navegar;
import cucumber.api.java.Before;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class MyExtraStepDefinition {
	

	@Managed(driver="chrome")
	private WebDriver suNavegador;	
	private Actor rafa= Actor.named("Rafa");
	int a=10;
	int b=23;
	int c=30;
	int d=90;
	@Before public void setup()
	{
		rafa.can(BrowseTheWeb.with(suNavegador));
		a=50;
	}
	
	@Dado("^que Rafa desea realizar consultas en AS400, Rafa abre my extra$")
	public void que_Rafa_desea_realizar_consultas_en_AS_Rafa_abre_my_extra(){
		rafa.attemptsTo(Abrir.myExtra());
	}

	@Cuando("^él ingresa sus credenciales$")
	public void él_ingresa_sus_credenciales() {
		rafa.attemptsTo(Loguearse.enMyExtra());
	}
	
	@Cuando("^Navega en un menu$")
	public void navega_en_un_Menu()
	{
		rafa.attemptsTo(Navegar.aUnMenu());
	}

	@Entonces("^verifica que inició sesión correctamente$")
	public void verifica_que_inició_sesión_correctamente(){
		rafa.should(seeThat(LaRespuesta.es(), equalTo("Introducir sentencias SQL")));
	}

}
