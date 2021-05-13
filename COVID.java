package DesarrolloJuego;

import java.awt.*;
import javax.swing.*;

public class COVID{
	Juego covidjuego;
	
	int ancho = 75;
	int largo = 70;
	static int x_ini = 200;
	static int y_ini = 500;
	static int x_aux = -5;
	static int y_aux = -5;

	public COVID(Juego covidjuego) {
		this.covidjuego = covidjuego;
	}
	
	
public void moverderecha() {
	if(x_ini<=200) {
		x_ini = 600;
	}
	else {
		x_ini+=x_aux;
	}
}

public void moverizquierda() {
	if(x_ini<=200) {
		x_ini = 600;
	}
	else {
		x_ini-=x_aux;
	}
}


public void moverarriba() {
	if(y_ini<=500) {
		y_ini = 800;
	}
	else {
		y_ini+=y_aux;
	}
}

public void moverabajo() {
	if(y_ini<=500) {
		y_ini = 800;
	}
	else {
		y_ini-=y_aux;
	}
}



public void paint(Graphics2D g) {
	ImageIcon covid = new ImageIcon(getClass().getResource("/JuegoCovid/covid.png"));
	g.drawImage(covid.getImage(),x_ini, y_ini, ancho, largo, null);
}
}
