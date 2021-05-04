package C19428962;

import processing.core.*;

public class Triangle extends PApplet {

    MyVisual bk; 

    public Triangle(MyVisual bk)
    {
        this.bk = bk;
    
        
    }

    public void render()
    {
        bk.calculateAverageAmplitude();
        
       
        

    }
}