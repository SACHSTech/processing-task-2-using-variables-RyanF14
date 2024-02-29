import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
  //Define Variables below for window size
 

    size(800, 800);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(0, 0, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
/**
color(c1) = #FFFF00;
color(c2) = #00FF00;
colorc3 = #0000FF;
color c4 = #964B00;
*/
//float widthfloat = (float)width;
//float heightfloat = (float)height;

    fill(218, 160, 109);
    ellipse(height/2,width/2,height - 100,width - 100);
    fill(165, 42, 42);
    fill(218, 160, 109);
    

    fill(255,255,0);
    ellipse(height-(height-100), width/2, height - (height-100), width - (width - 100));
    ellipse(height - 100,width/2,height - (height-100),width - (width-100));
    

  

}


  }
