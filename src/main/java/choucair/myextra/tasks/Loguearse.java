package choucair.myextra.tasks;

import org.openqa.selenium.Keys;

import choucair.myextra.interactions.Digitar;
import choucair.myextra.interactions.Escribir;
import choucair.myextra.interactions.Ir;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class Loguearse implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Escribir.elTexto("CDRORREGO").en(6, 53));
		actor.attemptsTo(Escribir.elTexto("tester07").en(7, 53));
		actor.attemptsTo(Digitar.laTecla(Keys.ENTER));
		actor.attemptsTo(Ir.hastaVerTexto("Ubicarse:").en(5, 7));
	
		
		
		}

	public static Loguearse enMyExtra() {
		
		return Tasks.instrumented(Loguearse.class);
	}

}
