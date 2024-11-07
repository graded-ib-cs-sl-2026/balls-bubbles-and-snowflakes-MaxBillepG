

class Bubble {

     /** The sketch that the bubble is inside */
    private Sketch s;
    /** The sketch that the bubble is inside */
    private float radius;
    private float x;
    private float y;
     /** The number of pixels the bubble moves right per frame */
    private float xSpeed;
    /** The number of pixels the bubble moves down per frame */
    private float ySpeed;
     /** The color of the inside of the bubble */
    private int fillColor;
    /** The color of the outside of the bubble */
    private int borderColor;  
    /** In order to not get any any erros or red lines within my code I made
     *  and instance variable for every red line until there were none. After 
     * that I made sure that the type was float for all except "s" which has a sketch type */
    /** At first all of my code was working correctly but when my bubble appeared 
     * it was always black. My mistake was that the type for my instance variable for 
     * fillColor and borderColor was float, when it was supposed to be int. */
    

    // accessors for the radius, diameter, x, and y values 
    public Bubble(Sketch sketch) {
        s = sketch;
        radius = 15;
        x = 80;
        y = 120;
        xSpeed = 1;
        ySpeed = -3;
        fillColor = s.color(180, 180, 255);
        borderColor = s.color(0, 0, 0);
    }
    /** Fully specified constructor to allow changes to size, position, speed */
    /** Does NOT allow changing color! Need to use setColors() for that. */
    public Bubble(Sketch sketch, float Radius, float x, float y, float xspeed, float yspeed) {
        this.s = sketch;
        this.radius = Radius;
        this.x = x;
        this.y = y;
        this.xSpeed = xspeed;
        this.ySpeed = yspeed;
    }

     // Accessors (getters) go here
    public float getRadius() {
        return radius;
    }

    public float getDiameter() {
        return radius * 2;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    /**
     * Draws the bubble on the given sketch
     */
    public void draw() {
        s.stroke(borderColor);
        s.fill(fillColor);
        s.circle(x, y, radius*2);
    }

     // Setters that you need go here - by default, only colors
    public void setColors(int fill, int border) {
        borderColor = border;
        fillColor = fill;
    }

     /**
     * Moves the bubble so that the next time it draws it will be in a different place
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