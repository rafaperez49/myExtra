package choucair.myextra.interactions;

import java.io.IOException;

import choucair.myextra.util.Evidencia;
import choucair.myextra.util.MyExtra;
import choucair.myextra.util.ProcessUtility;
import choucair.myextra.util.myextra.Screen;
import choucair.myextra.util.myextra._Session;
import choucair.myextra.util.myextra._System;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class Iniciar implements Interaction{
	
	public static _System sSystem=null;
	public static Screen Screen=null;
	public static _Session Sess0=null;
	public static int g_HostSettleTime = 3000; 

	@Override
	public <T extends Actor> void performAs(T actor) {	try
	{
		if(ProcessUtility.isProcessRunning("EXTRA.exe"))
			MyExtra.cerrarMyExtraAbierto();

		MyExtra.abrirArchivoDeMyExtra("C:\\Users\\rperezr\\Desktop\\Calidad.EDP");
		Thread.sleep(5000);
		sSystem= MyExtra.crearSistema();
		Sess0=MyExtra.crearSesion(sSystem);
		Screen=MyExtra.crearPantalla(Sess0);
		sSystem.timeoutValue(g_HostSettleTime);
		Thread.sleep(3000);
		Evidencia.captureScreen();
	}catch (IOException | InterruptedException e) {
		
		e.printStackTrace();
	}
	}

	public static Iniciar attachmateMyExtra() {
		
		return new Iniciar();
	}

}
