package C19428962;

import ie.tudublin.*;
import ie.tudublin.Visual;
import ie.tudublin.VisualException;

public class MyVisual extends Visual
{    
    
    CubeVisual cv;

    public void settings()
    {
        size(1024, 500, P3D);
        
    }

    public void setup()
    {
        startMinim();
        
        
        loadAudio("heroplanet.mp3");   

        cv = new CubeVisual(this);
       
        
        
    }

    public void keyPressed()
    {
        if (key == ' ')
        {
        
            getAudioPlayer().play();
        }
        if (key == 'p')
        {
            getAudioPlayer().pause();
        }
        if (key == 's')
        {
            getAudioPlayer().cue(0);
        }
    }

    public void draw()
    {
        background(0);
        try
        {
            // Call this if you want to use FFT data
            calculateFFT(); 
        }
        catch(VisualException e)
        {
            e.printStackTrace();
        }
        // Call this is you want to use frequency bands
        calculateFrequencyBands(); 

        // Call this is you want to get the average amplitude
        calculateAverageAmplitude();        
        
        switch (key) 
        {
            case '1':
            {
                cv.render();
                break;
            }

        }

    }
}
