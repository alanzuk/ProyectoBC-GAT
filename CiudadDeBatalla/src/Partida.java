
public class Partida {
	protected Jugador miJugador;
	protected Enemigo[] misEnemigos;
	protected Celda[][] mapa;
	protected Powerup[] miPowerup;

	public Partida(){
		misEnemigos= new Enemigo[16]();
		mapa= new Celda[16][16]();
		miPowerup= new Powerup[6]();
	}

	public void gameOver();
}
