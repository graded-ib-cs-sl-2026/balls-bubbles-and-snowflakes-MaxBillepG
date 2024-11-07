import processing.core.PApplet;

/** All of the code is written inside of the class */
public class Sketch extends PApplet {

    /** Represents one ball. Without it a ball wont work or appear */
    private Ball ball1;
    private Ball ball2;
    private Ball ball3;
    private Ball ball4;
    /** Represents one bubble. Without it a bubble wont work or appear */
    private Bubble bubble1;
    private Bubble bubble2;
    private Bubble bubble3;
    private Bubble bubble4;
    /** Represents one snowflake. Without it a snowflake wont work or appear */
    private Snowflake Snowflake1;
    private Snowflake Snowflake2;
    private Snowflake Snowflake3;
    private Snowflake Snowflake4;

    /**
     * This method can only be used to change the window size. It runs before the
     * window is created.
     */
    public void settings() {
        size(500, 500);
    }

    /**
     * Runs once at the beginning of the program, after the window is created. Use
     * this to initialize the sketch.
     */
    public void setup() {
        ball1 = new Ball(this);
        ball1.setColors(color(50, 255, 120), color(100, 195, 165));
        ball2 = new Ball(this, 15, 300, 250, 1, 2);
        ball2.setColors(color(150, 50, 80), color(235, 55, 240));
        ball3 = new Ball(this, 25, 150, 200, -2, -3);
        ball3.setColors(color(200, 85, 130), color(240, 195, 25));
        ball4 = new Ball(this, 35, 100, 300, -1, 3);
        ball4.setColors(color(100, 155, 255), color(240, 125, 255));
        /** This method gives the balls specific attributes. For the first one, 
         * you dont add any because it already has attributes attathced to it, 
         * but for the other you have to change the them because if not they are 
         * all going to look and be the same, meaning you will only be able to see one ball. */

        bubble1 = new Bubble(this, 35, 20, 120, 2, -4);
        bubble1.setColors(color(180, 180, 255, 0), color(0, 0, 0));
        bubble2 = new Bubble(this, 45, 200, 150, 2, -1);
        bubble2.setColors(color(180, 180, 255, 0), color(0, 0, 0));
        bubble3 = new Bubble(this, 10, 350, 100, 1, -1);
        bubble3.setColors(color(180, 180, 255, 0), color(0, 0, 0));
        bubble4 = new Bubble(this, 20, 300, 125, 3, -1);
        bubble4.setColors(color(180, 180, 255, 0), color(0, 0, 0));
        
        Snowflake1 = new Snowflake(this, 12, 275, 210, 1, 2);
        Snowflake1.setColors(color(0, 255, 255), color(0, 255, 255));
        Snowflake2 = new Snowflake(this, 17, 325, 220, 2, 2);
        Snowflake2.setColors(color(255, 0, 255), color(255, 0, 255));
        Snowflake3 = new Snowflake(this, 22, 375, 230, 3, 2);
        Snowflake3.setColors(color(255, 255, 0), color(255, 255, 0));
        Snowflake4 = new Snowflake(this, 27, 325, 240, 3, 1);
        Snowflake3.setColors(color(255, 255, 0), color(255, 255, 0));
    }
    /** Adding a fourth parameter to color will make the bubble transparent and depedning on the number
          *  Based on the number I choose, it will be more or less transparent */

    /**
     * This method runs over and over and over, approximately 60 times per second!
     * By moving objects a tiny bit each frame, you can get the appearance of
     * movement.
     */
    public void draw() {
        background(180, 180, 255);
        ball1.draw();
        ball1.move();
        ball2.draw();
        ball2.move();
        ball3.draw();
        ball3.move();
        ball4.draw();
        ball4.move();
        /** This piece of code is neccesary because even after creating a new instance and initializing
         * it wont make it appear because it has not been told to draw of move. This make the instance (Ball) 
         * actually appear in the screen. */

        bubble1.draw();
        bubble1.move();
        bubble2.draw();
        bubble2.move();
        bubble3.draw();
        bubble3.move();
        bubble4.draw();
        bubble4.move();
        /** This piece of code is neccesary because even after creating a new instance and initializing
         * it wont make it appear because it has not been told to draw of move. This make the instance (bubble) 
         * actually appear in the screen. */


        Snowflake1.draw();
        Snowflake1.move();
        Snowflake2.draw();
        Snowflake2.move();
        Snowflake3.draw();
        Snowflake3.move();
        Snowflake4.draw();
        Snowflake4.move();
        /** This piece of code is neccesary because even after creating a new instance and initializing
         * it wont make it appear because it has not been told to draw of move. This make the instance (Snowflake) 
         * actually appear in the screen. */


         /** This piece of code below made is calling the balls to bounce if they are colliding,
          * it also makes them switch their x and y speed.
          */
         if (ball1.isColliding(ball2)) {
            ball1.bounceBalls(ball2);
        }

        if (ball1.isColliding(ball3)) {
            ball1.bounceBalls(ball3); 
        }

        if (ball1.isColliding(ball4)) {
            ball1.bounceBalls(ball4);
        }

        if (ball2.isColliding(ball3)) {
            ball2.bounceBalls(ball3);
        }

        if (ball2.isColliding(ball4)) {
            ball2.bounceBalls(ball4);
        }

        if (ball3.isColliding(ball4)) {
            ball3.bounceBalls(ball4);
        }
    }

        

    /** All processing sketches have to use this main method. Don't touch this! */
    public static void main(String[] args) {
        PApplet.main("Sketch");
    }
}
