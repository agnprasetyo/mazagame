package Maze;

import javax.swing.*;

public class Maze {
	public static void main(String[] args) {
		new Maze();
	}
	
	public Maze() {
		JFrame f = new JFrame();
		f.setTitle("Maze Game");
		f.add(new Board());
		f.setSize(800, 450);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
