package com.pacman.basic;

import com.pacman.engine.LabyrinthObjectVisitor;

public class Checkpoint extends LabyrinthObject{
	private boolean conquered;
	
	Checkpoint(int x, int y) {
		super(x, y);
	}
	public boolean isConquered() {
		return conquered;
	}
	void conquer() {
		conquered = true;
	}
	@Override
	public void accept(LabyrinthObjectVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}
}
