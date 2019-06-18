package com.pacman.engine;

import java.util.Scanner;

import com.pacman.basic.Direction;
import com.pacman.basic.LabyrinthMap;

public class TextEngine extends GameEngine{
	public TextEngine(LabyrinthMap labyrinthMap) {
		super(labyrinthMap);
		// TODO Auto-generated constructor stub
	}
	private TextRenderManager renderManager;
	
	public Direction readCommandFromKeyboard(Scanner scanner) {
		Direction dir = null;
		switch(scanner.nextInt()) {
		case 1:
			return dir.UP;
		case 2:
			return dir.DOWN;
		case 3:
			return dir.RIGH;
		case 4:
			return dir.LEFT;
		}
		return dir;
	}
	public void gameLoop() {
		//printa lab;
		// le o comando do teclado;
		//atualiza mapa;
		//verifica se o lab foi completado
		Scanner scanner = new Scanner(System.in);
		LabyrinthMap labMap = getLabyrinthMap();
		Direction newDirection;
		while(!labMap.isDone()) {
			renderManager.render(labMap);
			newDirection = readCommandFromKeyboard(scanner);
			labMap.updateMap(newDirection);
		}
		System.out.println("Fim de jogo");
		scanner.close();
	}
	
}
