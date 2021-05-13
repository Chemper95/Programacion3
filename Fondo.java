package DesarrolloJuego;

import java.awt.*;
import javax.swing.*;

public class Fondo {
	Juego covidjuego;
	int anchof = 600;
	int largof = 700;
	int x = 0;
	int y = 0;
	
	public Fondo(Juego covidjuego) {
		this.covidjuego = covidjuego;
	}

	public void paint(Graphics2D g) {
		ImageIcon fondo = new ImageIcon(getClass().getResource("/JuegoCovid/background.png"));
		g.drawImage(fondo.getImage(), x, y, anchof, largof, null);
	}
}
