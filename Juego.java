package DesarrolloJuego;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class Juego extends JPanel{
	COVID covid = new COVID(this);
	COVID covid1 = new COVID(this);
	COVID covid2 = new COVID(this);
	Fondo fondo = new Fondo(this);
	
	public Juego() {
	}
	
	public void mover() {
		covid.mover();
	}
	
	
	public void mover1() {
		covid1.mover();
	}
	
	public void mover2() {
		covid2.mover();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		dibuja(g2);
	}
	
	public void dibuja (Graphics2D g) {
		fondo.paint(g);
		covid.paint(g);
		covid1.paint(g);
		covid2.paint(g);
		mover();

	}

}
