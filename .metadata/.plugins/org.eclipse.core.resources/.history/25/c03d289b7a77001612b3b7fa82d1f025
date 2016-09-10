package Tanque;
import general.*;
import Proyectil.Proyectil;

public class Blindado extends Enemigo{

	
	public Blindado(Celda u)
	{
		 recompensa=400;
		 velocidadMov=1;
		 velocidadDisp=2;
		 ubicacion=u;
		 x=ubicacion.getUbicacion().getX();
		 y=ubicacion.getUbicacion().getY();
		 aguante=4;
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
