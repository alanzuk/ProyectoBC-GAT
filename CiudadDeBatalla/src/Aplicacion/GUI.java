package Aplicacion;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import general.Partida;

public class GUI implements KeyListener  {
	private Partida partida;
	private JFrame frame;
	private JLabel lblPlayer;
	private JLabel lblEnemigo[];
	private static int tamanio_celda=40;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		//Creacion de Partida
		
		partida=new Partida();
		

		
		//Creacion del Frame
		
		frame = new JFrame();
		frame.setBounds(100, 100, 17*tamanio_celda, 17*tamanio_celda);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);		
		frame.addKeyListener(this);
	    
	    //Creacion Jugador 
	    System.out.println(getClass());
	    lblPlayer = new JLabel(new ImageIcon(new ImageIcon(getClass().getResource("Jugador1.png")).getImage().getScaledInstance(tamanio_celda, tamanio_celda, Image.SCALE_SMOOTH)));
		lblPlayer.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayer.setBounds(200,601,tamanio_celda, tamanio_celda);
		frame.getContentPane().add(lblPlayer);

		//Creo los Enemigos a partir del arreglo
		
		lblEnemigo = new JLabel[16];
		
		for(int i=0;i<lblEnemigo.length;i++){
			lblEnemigo[i] = new JLabel(new ImageIcon(new ImageIcon(getClass().getResource("Jugador1.png")).getImage().getScaledInstance(tamanio_celda, tamanio_celda, Image.SCALE_SMOOTH)));
			lblEnemigo[i].setHorizontalAlignment(SwingConstants.CENTER);
			lblEnemigo[i].setBounds((int)(tamanio_celda*(partida.getEnemigo(i).getX())),(int) (tamanio_celda*(partida.getEnemigo(i).getY())),tamanio_celda, tamanio_celda);
			frame.getContentPane().add(lblEnemigo[i]);
		}
		
		

		
		
		
		
		
	}

	//Oyente Teclado
	
	public void refreshGUI(){
		for(int i=0;i<lblEnemigo.length;i++)
			lblEnemigo[i].setBounds((int)(tamanio_celda*(partida.getEnemigo(i).getX())),(int) (tamanio_celda*(partida.getEnemigo(i).getY())),tamanio_celda, tamanio_celda);
		
		lblPlayer.setBounds((int) (tamanio_celda*(partida.getJugador().getX())),(int) (tamanio_celda*(partida.getJugador().getY())),tamanio_celda, tamanio_celda);
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		
		partida.mover();
		
		switch(e.getKeyCode()){
		case (KeyEvent.VK_UP):{ 
			partida.mover(1); 
			refreshGUI();
			break;
			}
		case (KeyEvent.VK_DOWN):{
			partida.mover(2);
			refreshGUI();
			break;
			}
		case (KeyEvent.VK_RIGHT):{
			partida.mover(3);
			refreshGUI();
			break;
			}
		case (KeyEvent.VK_LEFT):{
			partida.mover(4);
			refreshGUI(); 
			break;
			}
		 
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
