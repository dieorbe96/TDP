package juego;

import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

public class Jugador extends Entidad{

	public Jugador(int velocidad, int x, int y) {
		super(velocidad, x, y);
		
		this.image[0] = new ImageIcon(this.getClass().getResource("/BattleCity/up.png"));
		this.image[1] = new ImageIcon(this.getClass().getResource("/BattleCity/down.png"));
		this.image[2] = new ImageIcon(this.getClass().getResource("/BattleCity/left.png"));
		this.image[3] = new ImageIcon(this.getClass().getResource("/BattleCity/right.png"));
	}

	public void mover(int dir){
		switch (dir){
			case KeyEvent.VK_UP : //Arriba
				pos.setLocation(pos.x, pos.y - velocidad);
				super.mover(0);
				break;
			case KeyEvent.VK_DOWN : //Abajo
				pos.setLocation(pos.x, pos.y + velocidad);
				super.mover(1);
				break;
			case KeyEvent.VK_LEFT : //Izquierda
				pos.setLocation(pos.x - velocidad, pos.y);
				super.mover(2);
				break;
			case KeyEvent.VK_RIGHT : //Derecha
				pos.setLocation(pos.x + velocidad, pos.y);
				super.mover(3);
				break;
		}
	}
}
