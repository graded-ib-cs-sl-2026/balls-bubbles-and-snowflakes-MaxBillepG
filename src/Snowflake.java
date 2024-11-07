

class Snowflake {

    /** The sketch that the snowfalake is inside */
    private Sketch s;
    /** The sketch that the snowflake is inside */
    private float radius;
    private float x;
    private float y;
     /** The number of pixels the snowflake moves right per frame */
    private float xSpeed;
    /** The number of pixels the snowflake moves down per frame */
    private float ySpeed;
     /** The color of the inside of the snowflake */
    private int fillColor;
    /** The color of the outside of the snowflake */
    private int borderColor;  

   // accessors for the radius, diameter, x, and y values 
    public Snowflake(Sketch sketch) {
        s = sketch;
        radius = 5;
        x = 450;
        y = 50;
        xSpeed = 1;
        ySpeed = -1;
        fillColor = s.color(0, 180, 255);
        borderColor = s.color(0, 0, 0);
    }

    /** Fully specified constructor to allow changes to size, position, speed */
    /** Does NOT allow changing color! Need to use setColors() for that. */
    public Snowflake(Sketch sketch, float radius, float x, float y, float xspeed, float yspeed) {
        this.s = sketch;
        this.radius = radius;
        this.x = x;
        this.y = y;
        this.xSpeed = xspeed;
        this.ySpeed = yspeed;
    }

    // Accessors (getters) go here

    public float getRadius() {
        return radius;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    /**
     * Draws the snowflake on the given sketch
     */
    public void draw() {
        s.line(x + radius, y, x - radius, y);
        s.line(x, y + radius, x, y - radius);
        s.line(x + radius * .707f, y + radius * .707f,
               x - radius * .707f, y - radius * .707f);
        s.line(x + radius * .707f, y - radius * .707f,
               x - radius * .707f, y + radius * .707f);
               s.fill(fillColor);    
               s.stroke(borderColor);  
    }

    // Setters that you need go here - by default, only colors 
    public void setColors(int fill, int border) {
        borderColor = border;
        fillColor = fill;
    }

    /**
     * Moves the snowflake so that the next time it draws it will be in a different place. 
     */
    /** I chose to copy the move method of the bubble because when comparing the movement 
     * of a ball and a bubble, it is clear that a snowflake is more similar to a bubble. */

     /**
     * Moves the snowflake so that the next time it draws it will be in a different place
     */
    public void move() {
        x = x + xSpeed;
        y = y + ySpeed;
        if (x > s.width - radius) {
            x = radius;
        } else if(x < radius) {
            x = s.width - radius;
        } else if (y > s.height - radius) {
            y = radius;
        } else if (y < radius) {
            y = s.height - radius;
        }
    }

}

 