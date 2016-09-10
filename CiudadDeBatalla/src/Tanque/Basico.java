package Tanque;

import Proyectil.Proyectil;
import general.Celda;

public class Basico extends Enemigo {
	

	public Basico(Celda u)
	{
		 recompensa=100;
		 velocidadMov=1;
		 velocidadDisp=1;
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
