package choucair.myextra.util;

import choucair.myextra.model.Credenciales;

public enum InformacionAcceso {
	USUARIO (new Credenciales("CYEARIAS", "pruebas07"));
	
	private Credenciales credenciales;
	
	InformacionAcceso (Credenciales credenciales){
		this.credenciales = credenciales;
	}
	
	public Credenciales getCredenciales() {
		return credenciales;
	}

}
