package general;
import Poderes.Powerup;
import Tanque.Enemigo;
import Tanque.Jugador;

public class Partida {
	protected Jugador miJugador;
	protected Enemigo[] misEnemigos;
	protected Celda[][] mapa;
	protected Powerup[] miPowerup;
	protected int puntos;
	

	public Partida(){
		misEnemigos= new Enemigo[16];
		mapa= new Celda[16][16];
		miPowerup= new Powerup[6];
		miJugador=new Jugador();
	}

	public void gameOver();
}
