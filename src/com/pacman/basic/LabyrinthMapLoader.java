package com.pacman.basic;

public class LabyrinthMapLoader {
	private static LabyrinthMapLoader INSTANCE;
	
	private LabyrinthMapLoader() {
		
	}
	public static LabyrinthMapLoader getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new LabyrinthMapLoader();
		}
		return INSTANCE;
	}
	public LabyrinthMap loadMapFromFile(String path) {
		return null;
		
	}
	public LabyrinthMap createDefaultMap() {
		// TODO Auto-generated method stub
		return null;
	}
}
