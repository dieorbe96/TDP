package juego;

import java.util.Random;

import javax.swing.ImageIcon;

public class Malo extends Entidad{
	
	public Malo(int velocidad, int x, int y) {
		super(velocidad, x, y);
		
		this.image[0] = new ImageIcon(this.getClass().getResource("/BattleCity/up2.png"));
		this.image[1] = new ImageIcon(this.getClass().getResource("/BattleCity/down2.png"));
		this.image[2] = new ImageIcon(this.getClass().getResource("/BattleCity/left2.png"));
		this.image[3] = new ImageIcon(this.getClass().getResource("/BattleCity/right2.png"));
	}
	
	public void mover(){
		Random r = new Random();
		
		int dir = r.nextInt(4);
		
		switch (dir) {
			case 0 : //Arriba
				pos.setLocation(pos.x, pos.y - velocidad);
				break;
			case 1 : //Abajo
				pos.setLocation(pos.x, pos.y + velocidad);
				break;
			case 2 : //Izquierda
				pos.setLocation(pos.x - velocidad, pos.y);
				break;
			case 3 : //Derecha
				pos.setLocation(pos.x + velocidad, pos.y);
				break;
		}
		
		super.mover(dir);
	}
}
