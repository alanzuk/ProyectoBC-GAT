package Tanque;
import general.*;
import Proyectil.Proyectil;

public class Blindado extends Enemigo{
	private int contador;
	
	public Blindado(Celda u)
	{
		 recompensa=400;
		 velocidadMov=1;
		 velocidadDisp=2;
		 ubicacion=u;
		 aguante=4;
		 contador=0;
		 direccion=2;
	}
	
	
	@Override
	public Proyectil disparar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void moverse(int d) {
		if(contador%10==0){
			direccion=d;
		}
		contador++;
		switch(direccion){
		case 1:{ ubicacion.moverY(-(velocidadMov/10)); break;}
		 case 2:{ ubicacion.moverY(velocidadMov/10); break; }
		 case 3:{ ubicacion.moverX(velocidadMov/10); break; }
		 case 4:{ ubicacion.moverX(-(velocidadMov/10)); break;}
		}
		
		
	}

	public Celda getUbicacion() {
		return ubicacion;
	}

}
