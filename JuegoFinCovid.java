package DesarrolloJuego;

import javax.swing.JFrame;

public class JuegoFinCovid {

	public static void main (String[] args) {
		JFrame frame = new JFrame("Juego Fin COVID");
		Juego juegocovid = new Juego ();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		frame.setSize(600,700);
		frame.setLocation(100,50);
		
		while (true) {
			juegocovid.repaint();
			try {
				Thread.sleep(10);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
