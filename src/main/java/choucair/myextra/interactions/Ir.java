package choucair.myextra.interactions;

import net.serenitybdd.screenplay.Tasks;

public class Ir{

	private String texto;
	
	public Ir(String texto) {
		
		this.texto = texto;
	}

	public static Ir hastaVerTexto (String texto)
	{
		return new Ir(texto);
		
	}
	
	public Hasta en(int fila, int columna) {
		return Tasks.instrumented(Hasta.class, texto, fila, columna);
		
	}
	
	

}
