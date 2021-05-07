# Music Visualiser Project

Name: Brandon Kelly

Student Number: C19428962

# Description of the assignment
For my assignment I created a music visualiser that would produce different shapes and visuals which would respond the music (the amplitude). My goal the assignment was to create something simple but effective. The simplistic design not only provides an colourful visual exerience but also lets you feel the song. The song I have chosen is one of my favourites to just get in the zone but higher mind frame. Both 2D and 3D shapes are used.
# Instructions

- Press the space key to start the music
- To pause the music press 'p'
- To resert the music press 's'
- Start the visuals press 1, 2, 3 , 4
- Press 5 for the info menu

# How it works

- This is the setup method it is responsible for playing the song, the MP3 file is called.

- I also initialized every object for each visual class.

- Java processing libraries and minim used together with OOP to create the diffrent visuals and shapes.


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


- Inheritance was used in this class 
public class MyVisual extends Visual
{    
    
    CubeVisual cv;
    WaveForm wf;
    Sphere s;
    Circle c;
    Intro I;





    
    





# What I am most proud of in the assignment





# Youtube Video
This is a [hyperlink](http://bryanduggan.org)

# Visuals

![An image](images/info.png)

![An image](images/cubes.png)

![An image](images/waveform.png)

![An image](images/sphere.png)

![An image](images/circle.png)







