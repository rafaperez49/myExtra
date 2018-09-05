package choucair.myextra.interactions;

import net.serenitybdd.screenplay.Tasks;

public class Escribir {
	
	private String texto;
	
	public Escribir(String texto) {
		this.texto = texto;
	}

	public static Escribir elTexto(String texto) {
		return new Escribir(texto);
	}
	
	public EscribirTexto en(int fila, int columna)
	{
		return Tasks.instrumented(EscribirTexto.class, texto, fila, columna);
	}
	

}
