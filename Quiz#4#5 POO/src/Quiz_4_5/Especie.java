package Quiz_4_5;

import java.util.ArrayList;

public class Especie implements SerVivo{
	private String Especie;
	private ArrayList<String> Caracteristicas = new ArrayList<String>();

	public Especie(String pEspecie) {
		this.Especie = pEspecie;
		
	}
	
	public String getEspecie() {
		return Especie;
	}
	
	public ArrayList<String> getCaracteristicas() {
		return Caracteristicas;
	}

	public void setCaracteristica(String pCaracteristica) {
		Caracteristicas.add(pCaracteristica);
	}

	



}
