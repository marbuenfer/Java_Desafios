package L�gica;

public abstract class Pokemon {
	int numPodedex;
	String nombre;
	double peso;
	String sexo;
	int temporada;
	
	//m�todos abstractos que se implementar�n en cada una de las clases heredadas
	protected abstract void atacarPlacaje();
	protected abstract void atacarArannazo();
	protected abstract void atacarMordisco();
	 
}
