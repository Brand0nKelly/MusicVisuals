package C19428962;

import processing.core.*;

public class CubeVisual extends PApplet
{

MyVisual bk; 
float angle = 0.2f;
float size = 700;



public CubeVisual(MyVisual bk)
{
    this.bk = bk; 
}


public void render()
{
    bk.calculateAverageAmplitude();
    bk.stroke(PApplet.map(bk.getSmoothedAmplitude(),0, 1, 0, 255), 255, 255);
    bk.strokeWeight(1);
    bk.pushMatrix();
    bk.noFill();
    bk.colorMode(PApplet.HSB);
    bk.translate(400, 100, -600);
    bk.rotateX(angle);
    bk.rotateZ(angle); 
    bk.box(10 + bk.getSmoothedAmplitude() * size); 
    bk.popMatrix();
    angle += 0.02f;


    bk.calculateAverageAmplitude();
    bk.stroke(PApplet.map(bk.getSmoothedAmplitude(),0, 1, 0, 255), 255, 255);
    bk.strokeWeight(1);
    bk.pushMatrix();
    bk.noFill();
    bk.colorMode(PApplet.HSB);
    bk.translate(600, 700, -600);
    bk.rotateX(angle);
    bk.rotateZ(angle); 
    bk.box(10 + bk.getSmoothedAmplitude() * size); 
    bk.popMatrix();
    angle += 0.02f;


    bk.calculateAverageAmplitude();
    bk.stroke(PApplet.map(bk.getSmoothedAmplitude(),0, 1, 0, 255), 255, 255);
    bk.strokeWeight(1);
    bk.pushMatrix();
    bk.noFill();
    bk.colorMode(PApplet.HSB);
    bk.translate(800, 100, -600);
    bk.rotateX(angle);
    bk.rotateZ(angle); 
    bk.box(10 + bk.getSmoothedAmplitude() * size); 
    bk.popMatrix();
    angle += 0.02f;

    


}

    
}