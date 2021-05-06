package C19428962;

public class Intro
{
    MyVisual bk;

    public Intro(MyVisual bk)
    {
        this.bk = bk;
    }

    public void render()
    {
        bk.fill(1,255,255);
        bk.text("- Music Visualizer by Brandon Kelly or better known as C19428962",200,200);

        bk.text("- Slam the spacebar to start",300, 300);

        bk.text("- Use numbers 1-5 for the magic",400, 400);
    }

}
