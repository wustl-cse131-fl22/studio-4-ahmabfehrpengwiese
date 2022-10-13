package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setCanvasSize(768, 512);
		StdDraw.setPenColor(255, 109, 182);
		StdDraw.filledRectangle(0.25, 0.25, 0.25, 0.25);
		StdDraw.filledRectangle(0.75, 0.75, 0.25, 0.25);
		StdDraw.filledCircle(0.25, 0.75, 0.1);
		StdDraw.filledCircle(0.75, 0.25, 0.1);
		StdDraw.setPenColor(255, 255, 255);
		StdDraw.filledCircle(0.25, 0.25, 0.1);
		StdDraw.filledCircle(0.75, 0.75, 0.1);
	}
}