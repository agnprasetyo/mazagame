package Maze;

import java.awt.*;
import java.io.*;
import java.util.*;

import javax.swing.ImageIcon;

public class Map {
	
	private Scanner m;
	private String Map[] = new String[35];
	
	private Image grass,
				  finish,
				  wall;
	
	public Map() {
		
		ImageIcon img = new ImageIcon("G://JAVA//TubesTBA//src//img//rumputortembok.png");
		grass =  img.getImage();
		img = new ImageIcon("G://JAVA//TubesTBA//src//img//tembokrumput.png");
		wall = img.getImage();
		img = new ImageIcon("G://JAVA//TubesTBA//src//img//rumputortembok2.png");
		finish = img.getImage();
		
		openFile();
		readFile();
		closeFile();
	}
	
	public Image getGrass() {
		return grass;
	}
	
	public Image getWall() {
		return wall;
	}
	
	public Image getFinish() {
		return finish;
	}
	
	public String getMap(int x, int y) {
		String index = Map[y].substring(x, x + 1);
		return index;
	}
	
	public void openFile() {
		
		try {
			m = new Scanner(new File("G://JAVA//TubesTBA//src//img//Map2.txt"));
		}catch(Exception e) {
			System.out.println("error loading map");
		}
	}
	
	public void readFile() {
		while(m.hasNext()) {
			for(int i = 0; i < 16; i++) {
				Map[i] = m.next();
			}
		}
	}
	
	public void closeFile() {
		m.close();
	}

}
