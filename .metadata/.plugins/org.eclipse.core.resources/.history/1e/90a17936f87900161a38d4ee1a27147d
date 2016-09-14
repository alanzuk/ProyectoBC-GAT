package Tanque;
import general.*;
import Proyectil.Proyectil;

public class Rapido extends Enemigo {

	
	
	public Rapido(Celda u)
	{
		 recompensa=200;
		 velocidadMov=3;
		 velocidadDisp=2;
		 ubicacion=u;
		 x=ubicacion.getX();
		 y=ubicacion.getY();
		 aguante=1;
		
	}
	@Override
	public Proyectil disparar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void moverse(int d) {
		switch(d){
		
		 case 1:
			y+=5;
		 	break;
		 case 2:
			 y-=5;
			 break;
		 case 3:
			 x+=5;
			 break;
		 case 4:
			 x-=5;
			 break;
		
		}
		
	}
	public Celda getUbicacion() {
		return ubicacion;
	}


}
