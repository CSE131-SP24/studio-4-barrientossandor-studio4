package studio4;

import java.awt.Color;
import edu.princeton.cs.introcs.StdDraw;


public class Flag {

public static void main(String[] args) {
	
StdDraw.clear();
Color purple = new Color(224, 131, 235);
StdDraw.setPenColor(purple);
StdDraw.filledRectangle(3, 3, 3, 3);

Color turqoise = new Color(16, 232, 214);
StdDraw.setPenColor(turqoise);
StdDraw.filledRectangle(0.5, 0.5, 0.03, 0.15);

//StdDraw.arc(0.0, 0.0, 1.0, 0, 90);
double[] x = { 0.2, 0.4, 0.5, 0.2};
double[] y = {0.6, 0.7, 0.6, 0.4};
StdDraw.filledPolygon(x, y);
StdDraw.filledPolygon(x, y);

		
	}
}
