package L�gica;

public class Pikachu extends Pokemon implements IElectrico{
	//m�todos abstractos declarados en clase Pikachu
	@Override
	protected void atacarPlacaje() {
		System.out.println("Soy pokemon Pikachu y ah� va ataque Placaje");
	}
	@Override
	protected void atacarArannazo() {
		System.out.println("Soy pokemon Pikachu y ah� va ataque ara�azo");
	}

	@Override
	protected void atacarMordisco() {
		System.out.println("Soy pokemon Pikachu y ah� va ataque mordisco");
	}
	
	//m�todos declarados en interfaz IElectrico
	@Override
	public void atacarImpactTrueno() {
		System.out.println("Soy pokemon Pikachu y ah� va ataque impacto trueno");		
	}

	@Override
	public void atacarPunnoTrueno() {
		System.out.println("Soy pokemon Pikachu y ah� va ataque pu�o mordisco");
	}

	 
	
}
