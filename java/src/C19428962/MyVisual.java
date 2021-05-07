package C19428962;

import ie.tudublin.*;
import ie.tudublin.Visual;
import ie.tudublin.VisualException;

public class MyVisual extends Visual
{    
    
    CubeVisual cv;
    WaveForm wf;
    Sphere s;
    Circle c;
    Intro I;

    public void settings()
    {
        size(1024, 600, P3D);
        
    }

    public void setup()
    {
        startMinim();
        
        loadAudio("chill.mp3");   

        cv = new CubeVisual(this);
        wf = new WaveForm(this);
        s = new Sphere(this);
        c = new Circle(this);
        I= new Intro(this);
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

            case '2':
            {
                wf.render();
                
                break;
            }

            case '3':
            {
                s.render();
                break;
            }

            case '4':
            {
                c.render();
                break;
            }

            default:
            {
                I.render();
            }
        }

    }
}
