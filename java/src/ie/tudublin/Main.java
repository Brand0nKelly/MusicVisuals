package ie.tudublin;

import C19428962.*;
//import C19428962.CubeVisual;
//import C19428962.MyVisual;
//import example.RotatingAudioBands;


public class Main
{	

	public void startUI()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new MyVisual());	
			
	}

	public static void main(String[] args)
	{
		Main main = new Main();
		main.startUI();			
	}
}