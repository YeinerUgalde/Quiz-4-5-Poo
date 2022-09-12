package Quiz_4_5;

import java.util.ArrayList;

public class Super_Heroe extends Especie {
	private String Nombre;
	private ArrayList<String> Poderes = new ArrayList<String>();
	
	public Super_Heroe(String pEspecie , String pNombre) {
		super(pEspecie);
		this.Nombre = pNombre;
	}

	public ArrayList<String> getPoderes() {
		return Poderes;
	}

	public void setPoder(String pPoder) {
		Poderes.add(pPoder);
	}

	public String getNombre() {
		return Nombre;
	}

}
