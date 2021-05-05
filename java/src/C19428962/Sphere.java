package C19428962;

import processing.core.*;


public class Sphere extends PApplet
{

    MyVisual bk; 
    float angle = 0.3f;
    float size = 400;

    public Sphere(MyVisual bk)
    {
        this.bk = bk;
    
        
    }
    public void render()
    {
        bk.colorMode(PApplet.HSB);
        bk.pushMatrix();
        
        bk.translate(400, 200, -600);
        bk.stroke(PApplet.map(bk.getSmoothedAmplitude(),0, 1, 0, 255), 255, 255);
        bk.rotateX(angle);
        bk.rotateY(angle);
        bk.noFill();
        bk.sphere(10 + bk.getSmoothedAmplitude() * size);
        bk.popMatrix();
        angle += 0.02f;

        bk.colorMode(PApplet.HSB);
        bk.pushMatrix(); 
        bk.translate(600, 800, -600);
        bk.stroke(PApplet.map(bk.getSmoothedAmplitude(),0, 1, 0, 255), 255, 255);
        bk.rotateX(angle);
        bk.rotateY(angle);
        bk.noFill();
        bk.sphere(10 + bk.getSmoothedAmplitude() * size);
        bk.popMatrix();
        angle += 0.02f;



        bk.colorMode(PApplet.HSB);
        bk.pushMatrix();
        bk.translate(800, 200, -600);
        bk.stroke(PApplet.map(bk.getSmoothedAmplitude(),0, 1, 0, 255), 255, 255);
        bk.rotateX(angle);
        bk.rotateY(angle);
        bk.noFill();
        bk.sphere(10 + bk.getSmoothedAmplitude() * size);
        bk.popMatrix();
        angle += 0.02f;
    }
    
    
   
}