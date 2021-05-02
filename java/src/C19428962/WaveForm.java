package C19428962;

import processing.core.*;


public class WaveForm
{
    MyVisual bk; 
    float cy = 10;

    float yc = 10;

    public WaveForm(MyVisual bk)
    {
        this.bk = bk;
        cy = this.bk.height / 4;

        yc = this.bk.height / 4;
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
            bk.line(i, 40, i, 40 + 40 * bk.getAudioBuffer().get(i));
        }

        for(int i = 0 ; i < bk.getAudioBuffer().size() ; i ++)
        {
            bk.stroke(
                PApplet.map(i, 0, bk.getAudioBuffer().size(), 0, 225)
                , 255
                , 255
            );
            bk.line(i, 600, i, 600 + 600 * bk.getAudioBuffer().get(i));
        }


     



            
    }
}
