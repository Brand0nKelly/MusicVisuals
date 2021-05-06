package C19428962;

import processing.core.*;

public class Circle extends PApplet
{

MyVisual bk; 
float size = 400;
float angle = 0.3f;
public Circle(MyVisual bk)
{
    this.bk = bk;

    
}

public void render()
{
    bk.sphere(1 + bk.getSmoothedAmplitude() * 800);
    
    bk.colorMode(PApplet.HSB);
    bk.pushMatrix(); 
    bk.noFill();
    bk.translate(400, 100, -600);
    bk.stroke(PApplet.map(bk.getSmoothedAmplitude(),0, 1, 0, 255), 255, 255);
   
    for(int i = 0 ; i < bk.getAudioBuffer().size() ; i ++)
    {
        bk.ellipse(10 * bk.getAudioBuffer().get(i),10, 100,100);
    
    }
    bk.popMatrix();
    

    bk.pushMatrix(); 
    bk.noFill();
    bk.translate(600, 700, -600);
    bk.stroke(PApplet.map(bk.getSmoothedAmplitude(),0, 1, 0, 255), 255, 255);
   
    for(int i = 0 ; i < bk.getAudioBuffer().size() ; i ++)
    {
        bk.ellipse(10 * bk.getAudioBuffer().get(i),10, 100,100);
        
    
    }
    bk.popMatrix();



    bk.pushMatrix(); 
    bk.noFill();
    bk.translate(800, 100, -600);
    bk.stroke(PApplet.map(bk.getSmoothedAmplitude(),0, 1, 0, 255), 255, 255);
   
    for(int i = 0 ; i < bk.getAudioBuffer().size() ; i ++)
    {
        bk.ellipse(10 * bk.getAudioBuffer().get(i),10, 100,100);
    
    }
    bk.popMatrix();
   
}


}
