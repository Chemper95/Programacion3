package DesarrolloJuego;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class Juego extends JPanel{
	COVID covid = new COVID(this);
	Fondo fondo = new Fondo(this);
	
	public Juego() {
	}
	
	public void mover() {
		covid.mover();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		dibuja(g2);
	}
	
	public void dibuja (Graphics2D g) {
		fondo.paint(g);
		covid.paint(g);
		mover();
	}

}
