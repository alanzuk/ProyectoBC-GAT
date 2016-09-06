
public abstract class Tanque extends Destructible {
	private int velocidadMov;
	private int velocidadDisp;
	private char direccion;
	private Celda ubicacion;//  celda?????
	
	//metodos
	public abstract Proyectil disparar(int nivel,int tipo);
	public abstract void moverse();
	public Celda getUbicacion(){
		return ubicacion;
	}

}
