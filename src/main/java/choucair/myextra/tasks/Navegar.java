package choucair.myextra.tasks;

import org.openqa.selenium.Keys;

import choucair.myextra.interactions.Digitar;
import choucair.myextra.interactions.Escribir;
import choucair.myextra.interactions.Ir;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class Navegar implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Escribir.elTexto("1").en(8, 10));
		actor.attemptsTo(Digitar.laTecla(Keys.ENTER));
		actor.attemptsTo(Escribir.elTexto("1").en(18, 8));
		actor.attemptsTo(Digitar.laTecla(Keys.ENTER));
		actor.attemptsTo(Escribir.elTexto("1").en(13, 9));
		actor.attemptsTo(Digitar.laTecla(Keys.ENTER));
		actor.attemptsTo(Ir.hastaVerTexto("SQL").en(1, 50));
		
	}

	public static Navegar aUnMenu() {
		
		return Tasks.instrumented(Navegar.class);
	}

	
}
