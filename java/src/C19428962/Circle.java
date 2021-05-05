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
    bk.colorMode(PApplet.HSB);
    
    bk.noFill();
    bk.translate(400, 200, -600);
    bk.stroke(PApplet.map(bk.getSmoothedAmplitude(),0, 1, 0, 255), 255, 255);
   
    for(int i = 0 ; i < bk.getAudioBuffer().size() ; i ++)
    {
        bk.ellipse(10 * bk.getAudioBuffer().get(i),10, 100,100);
      
    }

    bk.pushMatrix();
    bk.box(10 + bk.getSmoothedAmplitude() * 600);
  
    bk.popMatrix();
   
}


}
