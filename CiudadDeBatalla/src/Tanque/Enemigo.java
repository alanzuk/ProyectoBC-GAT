package Tanque;

import Proyectil.Proyectil;

public abstract class Enemigo extends Tanque{
	private int recompensa;
	
	
	
	
	public int getRecompensa(){
		return recompensa;
	}
	@Override
	public abstract Proyectil disparar();

	@Override
	public abstract  void moverse();

}
