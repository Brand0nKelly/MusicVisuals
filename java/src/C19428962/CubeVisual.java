package C19428962;

import processing.core.*;

public class CubeVisual extends PApplet
{

MyVisual bk; 
float angle = 0.3f;
float size = 300;


public CubeVisual(MyVisual bk)
{
    this.bk = bk;
}

public void render()
{
    bk.calculateAverageAmplitude();
    bk.stroke(0);
    bk.strokeWeight(1);
    bk.pushMatrix();
    bk.colorMode(PApplet.HSB);
    bk.translate(400, 200, -600);
    bk.rotateX(angle);
    bk.rotateZ(angle); 
    bk.box(10 + bk.getSmoothedAmplitude() * size); 
    bk.popMatrix();
    angle += 0.02f;


    bk.calculateAverageAmplitude();
    bk.stroke(0);
    bk.strokeWeight(1);
    bk.pushMatrix();
    bk.colorMode(PApplet.HSB);
    bk.translate(600, 800, -600);
    bk.rotateX(angle);
    bk.rotateZ(angle); 
    bk.box(10 + bk.getSmoothedAmplitude() * size); 
    bk.popMatrix();
    angle += 0.02f;


    bk.calculateAverageAmplitude();
    bk.stroke(0);
    bk.strokeWeight(1);
    bk.pushMatrix();
    bk.colorMode(PApplet.HSB);
    bk.translate(800, 200, -600);
    bk.rotateX(angle);
    bk.rotateZ(angle); 
    bk.box(10 + bk.getSmoothedAmplitude() * size); 
    bk.popMatrix();
    angle += 0.02f;

    


}

    
}