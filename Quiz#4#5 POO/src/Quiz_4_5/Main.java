
package Quiz_4_5;



public class Main {

	

	public static void main(String[] args) {
		
		Super_Heroe SuperMan = new Super_Heroe("Kryptonianos","SuperMan");
		
		SuperMan.setCaracteristica("Pelo");
		SuperMan.setCaracteristica("Manos");
		SuperMan.setCaracteristica("Cabeza");
		SuperMan.setCaracteristica("Ojos");
		
		// Y mas caracteristicas propias de la especie
		
		SuperMan.setPoder("Volar");
		SuperMan.setPoder("Ojos Lacer");
		SuperMan.setPoder("Super Fuerza");
		SuperMan.setPoder("Super Vision xd");
		
		// Y mas caracteristicas del super hombre
		
		System.out.println("Especie: " +SuperMan.getEspecie());
		System.out.println("Caracteristicas de especie: " +SuperMan.getCaracteristicas());
		System.out.println("Nombre de Heroe: " +SuperMan.getNombre());
		System.out.println("Poderes del heroe: " +SuperMan.getPoderes());

	}

}
