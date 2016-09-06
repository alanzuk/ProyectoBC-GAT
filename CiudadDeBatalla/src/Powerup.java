
public abstract class Powerup {
	private Celda ubicacion;
	
	public abstract void efecto();
	public Celda getUbicacion(){
		return ubicacion;
	}
}
