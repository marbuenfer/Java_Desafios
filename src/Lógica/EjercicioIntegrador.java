package Lógica;

public class EjercicioIntegrador {
	public static void main(String[] args) {
		Bulbasur bulbasur = new Bulbasur();
		Charmander charmander = new Charmander();
		Pikachu pikachu = new Pikachu();
		Squirtle squirtle = new Squirtle();
		
		squirtle.atacarArannazo();
		squirtle.atacarBurbuja();
		charmander.atacarMordisco();
		charmander.atacarAscuas();
		bulbasur.atacarParalizar();
		bulbasur.atacarPlacaje();
		pikachu.atacarImpactTrueno();
		pikachu.atacarPunnoTrueno();
	}
}
