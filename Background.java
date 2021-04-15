package DesarrolloJuego;

import java.awt.*;
import javax.swing.*;

public class Background extends JPanel{
	private final int WIDTH=700, HEIGHT=700;
	private int x, y;
	private ImageIcon image;
	
	
public Background() {
	image = new ImageIcon("Backgroung.png");
	x=0;
	y=0;
	setBackground(Color.red);
	setPreferredSize(new Dimension(WIDTH, HEIGHT));
}

public void paintComponent(Graphics page) {
	super.paintComponent(page);
	image.paintIcon(this, page,x,y);
}
}
