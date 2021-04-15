package DesarrolloJuego;

import javax.swing.JFrame;

public class JuegoFinCovid {

	public static void main (String[] args) {
		JFrame frame = new JFrame("Juego Fin COVID");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new Background());
		frame.pack();
		frame.setVisible(true);
	}
}
