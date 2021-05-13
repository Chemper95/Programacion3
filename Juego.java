package DesarrolloJuego;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class Juego extends JPanel{
	COVID covid = new COVID(this);
	Fondo fondo = new Fondo(this);
	
	public Juego() {
	}
	
	public void moverderecha() {
		covid.moverderecha();
	}
	
	public void moverizquierda() {
		covid.moverizquierda();
	}
	
	public void moverarriba() {
		covid.moverarriba();
	}
	
	public void moverabajo() {
		covid.moverabajo();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		dibuja(g2);
	}
	
	public void dibuja (Graphics2D g) {
		fondo.paint(g);
		covid.paint(g);
		moverabajo();
		moverarriba();
		moverderecha();
		moverizquierda();
	}

}
