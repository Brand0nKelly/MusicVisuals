package C19428962;

import processing.core.*;

public class Triangle extends PApplet {

    MyVisual bk; 
    float angle = 0.3f;
    public Triangle(MyVisual bk)
    {
        this.bk = bk;
    
        
    }

    public void render()
    {

        bk.colorMode(PApplet.HSB);
        bk.calculateAverageAmplitude();
        
        bk.beginShape(TRIANGLES);
        
        

    }
}