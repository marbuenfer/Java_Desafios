package Lógica;

public abstract class Pokemon {
	int numPodedex;
	String nombre;
	double peso;
	String sexo;
	int temporada;
	
	//métodos abstractos que se implementarán en cada una de las clases heredadas
	protected abstract void atacarPlacaje();
	protected abstract void atacarArannazo();
	protected abstract void atacarMordisco();
	 
}
