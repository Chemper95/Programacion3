package DesarrolloJuego;

import java.awt.*;
import javax.swing.*;

public class COVID2 {
Juego covidjuego;
	
	int ancho = 75;
	int largo = 70;
	static int x_ini = 200;
	static int y_ini = 500;
	static int x_aux = -5;

	public COVID2(Juego covidjuego) {
		this.covidjuego = covidjuego;
	}
	
	
public void mover2() {
	if(x_ini<=200) {
		x_ini = 600;
	}
	else {
		x_ini+=x_aux;
	}
}


public void paint(Graphics2D g) {
	ImageIcon covid = new ImageIcon(getClass().getResource("/JuegoCovid/covid.png"));
	g.drawImage(covid.getImage(),x_ini, y_ini, ancho, largo, null);
}
}
