package C19428962;

import processing.core.*;


public class WaveForm
{
    MyVisual bk; 

    float cy = 0;

    float yc = 0;

    public WaveForm(MyVisual bk)
    {
        this.bk = bk;

        cy = this.bk.height / 4;

        cy = this.bk.width / 4;

    
    }

    public void render()
    {
        bk.colorMode(PApplet.HSB);
        for(int i = 0 ; i < bk.getAudioBuffer().size() ; i ++)
        {
            bk.stroke(
                PApplet.map(i, 0, bk.getAudioBuffer().size(), 0, 225)
                , 255
                , 255
            );
            bk.line(i, cy, i, cy + cy * bk.getAudioBuffer().get(i));

            bk.line(i, cy *2, i, cy *2 + cy * bk.getAudioBuffer().get(i));
        }
  
    }
}
